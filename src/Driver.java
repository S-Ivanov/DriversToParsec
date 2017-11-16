import java.util.Date;

/**
 * Водитель
 * 
 */
public class Driver {

	/**
	 * Конструктор
	 * 
	 * @param lastName
	 *            Фамилия
	 * @param firstName
	 *            Имя
	 * @param middleName
	 *            Отчество
	 * @param passportSeries
	 *            Серия паспорта
	 * @param passportNumber
	 *            Номер паспорта
	 * @param passportDate
	 *            Дата выдачи паспорта
	 * @param passportIssue
	 *            Кем выдан паспорт
	 * @param address
	 *            Адрес прописки
	 * @param client
	 *            Покупатель
	 * @param receiver
	 *            Грузополучатель
	 * @param car
	 *            Марка и номер автомобиля
	 * @param permitNumber
	 *            Номер пропуска
	 */
	public Driver(String lastName, String firstName, String middleName, String passportSeries, String passportNumber,
			Date passportDate, String passportIssue, String address, String client, String receiver, String car,
			int permitNumber) {

		// проверить корректность параметров
		CheckParameters(lastName, firstName, middleName, passportSeries, passportNumber, passportDate, passportIssue,
				address, client, receiver, car, permitNumber);

		this.lastName = lastName.trim();
		this.firstName = firstName.trim();
		this.middleName = middleName.trim();
		this.passportSeries = passportSeries.trim();
		this.passportNumber = passportNumber.trim();
		this.passportDate = passportDate;
		this.passportIssue = passportIssue.trim();
		this.address = address.trim();
		this.organization = getOrganization(client, receiver);
		this.car = car.trim();
		this.permitNumber = permitNumber;
	}

	/**
	 * Проверка корректности параметров конструктора
	 * 
	 * @param lastName
	 *            Фамилия
	 * @param firstName
	 *            Имя
	 * @param middleName
	 *            Отчество
	 * @param passportSeries
	 *            Серия паспорта
	 * @param passportNumber
	 *            Номер паспорта
	 * @param passportDate
	 *            Дата выдачи паспорта
	 * @param passportIssue
	 *            Кем выдан паспорт
	 * @param address
	 *            Адрес прописки
	 * @param client
	 *            Покупатель
	 * @param receiver
	 *            Грузополучатель
	 * @param car
	 *            Марка и номер автомобиля
	 * @param permitNumber
	 *            Номер пропуска
	 */
	void CheckParameters(String lastName, String firstName, String middleName, String passportSeries,
			String passportNumber, Date passportDate, String passportIssue, String address, String client,
			String receiver, String car, int permitNumber) {

		if (lastName == null || lastName.trim().length() == 0)
			throw new IllegalArgumentException("lastName");
		if (firstName == null || firstName.trim().length() == 0)
			throw new IllegalArgumentException("firstName");
		if (middleName == null || middleName.trim().length() == 0)
			throw new IllegalArgumentException("middleName");
		if (passportSeries == null || passportSeries.trim().length() == 0)
			throw new IllegalArgumentException("passportSeries");
		if (passportNumber == null || passportNumber.trim().length() == 0)
			throw new IllegalArgumentException("passportNumber");
		if (passportDate == null)
			throw new IllegalArgumentException("passportDate");
		if (passportIssue == null || passportIssue.trim().length() == 0)
			throw new IllegalArgumentException("passportIssue");
		if (address == null || address.trim().length() == 0)
			throw new IllegalArgumentException("address");
		if (car == null || car.trim().length() == 0)
			throw new IllegalArgumentException("car");
		if (permitNumber <= 0)
			throw new IllegalArgumentException("permitNumber");
	}

	/**
	 * Формировать наименование организации
	 * 
	 * @param client
	 *            Покупатель
	 * @param receiver
	 *            Грузополучатель
	 */
	public static String getOrganization(String client, String receiver) {
		
		if ((client == null || client.trim().length() == 0) && (receiver == null || receiver.trim().length() == 0))
			throw new IllegalArgumentException("client, receiver");

		if (client == null || client.trim().length() == 0)
			return receiver;
		else if (receiver == null || receiver.trim().length() == 0)
			return client;
		else if (client.equalsIgnoreCase(receiver))
			return client;
		else
			return client + " / " + receiver;
	}

	/**
	 * Фамилия
	 * 
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Имя
	 * 
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Отчество
	 * 
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * Серия паспорта
	 * 
	 */
	public String getPassportSeries() {
		return passportSeries;
	}

	/**
	 * Номер паспорта
	 * 
	 */
	public String getPassportNumber() {
		return passportNumber;
	}

	/**
	 * Дата выдачи паспорта
	 * 
	 */
	public Date getPassportDate() {
		return passportDate;
	}

	/**
	 * Кем выдан паспорт
	 * 
	 */
	public String getPassportIssue() {
		return passportIssue;
	}

	/**
	 * Адрес прописки
	 * 
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Наименование организации
	 * 
	 */
	public String getOrganization() {
		return organization;
	}

	/**
	 * Марка и номер автомобиля
	 * 
	 */
	public String getCar() {
		return car;
	}

	/**
	 * Номер пропуска
	 * 
	 */
	public int getPermitNumber() {
		return permitNumber;
	}

	String lastName, firstName, middleName, passportSeries, passportNumber, passportIssue, address, organization, car;
	int permitNumber;
	Date passportDate;
}
