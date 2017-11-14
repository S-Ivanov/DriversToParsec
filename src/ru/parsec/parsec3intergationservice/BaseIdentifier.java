
package ru.parsec.parsec3intergationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseIdentifier">
 *   &lt;complexContent>
 *     &lt;extension base="{http://parsec.ru/Parsec3IntergationService}BaseObject">
 *       &lt;sequence>
 *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PERSON_ID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="IS_PRIMARY" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseIdentifier", propOrder = {
    "code",
    "personid",
    "isprimary"
})
@XmlSeeAlso({
    Identifier.class
})
public class BaseIdentifier
    extends BaseObject
{

    @XmlElement(name = "CODE")
    protected String code;
    @XmlElement(name = "PERSON_ID", required = true)
    protected String personid;
    @XmlElement(name = "IS_PRIMARY")
    protected boolean isprimary;

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
     * Gets the value of the isprimary property.
     * 
     */
    public boolean isISPRIMARY() {
        return isprimary;
    }

    /**
     * Sets the value of the isprimary property.
     * 
     */
    public void setISPRIMARY(boolean value) {
        this.isprimary = value;
    }

}
