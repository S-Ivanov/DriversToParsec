
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
 *         &lt;element name="TerritoryID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="PersNodeID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="dtFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dtTo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "territoryID",
    "persNodeID",
    "dtFrom",
    "dtTo"
})
@XmlRootElement(name = "GetEvents")
public class GetEvents {

    @XmlElement(required = true)
    protected String sessionID;
    @XmlElement(name = "TerritoryID", required = true)
    protected String territoryID;
    @XmlElement(name = "PersNodeID", required = true)
    protected String persNodeID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtFrom;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtTo;

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
     * Gets the value of the territoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerritoryID() {
        return territoryID;
    }

    /**
     * Sets the value of the territoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerritoryID(String value) {
        this.territoryID = value;
    }

    /**
     * Gets the value of the persNodeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersNodeID() {
        return persNodeID;
    }

    /**
     * Sets the value of the persNodeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersNodeID(String value) {
        this.persNodeID = value;
    }

    /**
     * Gets the value of the dtFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtFrom() {
        return dtFrom;
    }

    /**
     * Sets the value of the dtFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtFrom(XMLGregorianCalendar value) {
        this.dtFrom = value;
    }

    /**
     * Gets the value of the dtTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtTo() {
        return dtTo;
    }

    /**
     * Sets the value of the dtTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtTo(XMLGregorianCalendar value) {
        this.dtTo = value;
    }

}
