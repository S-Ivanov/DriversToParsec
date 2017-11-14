
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
 *         &lt;element name="orgUnitEditSessionID" type="{http://microsoft.com/wsdl/types/}guid"/>
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
    "orgUnitEditSessionID"
})
@XmlRootElement(name = "CloseOrgUnitEditingSession")
public class CloseOrgUnitEditingSession {

    @XmlElement(required = true)
    protected String orgUnitEditSessionID;

    /**
     * Gets the value of the orgUnitEditSessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgUnitEditSessionID() {
        return orgUnitEditSessionID;
    }

    /**
     * Sets the value of the orgUnitEditSessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgUnitEditSessionID(String value) {
        this.orgUnitEditSessionID = value;
    }

}
