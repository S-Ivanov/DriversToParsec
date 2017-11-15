
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
 *         &lt;element name="GetScheduleDetailsResult" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfScheduleDay" minOccurs="0"/>
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
    "getScheduleDetailsResult"
})
@XmlRootElement(name = "GetScheduleDetailsResponse")
public class GetScheduleDetailsResponse {

    @XmlElement(name = "GetScheduleDetailsResult")
    protected ArrayOfScheduleDay getScheduleDetailsResult;

    /**
     * Gets the value of the getScheduleDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfScheduleDay }
     *     
     */
    public ArrayOfScheduleDay getGetScheduleDetailsResult() {
        return getScheduleDetailsResult;
    }

    /**
     * Sets the value of the getScheduleDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfScheduleDay }
     *     
     */
    public void setGetScheduleDetailsResult(ArrayOfScheduleDay value) {
        this.getScheduleDetailsResult = value;
    }

}
