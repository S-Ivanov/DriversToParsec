
package ru.parsec.parsec3intergationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="fix" type="{http://parsec.ru/Parsec3IntergationService}PersonScheduleFix" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionID",
    "fix"
})
@XmlRootElement(name = "AddPersonScheduleFix")
public class AddPersonScheduleFix {

    @XmlElement(required = true)
    protected String sessionID;
    protected PersonScheduleFix fix;

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Gets the value of the fix property.
     * 
     * @return
     *     possible object is
     *     {@link PersonScheduleFix }
     *     
     */
    public PersonScheduleFix getFix() {
        return fix;
    }

    /**
     * Sets the value of the fix property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonScheduleFix }
     *     
     */
    public void setFix(PersonScheduleFix value) {
        this.fix = value;
    }

}
