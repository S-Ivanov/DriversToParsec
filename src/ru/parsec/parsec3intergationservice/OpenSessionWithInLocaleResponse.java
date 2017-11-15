
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
 *         &lt;element name="OpenSessionWithInLocaleResult" type="{http://parsec.ru/Parsec3IntergationService}SessionResult" minOccurs="0"/>
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
    "openSessionWithInLocaleResult"
})
@XmlRootElement(name = "OpenSessionWithInLocaleResponse")
public class OpenSessionWithInLocaleResponse {

    @XmlElement(name = "OpenSessionWithInLocaleResult")
    protected SessionResult openSessionWithInLocaleResult;

    /**
     * Gets the value of the openSessionWithInLocaleResult property.
     * 
     * @return
     *     possible object is
     *     {@link SessionResult }
     *     
     */
    public SessionResult getOpenSessionWithInLocaleResult() {
        return openSessionWithInLocaleResult;
    }

    /**
     * Sets the value of the openSessionWithInLocaleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionResult }
     *     
     */
    public void setOpenSessionWithInLocaleResult(SessionResult value) {
        this.openSessionWithInLocaleResult = value;
    }

}
