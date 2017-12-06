import java.net.URL;
import ru.parsec.parsec3intergationservice.*;

/**
 * Базовый класс для работы с интеграционным сервисом Парсек
 * 
 * @author Иванов С.В.
 */
public abstract class ParsecBase {

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
    public ParsecBase(URL wsdlLocation, String userName, String password) {
        
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
     * Поиск работника 
     * 
     * @param lastName
     *          Фамилия
     * @param firstName
     *          Имя
     * @param middleName
     *          Отчество
     * @param condition
     *          Объект проверки соответствия работника нужным критериям
     * @return 
     *          Объект работника или null, если не найден
     * 
     * В метод передается объект, реализующий интерфейс проверки сотрудника FindPersonPredicate.
     * (Используется шаблон проектирования "Команда" - см. https://ru.wikipedia.org/wiki/Команда_(шаблон_проектирования)
     */
    protected Person FindPerson(String lastName, String firstName, String middleName, FindPersonPredicate condition) {
        
        // найти всех людей с указанными ФИО
        ArrayOfPerson persons = integrationServiceSoap.findPeople(sessionID, lastName, firstName, middleName);

        // среди найденных людей пытаемся найти нужного человека по табельному
        Person foundPerson = null;
        for (Person person : persons.getPerson()) {
            if (condition.test(person)) {
                foundPerson = person;
                break;
            }
        }
        return foundPerson;
    }

    /**
     * Открытие сессии работы с интеграционным сервисом Парсек
     */
    protected void OpenSession() {
        
        IntegrationService integrationService = new IntegrationService(wsdlLocation);
        integrationServiceSoap = integrationService.getIntegrationServiceSoap();
        SessionResult sessionResult = integrationServiceSoap.openSession("", userName, password);
        if (sessionResult.getResult() < 0) 
            // ошибка открытия сеанса
            throw new UnsupportedOperationException();

        sessionID = sessionResult.getValue().getSessionID();
    }
    
    /**
     * Закрытие сессии работы с интеграционным сервисом Парсек
     */
    protected void CloseSession() {
        
        // закрытие сеанса работы
        if (integrationServiceSoap != null && sessionID != null) 
            integrationServiceSoap.closeSession(sessionID);
    }
    
    /**
     * Ссылка на сервис
     */
    protected IntegrationServiceSoap integrationServiceSoap;
    
    /**
     * Внутренний идентификатор сессии
     */
    protected String sessionID;
    
    URL wsdlLocation;
    String userName, password;
}
