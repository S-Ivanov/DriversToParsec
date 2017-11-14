
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
 *         &lt;element name="DeletePersonScheduleFixResult" type="{http://parsec.ru/Parsec3IntergationService}BaseResult" minOccurs="0"/>
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
    "deletePersonScheduleFixResult"
})
@XmlRootElement(name = "DeletePersonScheduleFixResponse")
public class DeletePersonScheduleFixResponse {

    @XmlElement(name = "DeletePersonScheduleFixResult")
    protected BaseResult deletePersonScheduleFixResult;

    /**
     * Gets the value of the deletePersonScheduleFixResult property.
     * 
     * @return
     *     possible object is
     *     {@link BaseResult }
     *     
     */
    public BaseResult getDeletePersonScheduleFixResult() {
        return deletePersonScheduleFixResult;
    }

    /**
     * Sets the value of the deletePersonScheduleFixResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseResult }
     *     
     */
    public void setDeletePersonScheduleFixResult(BaseResult value) {
        this.deletePersonScheduleFixResult = value;
    }

}
