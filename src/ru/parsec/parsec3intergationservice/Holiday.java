
package ru.parsec.parsec3intergationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Holiday complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Holiday">
 *   &lt;complexContent>
 *     &lt;extension base="{http://parsec.ru/Parsec3IntergationService}BaseObject">
 *       &lt;sequence>
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MONTH" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="DAY" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Holiday", propOrder = {
    "name",
    "month",
    "day"
})
public class Holiday
    extends BaseObject
{

    @XmlElement(name = "NAME")
    protected String name;
    @XmlElement(name = "MONTH")
    @XmlSchemaType(name = "unsignedByte")
    protected short month;
    @XmlElement(name = "DAY")
    @XmlSchemaType(name = "unsignedByte")
    protected short day;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the month property.
     * 
     */
    public short getMONTH() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     */
    public void setMONTH(short value) {
        this.month = value;
    }

    /**
     * Gets the value of the day property.
     * 
     */
    public short getDAY() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     */
    public void setDAY(short value) {
        this.day = value;
    }

}
