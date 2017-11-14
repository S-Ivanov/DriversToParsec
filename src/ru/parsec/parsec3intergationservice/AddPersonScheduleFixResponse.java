
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
 *         &lt;element name="AddPersonScheduleFixResult" type="{http://parsec.ru/Parsec3IntergationService}GuidResult" minOccurs="0"/>
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
    "addPersonScheduleFixResult"
})
@XmlRootElement(name = "AddPersonScheduleFixResponse")
public class AddPersonScheduleFixResponse {

    @XmlElement(name = "AddPersonScheduleFixResult")
    protected GuidResult addPersonScheduleFixResult;

    /**
     * Gets the value of the addPersonScheduleFixResult property.
     * 
     * @return
     *     possible object is
     *     {@link GuidResult }
     *     
     */
    public GuidResult getAddPersonScheduleFixResult() {
        return addPersonScheduleFixResult;
    }

    /**
     * Sets the value of the addPersonScheduleFixResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuidResult }
     *     
     */
    public void setAddPersonScheduleFixResult(GuidResult value) {
        this.addPersonScheduleFixResult = value;
    }

}
