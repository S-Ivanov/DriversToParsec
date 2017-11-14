
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
 *         &lt;element name="CreateWorktimeScheduleResult" type="{http://parsec.ru/Parsec3IntergationService}GuidResult" minOccurs="0"/>
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
    "createWorktimeScheduleResult"
})
@XmlRootElement(name = "CreateWorktimeScheduleResponse")
public class CreateWorktimeScheduleResponse {

    @XmlElement(name = "CreateWorktimeScheduleResult")
    protected GuidResult createWorktimeScheduleResult;

    /**
     * Gets the value of the createWorktimeScheduleResult property.
     * 
     * @return
     *     possible object is
     *     {@link GuidResult }
     *     
     */
    public GuidResult getCreateWorktimeScheduleResult() {
        return createWorktimeScheduleResult;
    }

    /**
     * Sets the value of the createWorktimeScheduleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuidResult }
     *     
     */
    public void setCreateWorktimeScheduleResult(GuidResult value) {
        this.createWorktimeScheduleResult = value;
    }

}
