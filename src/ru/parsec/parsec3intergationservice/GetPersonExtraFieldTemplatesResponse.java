
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
 *         &lt;element name="GetPersonExtraFieldTemplatesResult" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfPersonExtraFieldTemplate" minOccurs="0"/>
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
    "getPersonExtraFieldTemplatesResult"
})
@XmlRootElement(name = "GetPersonExtraFieldTemplatesResponse")
public class GetPersonExtraFieldTemplatesResponse {

    @XmlElement(name = "GetPersonExtraFieldTemplatesResult")
    protected ArrayOfPersonExtraFieldTemplate getPersonExtraFieldTemplatesResult;

    /**
     * Gets the value of the getPersonExtraFieldTemplatesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPersonExtraFieldTemplate }
     *     
     */
    public ArrayOfPersonExtraFieldTemplate getGetPersonExtraFieldTemplatesResult() {
        return getPersonExtraFieldTemplatesResult;
    }

    /**
     * Sets the value of the getPersonExtraFieldTemplatesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPersonExtraFieldTemplate }
     *     
     */
    public void setGetPersonExtraFieldTemplatesResult(ArrayOfPersonExtraFieldTemplate value) {
        this.getPersonExtraFieldTemplatesResult = value;
    }

}
