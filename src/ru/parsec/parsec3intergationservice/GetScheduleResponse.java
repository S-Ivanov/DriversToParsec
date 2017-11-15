
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
 *         &lt;element name="GetScheduleResult" type="{http://parsec.ru/Parsec3IntergationService}Schedule" minOccurs="0"/>
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
    "getScheduleResult"
})
@XmlRootElement(name = "GetScheduleResponse")
public class GetScheduleResponse {

    @XmlElement(name = "GetScheduleResult")
    protected Schedule getScheduleResult;

    /**
     * Gets the value of the getScheduleResult property.
     * 
     * @return
     *     possible object is
     *     {@link Schedule }
     *     
     */
    public Schedule getGetScheduleResult() {
        return getScheduleResult;
    }

    /**
     * Sets the value of the getScheduleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule }
     *     
     */
    public void setGetScheduleResult(Schedule value) {
        this.getScheduleResult = value;
    }

}
