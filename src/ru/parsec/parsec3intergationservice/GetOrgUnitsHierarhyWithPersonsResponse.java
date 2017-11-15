
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
 *         &lt;element name="GetOrgUnitsHierarhyWithPersonsResult" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfBaseObject" minOccurs="0"/>
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
    "getOrgUnitsHierarhyWithPersonsResult"
})
@XmlRootElement(name = "GetOrgUnitsHierarhyWithPersonsResponse")
public class GetOrgUnitsHierarhyWithPersonsResponse {

    @XmlElement(name = "GetOrgUnitsHierarhyWithPersonsResult")
    protected ArrayOfBaseObject getOrgUnitsHierarhyWithPersonsResult;

    /**
     * Gets the value of the getOrgUnitsHierarhyWithPersonsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBaseObject }
     *     
     */
    public ArrayOfBaseObject getGetOrgUnitsHierarhyWithPersonsResult() {
        return getOrgUnitsHierarhyWithPersonsResult;
    }

    /**
     * Sets the value of the getOrgUnitsHierarhyWithPersonsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBaseObject }
     *     
     */
    public void setGetOrgUnitsHierarhyWithPersonsResult(ArrayOfBaseObject value) {
        this.getOrgUnitsHierarhyWithPersonsResult = value;
    }

}
