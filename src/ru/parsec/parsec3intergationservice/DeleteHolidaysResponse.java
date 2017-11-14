
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
 *         &lt;element name="DeleteHolidaysResult" type="{http://parsec.ru/Parsec3IntergationService}BaseResult" minOccurs="0"/>
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
    "deleteHolidaysResult"
})
@XmlRootElement(name = "DeleteHolidaysResponse")
public class DeleteHolidaysResponse {

    @XmlElement(name = "DeleteHolidaysResult")
    protected BaseResult deleteHolidaysResult;

    /**
     * Gets the value of the deleteHolidaysResult property.
     * 
     * @return
     *     possible object is
     *     {@link BaseResult }
     *     
     */
    public BaseResult getDeleteHolidaysResult() {
        return deleteHolidaysResult;
    }

    /**
     * Sets the value of the deleteHolidaysResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseResult }
     *     
     */
    public void setDeleteHolidaysResult(BaseResult value) {
        this.deleteHolidaysResult = value;
    }

}
