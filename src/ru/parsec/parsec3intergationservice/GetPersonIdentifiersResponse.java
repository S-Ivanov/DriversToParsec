
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
 *         &lt;element name="GetPersonIdentifiersResult" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfIdentifier" minOccurs="0"/>
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
    "getPersonIdentifiersResult"
})
@XmlRootElement(name = "GetPersonIdentifiersResponse")
public class GetPersonIdentifiersResponse {

    @XmlElement(name = "GetPersonIdentifiersResult")
    protected ArrayOfIdentifier getPersonIdentifiersResult;

    /**
     * Gets the value of the getPersonIdentifiersResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIdentifier }
     *     
     */
    public ArrayOfIdentifier getGetPersonIdentifiersResult() {
        return getPersonIdentifiersResult;
    }

    /**
     * Sets the value of the getPersonIdentifiersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIdentifier }
     *     
     */
    public void setGetPersonIdentifiersResult(ArrayOfIdentifier value) {
        this.getPersonIdentifiersResult = value;
    }

}
