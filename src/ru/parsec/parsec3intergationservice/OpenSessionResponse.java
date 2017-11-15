
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
 *         &lt;element name="OpenSessionResult" type="{http://parsec.ru/Parsec3IntergationService}SessionResult" minOccurs="0"/>
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
    "openSessionResult"
})
@XmlRootElement(name = "OpenSessionResponse")
public class OpenSessionResponse {

    @XmlElement(name = "OpenSessionResult")
    protected SessionResult openSessionResult;

    /**
     * Gets the value of the openSessionResult property.
     * 
     * @return
     *     possible object is
     *     {@link SessionResult }
     *     
     */
    public SessionResult getOpenSessionResult() {
        return openSessionResult;
    }

    /**
     * Sets the value of the openSessionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionResult }
     *     
     */
    public void setOpenSessionResult(SessionResult value) {
        this.openSessionResult = value;
    }

}
