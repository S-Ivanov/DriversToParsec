
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
 *         &lt;element name="GetPersonScheduleFixesResult" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfPersonScheduleFix" minOccurs="0"/>
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
    "getPersonScheduleFixesResult"
})
@XmlRootElement(name = "GetPersonScheduleFixesResponse")
public class GetPersonScheduleFixesResponse {

    @XmlElement(name = "GetPersonScheduleFixesResult")
    protected ArrayOfPersonScheduleFix getPersonScheduleFixesResult;

    /**
     * Gets the value of the getPersonScheduleFixesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPersonScheduleFix }
     *     
     */
    public ArrayOfPersonScheduleFix getGetPersonScheduleFixesResult() {
        return getPersonScheduleFixesResult;
    }

    /**
     * Sets the value of the getPersonScheduleFixesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPersonScheduleFix }
     *     
     */
    public void setGetPersonScheduleFixesResult(ArrayOfPersonScheduleFix value) {
        this.getPersonScheduleFixesResult = value;
    }

}
