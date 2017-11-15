
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
 *         &lt;element name="SetIdentifierPrivilegesResult" type="{http://parsec.ru/Parsec3IntergationService}BaseResult" minOccurs="0"/>
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
    "setIdentifierPrivilegesResult"
})
@XmlRootElement(name = "SetIdentifierPrivilegesResponse")
public class SetIdentifierPrivilegesResponse {

    @XmlElement(name = "SetIdentifierPrivilegesResult")
    protected BaseResult setIdentifierPrivilegesResult;

    /**
     * Gets the value of the setIdentifierPrivilegesResult property.
     * 
     * @return
     *     possible object is
     *     {@link BaseResult }
     *     
     */
    public BaseResult getSetIdentifierPrivilegesResult() {
        return setIdentifierPrivilegesResult;
    }

    /**
     * Sets the value of the setIdentifierPrivilegesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseResult }
     *     
     */
    public void setSetIdentifierPrivilegesResult(BaseResult value) {
        this.setIdentifierPrivilegesResult = value;
    }

}
