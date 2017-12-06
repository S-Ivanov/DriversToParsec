import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import ru.parsec.parsec3intergationservice.*;

/**
 * Загрузка фотографий из Парсек
 * 
 * @author Иванов С.В.
 */
public class ParsecPhotoLoader extends ParsecBase {
    
    /**
     * Консольный тест
     * 
     */
    public static void main(String args[]) throws IOException {
        
        System.out.println("ParsecPhotoLoader test");
        
        URL wsdlLocation = new URL("http://drgskd01:10101/IntegrationService/IntegrationService.asmx");
        String userName = "userName";
        String password = "password";
        ParsecPhotoLoader parsecPhotoLoader = new ParsecPhotoLoader(wsdlLocation, userName, password);
        // поиск работников по ФИО не зависит от регистра
        byte[] photo = parsecPhotoLoader.LoadPhoto(2843, "иванов", "сергей");
        if (photo == null)
            System.out.println("None");
        else {
         
            try (FileOutputStream fos = new FileOutputStream("C:\\TEMP\\1.jpg")) {
                fos.write(photo);
                fos.close();
            }
            System.out.println("Ok");
        }
    }
    
    /**
     * Конструктор
     * 
     * @param wsdlLocation
     *            URL wsdl-файла
     * @param userName
     *            Имя пользователя Парсек с правами на добавление/изменение людей
     * @param password
     *            Пароль пользователя Парсек с правами на добавление/изменение людей
     */
    public ParsecPhotoLoader(URL wsdlLocation, String userName, String password) {
        super(wsdlLocation, userName, password);
    }
    
    /**
     * Загрузить фотографию работника
     * 
     * @param tabNum
     *      Табельный номер
     * @param lastName
     *      Фамилия
     * @return 
     *      Массив байт в формате JPEG
     */
    public byte[] LoadPhoto(int tabNum, String lastName) {
        return LoadPhoto(tabNum, lastName, null, null);
    }
    
    /**
     * Загрузить фотографию работника
     * 
     * @param tabNum
     *      Табельный номер
     * @param lastName
     *      Фамилия
     * @param firstName
     *      Имя
     * @return 
     *      Массив байт в формате JPEG
     */
    public byte[] LoadPhoto(int tabNum, String lastName, String firstName) {
        return LoadPhoto(tabNum, lastName, firstName, null);
    }
    
    /**
     * Загрузить фотографию работника
     * 
     * @param tabNum
     *      Табельный номер
     * @param lastName
     *      Фамилия
     * @param firstName
     *      Имя
     * @param middleName
     *      Отчество
     * @return 
     *      Массив байт в формате JPEG
     */
    public byte[] LoadPhoto(int tabNum, String lastName, String firstName, String middleName) {
        
        // проверить, чтобы было хоть что-то из ФИО
        if ((lastName == null || lastName.trim().length() == 0) && (firstName == null || firstName.trim().length() == 0) && (middleName == null || middleName.trim().length() == 0))
            throw new IllegalArgumentException();
        
        super.OpenSession();
        
        try {
            
            // ищем нужного человека
            final String tabNumStr = Integer.toString(tabNum);
            Person person = FindPerson(lastName, firstName, middleName, new FindPersonPredicate() {
                public Boolean test(Person person) {
                    return person.getTABNUM().equals(tabNumStr);
                }
            });
            if (person != null) {
                PersonWithPhoto personWithPhoto = integrationServiceSoap.getPerson(sessionID, person.getID());
                if (personWithPhoto != null)
                    return personWithPhoto.getPHOTO();
            }
        }
        finally {
            
            super.CloseSession();
        }
        
        return null;
    }
}
