
package ru.parsec.parsec3intergationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ScheduleDay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleDay">
 *   &lt;complexContent>
 *     &lt;extension base="{http://parsec.ru/Parsec3IntergationService}BaseObject">
 *       &lt;sequence>
 *         &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="INDEX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="INTERVALS" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfTimeInterval" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleDay", propOrder = {
    "date",
    "index",
    "intervals"
})
@XmlSeeAlso({
    ScheduleFix.class
})
public class ScheduleDay
    extends BaseObject
{

    @XmlElement(name = "DATE", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "INDEX")
    protected int index;
    @XmlElement(name = "INTERVALS")
    protected ArrayOfTimeInterval intervals;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATE() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATE(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the index property.
     * 
     */
    public int getINDEX() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     */
    public void setINDEX(int value) {
        this.index = value;
    }

    /**
     * Gets the value of the intervals property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTimeInterval }
     *     
     */
    public ArrayOfTimeInterval getINTERVALS() {
        return intervals;
    }

    /**
     * Sets the value of the intervals property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTimeInterval }
     *     
     */
    public void setINTERVALS(ArrayOfTimeInterval value) {
        this.intervals = value;
    }

}
