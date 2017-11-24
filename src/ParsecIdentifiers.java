/**
 * Идентификаторы Парсек
 * 
 * ****** Скрипт для команды SelectTopNRows из среды SSMS  ******
 * SELECT TOP 1000 [FIELD_TEMPLATE_ID]
 *      ,[FIELD_TEMPLATE_OWNER]
 *      ,[FIELD_TEMPLATE_NAME]
 *      ,[FIELD_TEMPLATE_VALUE]
 *      ,[TYPE_ID]
 *  FROM [Parsec3].[dbo].[EXTRA_FIELD_TEMPLATE]
 */
public final class ParsecIdentifiers {
	/**
	 * Идентификатор серии паспорта
	 * 
	 */
	public static final String PASSPORT_SERIES_ID = "C19ADC48-B752-4FB5-9FC5-3CB73FF3F1C3";

	/**
	 * Идентификатор номера паспорта
	 * 
	 */
	public static final String PASSPORT_NUMBER_ID = "7B4F2AC3-5735-425F-82D6-5EBEA4980578";

	/**
	 * Идентификатор даты выдачи паспорта
	 * 
	 */
	public static final String PASSPORT_DATE_ID = "39C1AC9B-B867-4597-B9EE-226C89C70091";

	/**
	 * Идентификатор кем выдан паспорт
	 * 
	 */
	public static final String PASSPORT_ISSUE_ID = "5C60F8D6-35A7-4456-A62B-C67FBBC10C9B";

	/**
	 * Идентификатор адреса прописки
	 * 
	 */
	public static final String PASSPORT_ADDRESS_ID = "E875079B-AFA8-4B89-8BA5-D309045A678E";

	/**
	 * Идентификатор наименования организации
	 * 
	 */
	public static final String ORGANIZATION_ID = "46E7C0E9-F9CA-4A4C-B7C0-4BE528CD3ABC";

	/**
	 * Идентификатор марки и номера автомобиля
	 * 
	 */
	public static final String CAR_ID = "7C12A464-9031-4739-8664-90E5299669EA";

	/**
	 * Идентификатор номера пропуска
	 * 
	 */
	public static final String PERMIT_NUMBER_ID = "F4E7AF89-317B-4E19-87BD-39AFA171BBE0";

	/**
	 * Идентификатор виртуального подразделения "Временные пропуска"
	 * 
         * ****** Скрипт для команды SelectTopNRows из среды SSMS  ******
         *  SELECT TOP 1000 [ORG_ID]
         *      ,[ORG_NAME]
         *  FROM [Parsec3].[dbo].[ORGANIZATION]
         * order by [ORG_NAME]
	 */
	public static final String TEMP_CARDS_DEPARTMENT_ID = "14625818-CCBD-452B-86F1-5B0AB346752F";
}
