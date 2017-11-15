
package ru.parsec.parsec3intergationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VisitorRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VisitorRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ORGUNIT_ID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="PERSON_ID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="PERSON_INFO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PURPOSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ADMIT_START" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ADMIT_END" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisitorRequest", propOrder = {
    "id",
    "number",
    "date",
    "orgunitid",
    "personid",
    "personinfo",
    "purpose",
    "status",
    "admitstart",
    "admitend"
})
public class VisitorRequest {

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "NUMBER")
    protected int number;
    @XmlElement(name = "DATE", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "ORGUNIT_ID", required = true)
    protected String orgunitid;
    @XmlElement(name = "PERSON_ID", required = true)
    protected String personid;
    @XmlElement(name = "PERSON_INFO")
    protected String personinfo;
    @XmlElement(name = "PURPOSE")
    protected String purpose;
    @XmlElement(name = "STATUS")
    protected int status;
    @XmlElement(name = "ADMIT_START", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar admitstart;
    @XmlElement(name = "ADMIT_END", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar admitend;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the number property.
     * 
     */
    public int getNUMBER() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     */
    public void setNUMBER(int value) {
        this.number = value;
    }

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
     * Gets the value of the orgunitid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORGUNITID() {
        return orgunitid;
    }

    /**
     * Sets the value of the orgunitid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORGUNITID(String value) {
        this.orgunitid = value;
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
     * Gets the value of the personinfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERSONINFO() {
        return personinfo;
    }

    /**
     * Sets the value of the personinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERSONINFO(String value) {
        this.personinfo = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPURPOSE() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPURPOSE(String value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the status property.
     * 
     */
    public int getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setSTATUS(int value) {
        this.status = value;
    }

    /**
     * Gets the value of the admitstart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getADMITSTART() {
        return admitstart;
    }

    /**
     * Sets the value of the admitstart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setADMITSTART(XMLGregorianCalendar value) {
        this.admitstart = value;
    }

    /**
     * Gets the value of the admitend property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getADMITEND() {
        return admitend;
    }

    /**
     * Sets the value of the admitend property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setADMITEND(XMLGregorianCalendar value) {
        this.admitend = value;
    }

}
