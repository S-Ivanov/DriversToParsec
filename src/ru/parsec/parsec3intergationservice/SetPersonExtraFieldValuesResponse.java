
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
 *         &lt;element name="SetPersonExtraFieldValuesResult" type="{http://parsec.ru/Parsec3IntergationService}BaseResult" minOccurs="0"/>
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
    "setPersonExtraFieldValuesResult"
})
@XmlRootElement(name = "SetPersonExtraFieldValuesResponse")
public class SetPersonExtraFieldValuesResponse {

    @XmlElement(name = "SetPersonExtraFieldValuesResult")
    protected BaseResult setPersonExtraFieldValuesResult;

    /**
     * Gets the value of the setPersonExtraFieldValuesResult property.
     * 
     * @return
     *     possible object is
     *     {@link BaseResult }
     *     
     */
    public BaseResult getSetPersonExtraFieldValuesResult() {
        return setPersonExtraFieldValuesResult;
    }

    /**
     * Sets the value of the setPersonExtraFieldValuesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseResult }
     *     
     */
    public void setSetPersonExtraFieldValuesResult(BaseResult value) {
        this.setPersonExtraFieldValuesResult = value;
    }

}
