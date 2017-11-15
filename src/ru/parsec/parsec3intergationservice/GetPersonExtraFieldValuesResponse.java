
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
 *         &lt;element name="GetPersonExtraFieldValuesResult" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfExtraFieldValue" minOccurs="0"/>
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
    "getPersonExtraFieldValuesResult"
})
@XmlRootElement(name = "GetPersonExtraFieldValuesResponse")
public class GetPersonExtraFieldValuesResponse {

    @XmlElement(name = "GetPersonExtraFieldValuesResult")
    protected ArrayOfExtraFieldValue getPersonExtraFieldValuesResult;

    /**
     * Gets the value of the getPersonExtraFieldValuesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExtraFieldValue }
     *     
     */
    public ArrayOfExtraFieldValue getGetPersonExtraFieldValuesResult() {
        return getPersonExtraFieldValuesResult;
    }

    /**
     * Sets the value of the getPersonExtraFieldValuesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExtraFieldValue }
     *     
     */
    public void setGetPersonExtraFieldValuesResult(ArrayOfExtraFieldValue value) {
        this.getPersonExtraFieldValuesResult = value;
    }

}
