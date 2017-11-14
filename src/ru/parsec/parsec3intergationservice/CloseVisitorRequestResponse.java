
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
 *         &lt;element name="CloseVisitorRequestResult" type="{http://parsec.ru/Parsec3IntergationService}BaseResult" minOccurs="0"/>
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
    "closeVisitorRequestResult"
})
@XmlRootElement(name = "CloseVisitorRequestResponse")
public class CloseVisitorRequestResponse {

    @XmlElement(name = "CloseVisitorRequestResult")
    protected BaseResult closeVisitorRequestResult;

    /**
     * Gets the value of the closeVisitorRequestResult property.
     * 
     * @return
     *     possible object is
     *     {@link BaseResult }
     *     
     */
    public BaseResult getCloseVisitorRequestResult() {
        return closeVisitorRequestResult;
    }

    /**
     * Sets the value of the closeVisitorRequestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseResult }
     *     
     */
    public void setCloseVisitorRequestResult(BaseResult value) {
        this.closeVisitorRequestResult = value;
    }

}
