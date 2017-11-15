
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
 *         &lt;element name="GetPersonResult" type="{http://parsec.ru/Parsec3IntergationService}PersonWithPhoto" minOccurs="0"/>
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
    "getPersonResult"
})
@XmlRootElement(name = "GetPersonResponse")
public class GetPersonResponse {

    @XmlElement(name = "GetPersonResult")
    protected PersonWithPhoto getPersonResult;

    /**
     * Gets the value of the getPersonResult property.
     * 
     * @return
     *     possible object is
     *     {@link PersonWithPhoto }
     *     
     */
    public PersonWithPhoto getGetPersonResult() {
        return getPersonResult;
    }

    /**
     * Sets the value of the getPersonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonWithPhoto }
     *     
     */
    public void setGetPersonResult(PersonWithPhoto value) {
        this.getPersonResult = value;
    }

}
