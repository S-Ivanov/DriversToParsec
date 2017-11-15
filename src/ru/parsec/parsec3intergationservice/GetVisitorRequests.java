
package ru.parsec.parsec3intergationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="orgUnitID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="issued" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="accepted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="declined" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="completed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "orgUnitID",
    "from",
    "issued",
    "accepted",
    "declined",
    "active",
    "completed"
})
@XmlRootElement(name = "GetVisitorRequests")
public class GetVisitorRequests {

    @XmlElement(required = true)
    protected String sessionID;
    @XmlElement(required = true)
    protected String orgUnitID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar from;
    protected boolean issued;
    protected boolean accepted;
    protected boolean declined;
    protected boolean active;
    protected boolean completed;

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

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFrom(XMLGregorianCalendar value) {
        this.from = value;
    }

    /**
     * Gets the value of the issued property.
     * 
     */
    public boolean isIssued() {
        return issued;
    }

    /**
     * Sets the value of the issued property.
     * 
     */
    public void setIssued(boolean value) {
        this.issued = value;
    }

    /**
     * Gets the value of the accepted property.
     * 
     */
    public boolean isAccepted() {
        return accepted;
    }

    /**
     * Sets the value of the accepted property.
     * 
     */
    public void setAccepted(boolean value) {
        this.accepted = value;
    }

    /**
     * Gets the value of the declined property.
     * 
     */
    public boolean isDeclined() {
        return declined;
    }

    /**
     * Sets the value of the declined property.
     * 
     */
    public void setDeclined(boolean value) {
        this.declined = value;
    }

    /**
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the completed property.
     * 
     */
    public boolean isCompleted() {
        return completed;
    }

    /**
     * Sets the value of the completed property.
     * 
     */
    public void setCompleted(boolean value) {
        this.completed = value;
    }

}
