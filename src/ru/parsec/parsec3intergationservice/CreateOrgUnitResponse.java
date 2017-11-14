
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
 *         &lt;element name="CreateOrgUnitResult" type="{http://parsec.ru/Parsec3IntergationService}GuidResult" minOccurs="0"/>
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
    "createOrgUnitResult"
})
@XmlRootElement(name = "CreateOrgUnitResponse")
public class CreateOrgUnitResponse {

    @XmlElement(name = "CreateOrgUnitResult")
    protected GuidResult createOrgUnitResult;

    /**
     * Gets the value of the createOrgUnitResult property.
     * 
     * @return
     *     possible object is
     *     {@link GuidResult }
     *     
     */
    public GuidResult getCreateOrgUnitResult() {
        return createOrgUnitResult;
    }

    /**
     * Sets the value of the createOrgUnitResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuidResult }
     *     
     */
    public void setCreateOrgUnitResult(GuidResult value) {
        this.createOrgUnitResult = value;
    }

}
