
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
 *         &lt;element name="GetOrgUnitResult" type="{http://parsec.ru/Parsec3IntergationService}OrgUnit" minOccurs="0"/>
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
    "getOrgUnitResult"
})
@XmlRootElement(name = "GetOrgUnitResponse")
public class GetOrgUnitResponse {

    @XmlElement(name = "GetOrgUnitResult")
    protected OrgUnit getOrgUnitResult;

    /**
     * Gets the value of the getOrgUnitResult property.
     * 
     * @return
     *     possible object is
     *     {@link OrgUnit }
     *     
     */
    public OrgUnit getGetOrgUnitResult() {
        return getOrgUnitResult;
    }

    /**
     * Sets the value of the getOrgUnitResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgUnit }
     *     
     */
    public void setGetOrgUnitResult(OrgUnit value) {
        this.getOrgUnitResult = value;
    }

}
