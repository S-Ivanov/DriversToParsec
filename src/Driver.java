/**
 * ��������
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
     * �������
     * 
     */
    public String getLastName() {
        return lastName;
    }
	
    /**
     * ���
     * 
     */
    public String getFirstName() {
        return firstName;
    }
	
    /**
     * ��������
     * 
     */
    public String getMiddleName() {
        return middleName;
    }
	
    /**
     * ����� ��������
     * 
     */
    public String getPassportSeries() {
        return passportSeries;
    }
	
    /**
     * ����� ��������
     * 
     */
    public String getPassportNumber() {
        return passportNumber;
    }
	
    /**
     * ����� � ����� ����������
     * 
     */
    public String getCar() {
        return car;
    }
	
	String lastName, firstName, middleName, passportSeries, passportNumber, car;
}
