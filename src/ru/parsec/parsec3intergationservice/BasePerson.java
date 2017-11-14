
package ru.parsec.parsec3intergationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasePerson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasePerson">
 *   &lt;complexContent>
 *     &lt;extension base="{http://parsec.ru/Parsec3IntergationService}BaseObject">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="FIRST_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LAST_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MIDDLE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TAB_NUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasePerson", propOrder = {
    "id",
    "firstname",
    "lastname",
    "middlename",
    "tabnum"
})
@XmlSeeAlso({
    Person.class
})
public class BasePerson
    extends BaseObject
{

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "FIRST_NAME")
    protected String firstname;
    @XmlElement(name = "LAST_NAME")
    protected String lastname;
    @XmlElement(name = "MIDDLE_NAME")
    protected String middlename;
    @XmlElement(name = "TAB_NUM")
    protected String tabnum;

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
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIRSTNAME() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIRSTNAME(String value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLASTNAME() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLASTNAME(String value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the middlename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIDDLENAME() {
        return middlename;
    }

    /**
     * Sets the value of the middlename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIDDLENAME(String value) {
        this.middlename = value;
    }

    /**
     * Gets the value of the tabnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTABNUM() {
        return tabnum;
    }

    /**
     * Sets the value of the tabnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTABNUM(String value) {
        this.tabnum = value;
    }

}
