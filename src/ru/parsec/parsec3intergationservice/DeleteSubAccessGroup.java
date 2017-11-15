
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
 *         &lt;element name="sessionID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="accessGroupID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="subGroupID" type="{http://microsoft.com/wsdl/types/}guid"/>
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
    "sessionID",
    "accessGroupID",
    "subGroupID"
})
@XmlRootElement(name = "DeleteSubAccessGroup")
public class DeleteSubAccessGroup {

    @XmlElement(required = true)
    protected String sessionID;
    @XmlElement(required = true)
    protected String accessGroupID;
    @XmlElement(required = true)
    protected String subGroupID;

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
     * Gets the value of the accessGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessGroupID() {
        return accessGroupID;
    }

    /**
     * Sets the value of the accessGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessGroupID(String value) {
        this.accessGroupID = value;
    }

    /**
     * Gets the value of the subGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubGroupID() {
        return subGroupID;
    }

    /**
     * Sets the value of the subGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubGroupID(String value) {
        this.subGroupID = value;
    }

}
