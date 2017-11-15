
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
 *         &lt;element name="GetHardwareEventsResult" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfString" minOccurs="0"/>
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
    "getHardwareEventsResult"
})
@XmlRootElement(name = "GetHardwareEventsResponse")
public class GetHardwareEventsResponse {

    @XmlElement(name = "GetHardwareEventsResult")
    protected ArrayOfString getHardwareEventsResult;

    /**
     * Gets the value of the getHardwareEventsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGetHardwareEventsResult() {
        return getHardwareEventsResult;
    }

    /**
     * Sets the value of the getHardwareEventsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGetHardwareEventsResult(ArrayOfString value) {
        this.getHardwareEventsResult = value;
    }

}
