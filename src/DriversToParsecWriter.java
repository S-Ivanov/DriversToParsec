import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Date;
import java.util.Optional;

import ru.parsec.parsec3intergationservice.*;

/**
 * Запись информации о водителях в Парсек
 * 
 */
public class DriversToParsecWriter {

	/**
	 * Консольный тест
	 * 
	 */
	public static void main(String args[]) throws IOException {

		System.out.println("DriversToParsecWriter test");

		// создать объект для записи водителя
		URL wsdlLocation = new URL("");
		String userName = "";
		String password = "";
		DriversToParsecWriter driversToParsecWriter = new DriversToParsecWriter(wsdlLocation, userName, password);

		// создать объект водителя
		String lastName = "";
		String firstName = "";
		String middleName = "";
		String passportSeries = "";
		String passportNumber = "";
		Date passportDate = new Date();
		String passportIssue = "";
		String address = "";
		String client = "";
		String receiver = "";
		String car = "";
		int permitNumber = 1234;
		Driver driver = new Driver(lastName, firstName, middleName, passportSeries, passportNumber, passportDate,
				passportIssue, address, client, receiver, car, permitNumber);

		// добавить водителя в Парек
		driversToParsecWriter.AddDriver(driver);

		System.out.print("Press Enter to exit ...");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		@SuppressWarnings("unused")
		String line = in.readLine();
	}

	/**
	 * Конструктор
	 * 
	 * @param wsdlLocation
	 *            URL wsdl-файла
	 * @param userName
	 *            Имя пользователя Парсек
	 * @param password
	 *            Пароль пользователя Парсек
	 */
	public DriversToParsecWriter(URL wsdlLocation, String userName, String password) {

		if (wsdlLocation == null)
			throw new IllegalArgumentException("wsdlLocation");
		if (userName == null || userName.trim().length() == 0)
			throw new IllegalArgumentException("userName");
		if (password == null || password.trim().length() == 0)
			throw new IllegalArgumentException("password");

		this.wsdlLocation = wsdlLocation;
		this.userName = userName.trim();
		this.password = password.trim();
	}

	/**
	 * Запись информации о водителе в Парсек
	 * 
	 * Алгоритм записи определяется возможностями API интеграционного сервиса
	 * Парсек: {@link https://www.parsec.ru/sdk}
	 * 
	 * Порядок действий:
	 * <ol>
	 * <li>найти всех людей по совпадению с ФИО водителя</li>
	 * <li>среди найденных людей найти человека по совпадению серии и номера
	 * паспорта</li>
	 * <li>если нашли, то это и есть водитель, иначе записать водителя в
	 * Парсек</li>
	 * <li>дописать остальные данные водителя (когда и кем выдан паспорт, адрес,
	 * организация и т.д.)</li>
	 * </ol>
	 * 
	 * @param driver
	 *            Информация о водителе
	 */
	public void AddDriver(Driver driver) {

		if (driver == null)
			throw new IllegalArgumentException("driver");

		IntegrationService integrationService = new IntegrationService(wsdlLocation);
		IntegrationServiceSoap integrationServiceSoap = integrationService.getIntegrationServiceSoap();
		String sessionID = null, personEditSessionID = null;
		try {

			SessionResult sessionResult = integrationServiceSoap.openSession("", userName, password);
			if (sessionResult.getResult() < 0) {
				// ошибка открытия сеанса
				throw new UnsupportedOperationException();
			} else {
				sessionID = sessionResult.getValue().getSessionID();

				// ищем нужного человека
				Person person = FindPerson(integrationServiceSoap, sessionID, driver);

				// если человек не найден, добавим его
				String personID = person == null
						? integrationServiceSoap.createPerson(sessionID, DriverToPerson(driver)).getValue()
						: person.getID();

				// подготовить данные для записи
				ArrayOfExtraFieldValue extraFieldValues = new ArrayOfExtraFieldValue();
				if (person == null) {
					// если человек не был записан, добавим его паспортные
					// данные
					AddExtraFieldValue(extraFieldValues, ParsecIdentifiers.PASSPORT_SERIES_ID,
							driver.getPassportSeries());
					AddExtraFieldValue(extraFieldValues, ParsecIdentifiers.PASSPORT_NUMBER_ID,
							driver.getPassportNumber());
				}

				// остальные данные водителя:
				// дата выдачи паспорта
				AddExtraFieldValue(extraFieldValues, ParsecIdentifiers.PASSPORT_DATE_ID, driver.getPassportDate());
				// кем выдан паспорт
				AddExtraFieldValue(extraFieldValues, ParsecIdentifiers.PASSPORT_ISSUE_ID, driver.getPassportIssue());
				// адрес прописки
				AddExtraFieldValue(extraFieldValues, ParsecIdentifiers.PASSPORT_ADDRESS_ID, driver.getAddress());
				// наименование организации
				AddExtraFieldValue(extraFieldValues, ParsecIdentifiers.ORGANIZATION_ID, driver.getOrganization());
				// марка и номер автомобиля
				AddExtraFieldValue(extraFieldValues, ParsecIdentifiers.CAR_ID, driver.getCar());
				// номер пропуска
				AddExtraFieldValue(extraFieldValues, ParsecIdentifiers.PERMIT_NUMBER_ID, driver.getPermitNumber());

				// записать подготовленные данные
				personEditSessionID = integrationServiceSoap.openPersonEditingSession(sessionID, personID).getValue();
				integrationServiceSoap.setPersonExtraFieldValues(personEditSessionID, extraFieldValues);
			}

		} catch (Exception e) {
			throw e;
		} finally {

			// закрытие сеансов работы
			if (integrationServiceSoap != null) {
				if (personEditSessionID != null)
					integrationServiceSoap.closePersonEditingSession(personEditSessionID);
				if (sessionID != null)
					integrationServiceSoap.closeSession(sessionID);
			}
		}
	}

	/**
	 * Поиск информации о водителе в Парсек
	 * 
	 * @param integrationServiceSoap
	 *            Сервис
	 * @param sessionID
	 *            Идентификатор сессии
	 * @param driver
	 *            Водитель
	 * @return Учетная единица Парсек "человек"
	 */
	static Person FindPerson(IntegrationServiceSoap integrationServiceSoap, String sessionID, Driver driver) {

		// найти всех людей с указанными ФИО
		ArrayOfPerson persons = integrationServiceSoap.findPeople(sessionID, driver.getLastName(),
				driver.getFirstName(), driver.getMiddleName());

		// среди найденных людей пытаемся найти нужного человека по паспортным
		// данным
		Person foundPerson = null;
		for (Person person : persons.getPerson()) {
			ArrayOfExtraFieldValue extraFieldValues = integrationServiceSoap.getPersonExtraFieldValues(sessionID,
					person.getID());

			Optional<ExtraFieldValue> passportSeries = FindFieldValue(extraFieldValues,
					ParsecIdentifiers.PASSPORT_SERIES_ID);
			if (!passportSeries.isPresent()
					|| !passportSeries.get().toString().equalsIgnoreCase(driver.getPassportSeries())) {
				continue;
			}

			Optional<ExtraFieldValue> passportNumber = FindFieldValue(extraFieldValues,
					ParsecIdentifiers.PASSPORT_NUMBER_ID);
			if (passportNumber.isPresent()
					&& passportNumber.get().toString().equalsIgnoreCase(driver.getPassportNumber())) {
				foundPerson = person;
				break;
			}
		}
		return foundPerson;
	}

	/**
	 * Поиск значения дополнительного поля (номер паспорта, его серия, адрес и
	 * т.д.)
	 * 
	 * @param extraFieldValues
	 *            Список дополнительных полей
	 * @param fieldID
	 *            Идентификатор дополнительного поля
	 * @return Найденное значение
	 */
	static Optional<ExtraFieldValue> FindFieldValue(ArrayOfExtraFieldValue extraFieldValues, String fieldID) {
		return extraFieldValues.getExtraFieldValue().stream().filter(t -> t.getTEMPLATEID().equals(fieldID))
				.findFirst();
	}

	/**
	 * Добавление значения дополнительного поля (номер паспорта, его серия,
	 * адрес и т.д.)
	 * 
	 * @param extraFieldValues
	 *            Список дополнительных полей
	 * @param fieldID
	 *            Идентификатор дополнительного поля
	 * @param fieldValue
	 *            Значение дополнительного поля
	 */
	static void AddExtraFieldValue(ArrayOfExtraFieldValue extraFieldValues, String fieldID, Object fieldValue) {
		ExtraFieldValue extraFieldValue = new ExtraFieldValue();
		extraFieldValue.setTEMPLATEID(fieldID);
		extraFieldValue.setVALUE(fieldValue);
		extraFieldValues.getExtraFieldValue().add(extraFieldValue);
	}

	/**
	 * Создание учетной единицы Парсек "человек" на основе данных о водителе
	 * 
	 * @param driver
	 *            Водитель
	 * @return Учетная единица Парсек "человек"
	 */
	static Person DriverToPerson(Driver driver) {
		Person person = new Person();
		person.setLASTNAME(driver.getLastName());
		person.setFIRSTNAME(driver.getFirstName());
		person.setMIDDLENAME(driver.getMiddleName());
		person.setORGID(ParsecIdentifiers.TEMP_CARDS_DEPARTMENT_ID);
		return person;
	}

	URL wsdlLocation;
	String userName, password;
}
