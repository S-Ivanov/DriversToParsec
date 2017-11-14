import java.net.URL;
import java.util.Optional;

import ru.parsec.parsec3intergationservice.*;

public class DriversToParsecWriter {

	public DriversToParsecWriter(URL wsdlLocation, String domain, String userName, String password) {
		this.wsdlLocation = wsdlLocation;
		this.domain = domain;
		this.userName = userName;
		this.password = password;
	}
	
	public void AddDriver(Driver driver) {
		// TODO: �������� �� null: driver, ��� ��������
		
		IntegrationService integrationService = new IntegrationService(wsdlLocation);
		IntegrationServiceSoap integrationServiceSoap = integrationService.getIntegrationServiceSoap();
		SessionResult sessionResult = integrationServiceSoap.openSession(domain, userName, password);
		if (sessionResult.getResult() < 0) {
			// TODO: ������
		}
		else {
			String sessionID = sessionResult.getValue().getSessionID();
			
			// ����� ���� ����� � ���������� ���
			ArrayOfPerson persons = integrationServiceSoap.findPeople(sessionID, driver.getLastName(), driver.getFirstName(), driver.getMiddleName());
			
			// ����� ��������� ����� �������� ������� �� ���������� ������ ������� ��������
			Person existingPerson = null;
			for (Person person : persons.getPerson()) {
				ArrayOfExtraFieldValue extraFieldValues = integrationServiceSoap.getPersonExtraFieldValues(sessionID, person.getID());
				
				Optional<ExtraFieldValue> passportSeries = FindFieldValue(extraFieldValues, ParsecIdentifiers.PASSPORT_SERIES_ID);
				if (!passportSeries.isPresent() || !passportSeries.get().toString().equalsIgnoreCase(driver.getPassportSeries())) {
					continue;
				}

				Optional<ExtraFieldValue> passportNumber = FindFieldValue(extraFieldValues, ParsecIdentifiers.PASSPORT_NUMBER_ID);
				if (passportNumber.isPresent() && passportNumber.get().toString().equalsIgnoreCase(driver.getPassportNumber())) {
					existingPerson = person;
					break;
				}
			}
			
			String personID = null;
			boolean personExists = false;
			if (existingPerson == null) {
				// ���� ������� �� ������, ������� ���
				personID = integrationServiceSoap.createPerson(sessionID, DriverToPerson(driver)).getValue();
			}
			else {
				personID = existingPerson.getID();
				personExists = true;
			}
			
			// ����������� ������ ��� ������
			ArrayOfExtraFieldValue extraFieldValues = new ArrayOfExtraFieldValue();
			if (!personExists) {
				// ���� ������� �� ��� �������, ������� ��� ���������� ������
				AddExtraFieldValue(extraFieldValues, ParsecIdentifiers.PASSPORT_SERIES_ID, driver.getPassportSeries());
				AddExtraFieldValue(extraFieldValues, ParsecIdentifiers.PASSPORT_NUMBER_ID, driver.getPassportNumber());
			};
			// ����� � ����� ����������
			AddExtraFieldValue(extraFieldValues, ParsecIdentifiers.CAR_ID, driver.getCar());
			// TODO: ��������� ������
			// ...
			
			// �������� ������
			String personEditSessionID = integrationServiceSoap.openPersonEditingSession(sessionID, personID).getValue();
			integrationServiceSoap.setPersonExtraFieldValues(personEditSessionID, extraFieldValues);
			
			// �������� ������� ������
			integrationServiceSoap.closePersonEditingSession(personEditSessionID);
			integrationServiceSoap.closeSession(sessionID);
		}
	}
	
	Optional<ExtraFieldValue> FindFieldValue(ArrayOfExtraFieldValue extraFieldValues, String fieldID) {
		return extraFieldValues.getExtraFieldValue()
				.stream()
				.filter(t -> t.getTEMPLATEID().equals(fieldID))
				.findFirst();
	}
	
	void AddExtraFieldValue(ArrayOfExtraFieldValue extraFieldValues, String fieldID, Object fieldValue) {
		ExtraFieldValue extraFieldValue = new ExtraFieldValue();
		extraFieldValue.setTEMPLATEID(fieldID);
		extraFieldValue.setVALUE(fieldValue);
		extraFieldValues.getExtraFieldValue().add(extraFieldValue);
	}
	
	Person DriverToPerson(Driver driver) {
		Person person = new Person();
		person.setLASTNAME(driver.getLastName());
		person.setFIRSTNAME(driver.getFirstName());
		person.setMIDDLENAME(driver.getMiddleName());
		person.setORGID(ParsecIdentifiers.TEMP_CARDS_DEPARTMENT_ID);
		return person;
	}
	
	URL wsdlLocation;
	String domain, userName, password;
}
