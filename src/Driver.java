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
	 * @param car
	 *            Марка и номер автомобиля
	 */
	public Driver(String lastName, String firstName, String middleName, String passportSeries, String passportNumber, Date passportDate, String passportIssue, String address,
			String car) {
		
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
		
		this.lastName = lastName.trim();
		this.firstName = firstName.trim();
		this.middleName = middleName.trim();
		this.passportSeries = passportSeries.trim();
		this.passportNumber = passportNumber.trim();
		this.passportDate = passportDate;
		this.passportIssue = passportIssue.trim();
		this.address = address.trim();
		this.car = car.trim();
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
	 * Марка и номер автомобиля
	 * 
	 */
	public String getCar() {
		return car;
	}

	String lastName, firstName, middleName, passportSeries, passportNumber, passportIssue, address, car;
	Date passportDate;
}
