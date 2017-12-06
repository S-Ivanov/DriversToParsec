import ru.parsec.parsec3intergationservice.Person;

/**
 * Интерфейс проверки работника
 *
 * @author Иванов С.В.
 * 
 * Используется при поиске работника
 */
public interface FindPersonPredicate {
    
    /**
     * Проверить работника на соответствие некоторым критериям
     * 
     * @param person
     *      Работник
     * @return 
     *      true - если работник соответствует проверяемым критериям
     */
    Boolean test(Person person);
}
