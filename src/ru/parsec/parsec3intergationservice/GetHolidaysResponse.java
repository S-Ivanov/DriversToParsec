
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
 *         &lt;element name="GetHolidaysResult" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfHoliday" minOccurs="0"/>
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
    "getHolidaysResult"
})
@XmlRootElement(name = "GetHolidaysResponse")
public class GetHolidaysResponse {

    @XmlElement(name = "GetHolidaysResult")
    protected ArrayOfHoliday getHolidaysResult;

    /**
     * Gets the value of the getHolidaysResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHoliday }
     *     
     */
    public ArrayOfHoliday getGetHolidaysResult() {
        return getHolidaysResult;
    }

    /**
     * Sets the value of the getHolidaysResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHoliday }
     *     
     */
    public void setGetHolidaysResult(ArrayOfHoliday value) {
        this.getHolidaysResult = value;
    }

}
