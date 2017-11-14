
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
 *         &lt;element name="ActivateVisitorRequestResult" type="{http://parsec.ru/Parsec3IntergationService}BaseResult" minOccurs="0"/>
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
    "activateVisitorRequestResult"
})
@XmlRootElement(name = "ActivateVisitorRequestResponse")
public class ActivateVisitorRequestResponse {

    @XmlElement(name = "ActivateVisitorRequestResult")
    protected BaseResult activateVisitorRequestResult;

    /**
     * Gets the value of the activateVisitorRequestResult property.
     * 
     * @return
     *     possible object is
     *     {@link BaseResult }
     *     
     */
    public BaseResult getActivateVisitorRequestResult() {
        return activateVisitorRequestResult;
    }

    /**
     * Sets the value of the activateVisitorRequestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseResult }
     *     
     */
    public void setActivateVisitorRequestResult(BaseResult value) {
        this.activateVisitorRequestResult = value;
    }

}
