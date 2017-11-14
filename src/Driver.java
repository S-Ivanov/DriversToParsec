/**
 * Водитель
 * 
 */
public class Driver {
	public Driver(String lastName, String firstName, String middleName, String passportSeries, String passportNumber, String car) {
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
