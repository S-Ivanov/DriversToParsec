
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
 *         &lt;element name="SavePersonScheduleFixResult" type="{http://parsec.ru/Parsec3IntergationService}BaseResult" minOccurs="0"/>
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
    "savePersonScheduleFixResult"
})
@XmlRootElement(name = "SavePersonScheduleFixResponse")
public class SavePersonScheduleFixResponse {

    @XmlElement(name = "SavePersonScheduleFixResult")
    protected BaseResult savePersonScheduleFixResult;

    /**
     * Gets the value of the savePersonScheduleFixResult property.
     * 
     * @return
     *     possible object is
     *     {@link BaseResult }
     *     
     */
    public BaseResult getSavePersonScheduleFixResult() {
        return savePersonScheduleFixResult;
    }

    /**
     * Sets the value of the savePersonScheduleFixResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseResult }
     *     
     */
    public void setSavePersonScheduleFixResult(BaseResult value) {
        this.savePersonScheduleFixResult = value;
    }

}
