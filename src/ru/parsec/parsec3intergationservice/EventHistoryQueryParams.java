
package ru.parsec.parsec3intergationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EventHistoryQueryParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventHistoryQueryParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDs" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfGuid" minOccurs="0"/>
 *         &lt;element name="ParentEventID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="StartTime0" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndTime0" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="StartTime1" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndTime1" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Territories" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfGuid" minOccurs="0"/>
 *         &lt;element name="Operators" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfGuid" minOccurs="0"/>
 *         &lt;element name="TransactionTypes" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfUnsignedInt" minOccurs="0"/>
 *         &lt;element name="Organizations" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfGuid" minOccurs="0"/>
 *         &lt;element name="Users" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfGuid" minOccurs="0"/>
 *         &lt;element name="EventsWithoutUser" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MaxResultSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventHistoryQueryParams", propOrder = {
    "iDs",
    "parentEventID",
    "startDate",
    "endDate",
    "startTime0",
    "endTime0",
    "startTime1",
    "endTime1",
    "territories",
    "operators",
    "transactionTypes",
    "organizations",
    "users",
    "eventsWithoutUser",
    "maxResultSize"
})
public class EventHistoryQueryParams {

    @XmlElement(name = "IDs")
    protected ArrayOfGuid iDs;
    @XmlElement(name = "ParentEventID", required = true, nillable = true)
    protected String parentEventID;
    @XmlElement(name = "StartDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "StartTime0", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime0;
    @XmlElement(name = "EndTime0", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime0;
    @XmlElement(name = "StartTime1", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime1;
    @XmlElement(name = "EndTime1", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime1;
    @XmlElement(name = "Territories")
    protected ArrayOfGuid territories;
    @XmlElement(name = "Operators")
    protected ArrayOfGuid operators;
    @XmlElement(name = "TransactionTypes")
    protected ArrayOfUnsignedInt transactionTypes;
    @XmlElement(name = "Organizations")
    protected ArrayOfGuid organizations;
    @XmlElement(name = "Users")
    protected ArrayOfGuid users;
    @XmlElement(name = "EventsWithoutUser", required = true, type = Boolean.class, nillable = true)
    protected Boolean eventsWithoutUser;
    @XmlElement(name = "MaxResultSize", required = true, type = Integer.class, nillable = true)
    protected Integer maxResultSize;

    /**
     * Gets the value of the iDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuid }
     *     
     */
    public ArrayOfGuid getIDs() {
        return iDs;
    }

    /**
     * Sets the value of the iDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuid }
     *     
     */
    public void setIDs(ArrayOfGuid value) {
        this.iDs = value;
    }

    /**
     * Gets the value of the parentEventID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentEventID() {
        return parentEventID;
    }

    /**
     * Sets the value of the parentEventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentEventID(String value) {
        this.parentEventID = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the startTime0 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime0() {
        return startTime0;
    }

    /**
     * Sets the value of the startTime0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime0(XMLGregorianCalendar value) {
        this.startTime0 = value;
    }

    /**
     * Gets the value of the endTime0 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime0() {
        return endTime0;
    }

    /**
     * Sets the value of the endTime0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime0(XMLGregorianCalendar value) {
        this.endTime0 = value;
    }

    /**
     * Gets the value of the startTime1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime1() {
        return startTime1;
    }

    /**
     * Sets the value of the startTime1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime1(XMLGregorianCalendar value) {
        this.startTime1 = value;
    }

    /**
     * Gets the value of the endTime1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime1() {
        return endTime1;
    }

    /**
     * Sets the value of the endTime1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime1(XMLGregorianCalendar value) {
        this.endTime1 = value;
    }

    /**
     * Gets the value of the territories property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuid }
     *     
     */
    public ArrayOfGuid getTerritories() {
        return territories;
    }

    /**
     * Sets the value of the territories property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuid }
     *     
     */
    public void setTerritories(ArrayOfGuid value) {
        this.territories = value;
    }

    /**
     * Gets the value of the operators property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuid }
     *     
     */
    public ArrayOfGuid getOperators() {
        return operators;
    }

    /**
     * Sets the value of the operators property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuid }
     *     
     */
    public void setOperators(ArrayOfGuid value) {
        this.operators = value;
    }

    /**
     * Gets the value of the transactionTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUnsignedInt }
     *     
     */
    public ArrayOfUnsignedInt getTransactionTypes() {
        return transactionTypes;
    }

    /**
     * Sets the value of the transactionTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUnsignedInt }
     *     
     */
    public void setTransactionTypes(ArrayOfUnsignedInt value) {
        this.transactionTypes = value;
    }

    /**
     * Gets the value of the organizations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuid }
     *     
     */
    public ArrayOfGuid getOrganizations() {
        return organizations;
    }

    /**
     * Sets the value of the organizations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuid }
     *     
     */
    public void setOrganizations(ArrayOfGuid value) {
        this.organizations = value;
    }

    /**
     * Gets the value of the users property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuid }
     *     
     */
    public ArrayOfGuid getUsers() {
        return users;
    }

    /**
     * Sets the value of the users property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuid }
     *     
     */
    public void setUsers(ArrayOfGuid value) {
        this.users = value;
    }

    /**
     * Gets the value of the eventsWithoutUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEventsWithoutUser() {
        return eventsWithoutUser;
    }

    /**
     * Sets the value of the eventsWithoutUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEventsWithoutUser(Boolean value) {
        this.eventsWithoutUser = value;
    }

    /**
     * Gets the value of the maxResultSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxResultSize() {
        return maxResultSize;
    }

    /**
     * Sets the value of the maxResultSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxResultSize(Integer value) {
        this.maxResultSize = value;
    }

}
