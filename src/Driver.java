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
	 * @param car
	 *            Марка и номер автомобиля
	 * @param lastName
	 *            фамилия
	 */
	public Driver(String lastName, String firstName, String middleName, String passportSeries, String passportNumber,
			String car) {
		
//		if (lastName == null)
//			throw new IllegalArgumentException("");
		
		this.lastName = lastName;
		this.firstName = firstName;
		this.middleName = middleName;
		this.passportSeries = passportSeries;
		this.passportNumber = passportNumber;
		this.car = car;
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
	 * Марка и номер автомобиля
	 * 
	 */
	public String getCar() {
		return car;
	}

	String lastName, firstName, middleName, passportSeries, passportNumber, car;
}
