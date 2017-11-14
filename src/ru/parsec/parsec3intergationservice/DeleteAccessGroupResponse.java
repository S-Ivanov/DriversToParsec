
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
 *         &lt;element name="DeleteAccessGroupResult" type="{http://parsec.ru/Parsec3IntergationService}BaseResult" minOccurs="0"/>
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
    "deleteAccessGroupResult"
})
@XmlRootElement(name = "DeleteAccessGroupResponse")
public class DeleteAccessGroupResponse {

    @XmlElement(name = "DeleteAccessGroupResult")
    protected BaseResult deleteAccessGroupResult;

    /**
     * Gets the value of the deleteAccessGroupResult property.
     * 
     * @return
     *     possible object is
     *     {@link BaseResult }
     *     
     */
    public BaseResult getDeleteAccessGroupResult() {
        return deleteAccessGroupResult;
    }

    /**
     * Sets the value of the deleteAccessGroupResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseResult }
     *     
     */
    public void setDeleteAccessGroupResult(BaseResult value) {
        this.deleteAccessGroupResult = value;
    }

}
