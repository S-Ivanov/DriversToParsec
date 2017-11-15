
package ru.parsec.parsec3intergationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Event complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Event">
 *   &lt;complexContent>
 *     &lt;extension base="{http://parsec.ru/Parsec3IntergationService}BaseObject">
 *       &lt;sequence>
 *         &lt;element name="EventDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EventType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EventPersonIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventTerritoryIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Event", propOrder = {
    "eventDate",
    "eventType",
    "eventPersonIndex",
    "code",
    "eventTerritoryIndex"
})
public class Event
    extends BaseObject
{

    @XmlElement(name = "EventDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(name = "EventType")
    protected int eventType;
    @XmlElement(name = "EventPersonIndex")
    protected int eventPersonIndex;
    @XmlElement(name = "CODE")
    protected String code;
    @XmlElement(name = "EventTerritoryIndex")
    protected int eventTerritoryIndex;

    /**
     * Gets the value of the eventDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDate(XMLGregorianCalendar value) {
        this.eventDate = value;
    }

    /**
     * Gets the value of the eventType property.
     * 
     */
    public int getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     */
    public void setEventType(int value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the eventPersonIndex property.
     * 
     */
    public int getEventPersonIndex() {
        return eventPersonIndex;
    }

    /**
     * Sets the value of the eventPersonIndex property.
     * 
     */
    public void setEventPersonIndex(int value) {
        this.eventPersonIndex = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODE() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODE(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the eventTerritoryIndex property.
     * 
     */
    public int getEventTerritoryIndex() {
        return eventTerritoryIndex;
    }

    /**
     * Sets the value of the eventTerritoryIndex property.
     * 
     */
    public void setEventTerritoryIndex(int value) {
        this.eventTerritoryIndex = value;
    }

}
