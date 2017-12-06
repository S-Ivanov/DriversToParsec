import java.util.Date;

/**
 * Водитель
 * 
 * @author Иванов С.В.
 */
public class Driver {

	/**
	 * Конструктор
	 * 
	 * @param driversFIO
	 *            ФИО водителей через запятую
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
	public Driver(String driversFIO, String passportSeries, String passportNumber,
			String passportDate, String passportIssue, String address, String client, String receiver, String car,
			int permitNumber) {

		// проверить корректность параметров
		CheckParameters(driversFIO, passportSeries, passportNumber, passportDate, passportIssue,
				address, client, receiver, car, permitNumber);

		this.driversFIO = driversFIO.trim();
		this.passportSeries = passportSeries.trim();
		this.passportNumber = passportNumber.trim();
		this.passportDate = passportDate.trim();
		this.passportIssue = passportIssue.trim();
		this.address = address.trim();
		this.organization = getOrganization(client, receiver);
		this.car = car.trim();
		this.permitNumber = permitNumber;
                
                // выделить ФИО основного водителя для идентификации в Парсек
                TranslateMainDriver(this.driversFIO);
	}

	/**
	 * Проверка корректности параметров конструктора
	 * 
	 * @param driversFIO
	 *            ФИО водителей через запятую
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
	void CheckParameters(String driversFIO, String passportSeries,
			String passportNumber, String passportDate, String passportIssue, String address, String client,
			String receiver, String car, int permitNumber) {

		if (driversFIO == null || driversFIO.trim().length() == 0)
			throw new IllegalArgumentException("driversFIO");
		if (passportSeries == null || passportSeries.trim().length() == 0)
			throw new IllegalArgumentException("passportSeries");
		if (passportNumber == null || passportNumber.trim().length() == 0)
			throw new IllegalArgumentException("passportNumber");
		if (passportDate == null || passportDate.trim().length() == 0)
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
	 * Выделить ФИО основного водителя для идентификации в Парсек
	 * 
	 * @param driversFIO
	 *            ФИО водителей через запятую
         * 
         * Заполняются поля lastName, firstName, middleName
	 */
        void TranslateMainDriver(String driversFIO) {
            
            String[] drivers = driversFIO.split(",");
            String[] mainDriverFIO = drivers[0].split(" ");
            lastName = mainDriverFIO[0];
            if (mainDriverFIO.length == 3) {
                firstName = mainDriverFIO[1];
                middleName = mainDriverFIO[2];
            } else if (mainDriverFIO.length == 2) {
                String[] initials = mainDriverFIO[1].split("\\.");
                if (initials.length == 1)
                    firstName = mainDriverFIO[1];
                else {
                    firstName = initials[0] + ".";
                    middleName = initials[1] + ".";
                }
            }
        }
        
	/**
	 * Формировать наименование организации
	 * 
	 * @param client
	 *            Покупатель
	 * @param receiver
	 *            Грузополучатель
         * @return 
         *            Наименование организации  
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
	 * ФИО водителей через запятую
	 * 
	 */
	public String getDriversFIO() {
		return driversFIO;
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
	public String getPassportDate() {
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

	String lastName, firstName, middleName, driversFIO, passportSeries, passportDate, passportNumber, passportIssue, address, organization, car;
	int permitNumber;
}
