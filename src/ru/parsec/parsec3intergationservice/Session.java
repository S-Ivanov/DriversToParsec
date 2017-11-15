
package ru.parsec.parsec3intergationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Session complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Session">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="RootOrgUnitID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="RootTerritoryID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Session", propOrder = {
    "sessionID",
    "rootOrgUnitID",
    "rootTerritoryID"
})
public class Session {

    @XmlElement(name = "SessionID", required = true)
    protected String sessionID;
    @XmlElement(name = "RootOrgUnitID", required = true)
    protected String rootOrgUnitID;
    @XmlElement(name = "RootTerritoryID", required = true)
    protected String rootTerritoryID;

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Gets the value of the rootOrgUnitID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootOrgUnitID() {
        return rootOrgUnitID;
    }

    /**
     * Sets the value of the rootOrgUnitID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootOrgUnitID(String value) {
        this.rootOrgUnitID = value;
    }

    /**
     * Gets the value of the rootTerritoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootTerritoryID() {
        return rootTerritoryID;
    }

    /**
     * Sets the value of the rootTerritoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootTerritoryID(String value) {
        this.rootTerritoryID = value;
    }

}
