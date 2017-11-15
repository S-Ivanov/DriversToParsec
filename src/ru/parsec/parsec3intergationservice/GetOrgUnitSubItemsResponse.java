
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
 *         &lt;element name="GetOrgUnitSubItemsResult" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfBaseObject" minOccurs="0"/>
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
    "getOrgUnitSubItemsResult"
})
@XmlRootElement(name = "GetOrgUnitSubItemsResponse")
public class GetOrgUnitSubItemsResponse {

    @XmlElement(name = "GetOrgUnitSubItemsResult")
    protected ArrayOfBaseObject getOrgUnitSubItemsResult;

    /**
     * Gets the value of the getOrgUnitSubItemsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBaseObject }
     *     
     */
    public ArrayOfBaseObject getGetOrgUnitSubItemsResult() {
        return getOrgUnitSubItemsResult;
    }

    /**
     * Sets the value of the getOrgUnitSubItemsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBaseObject }
     *     
     */
    public void setGetOrgUnitSubItemsResult(ArrayOfBaseObject value) {
        this.getOrgUnitSubItemsResult = value;
    }

}
