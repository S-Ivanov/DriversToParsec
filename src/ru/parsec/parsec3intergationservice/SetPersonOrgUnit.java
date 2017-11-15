
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
 *         &lt;element name="personEditSessionID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="orgUnitID" type="{http://microsoft.com/wsdl/types/}guid"/>
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
    "personEditSessionID",
    "orgUnitID"
})
@XmlRootElement(name = "SetPersonOrgUnit")
public class SetPersonOrgUnit {

    @XmlElement(required = true)
    protected String personEditSessionID;
    @XmlElement(required = true)
    protected String orgUnitID;

    /**
     * Gets the value of the personEditSessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEditSessionID() {
        return personEditSessionID;
    }

    /**
     * Sets the value of the personEditSessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEditSessionID(String value) {
        this.personEditSessionID = value;
    }

    /**
     * Gets the value of the orgUnitID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgUnitID() {
        return orgUnitID;
    }

    /**
     * Sets the value of the orgUnitID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgUnitID(String value) {
        this.orgUnitID = value;
    }

}
