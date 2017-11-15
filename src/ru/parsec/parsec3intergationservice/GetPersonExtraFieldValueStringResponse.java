
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
 *         &lt;element name="GetPersonExtraFieldValueStringResult" type="{http://parsec.ru/Parsec3IntergationService}StringResult" minOccurs="0"/>
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
    "getPersonExtraFieldValueStringResult"
})
@XmlRootElement(name = "GetPersonExtraFieldValueStringResponse")
public class GetPersonExtraFieldValueStringResponse {

    @XmlElement(name = "GetPersonExtraFieldValueStringResult")
    protected StringResult getPersonExtraFieldValueStringResult;

    /**
     * Gets the value of the getPersonExtraFieldValueStringResult property.
     * 
     * @return
     *     possible object is
     *     {@link StringResult }
     *     
     */
    public StringResult getGetPersonExtraFieldValueStringResult() {
        return getPersonExtraFieldValueStringResult;
    }

    /**
     * Sets the value of the getPersonExtraFieldValueStringResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringResult }
     *     
     */
    public void setGetPersonExtraFieldValueStringResult(StringResult value) {
        this.getPersonExtraFieldValueStringResult = value;
    }

}