
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
 *         &lt;element name="scheduleID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="territories" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfGuid" minOccurs="0"/>
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
    "scheduleID",
    "territories"
})
@XmlRootElement(name = "CreateTempAccessGroup")
public class CreateTempAccessGroup {

    @XmlElement(required = true)
    protected String sessionID;
    @XmlElement(required = true)
    protected String scheduleID;
    protected ArrayOfGuid territories;

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
     * Gets the value of the scheduleID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleID() {
        return scheduleID;
    }

    /**
     * Sets the value of the scheduleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleID(String value) {
        this.scheduleID = value;
    }

    /**
     * Gets the value of the territories property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuid }
     *     
     */
    public ArrayOfGuid getTerritories() {
        return territories;
    }

    /**
     * Sets the value of the territories property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuid }
     *     
     */
    public void setTerritories(ArrayOfGuid value) {
        this.territories = value;
    }

}
