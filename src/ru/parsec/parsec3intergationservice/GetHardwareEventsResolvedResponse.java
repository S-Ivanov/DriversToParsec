
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
 *         &lt;element name="GetHardwareEventsResolvedResult" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfString" minOccurs="0"/>
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
    "getHardwareEventsResolvedResult"
})
@XmlRootElement(name = "GetHardwareEventsResolvedResponse")
public class GetHardwareEventsResolvedResponse {

    @XmlElement(name = "GetHardwareEventsResolvedResult")
    protected ArrayOfString getHardwareEventsResolvedResult;

    /**
     * Gets the value of the getHardwareEventsResolvedResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGetHardwareEventsResolvedResult() {
        return getHardwareEventsResolvedResult;
    }

    /**
     * Sets the value of the getHardwareEventsResolvedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGetHardwareEventsResolvedResult(ArrayOfString value) {
        this.getHardwareEventsResolvedResult = value;
    }

}
