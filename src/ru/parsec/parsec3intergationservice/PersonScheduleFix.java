
package ru.parsec.parsec3intergationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PersonScheduleFix complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonScheduleFix">
 *   &lt;complexContent>
 *     &lt;extension base="{http://parsec.ru/Parsec3IntergationService}BaseObject">
 *       &lt;sequence>
 *         &lt;element name="FIX_ID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="PERSON_ID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="TYPE_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="START" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="END" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonScheduleFix", propOrder = {
    "fixid",
    "personid",
    "typeid",
    "start",
    "end"
})
public class PersonScheduleFix
    extends BaseObject
{

    @XmlElement(name = "FIX_ID", required = true)
    protected String fixid;
    @XmlElement(name = "PERSON_ID", required = true)
    protected String personid;
    @XmlElement(name = "TYPE_ID")
    protected int typeid;
    @XmlElement(name = "START", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar start;
    @XmlElement(name = "END", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar end;

    /**
     * Gets the value of the fixid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIXID() {
        return fixid;
    }

    /**
     * Sets the value of the fixid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIXID(String value) {
        this.fixid = value;
    }

    /**
     * Gets the value of the personid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERSONID() {
        return personid;
    }

    /**
     * Sets the value of the personid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERSONID(String value) {
        this.personid = value;
    }

    /**
     * Gets the value of the typeid property.
     * 
     */
    public int getTYPEID() {
        return typeid;
    }

    /**
     * Sets the value of the typeid property.
     * 
     */
    public void setTYPEID(int value) {
        this.typeid = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSTART() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSTART(XMLGregorianCalendar value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEND() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEND(XMLGregorianCalendar value) {
        this.end = value;
    }

}
