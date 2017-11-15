
package ru.parsec.parsec3intergationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Domain complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Domain">
 *   &lt;complexContent>
 *     &lt;extension base="{http://parsec.ru/Parsec3IntergationService}BaseObject">
 *       &lt;sequence>
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VISITOR_CONTROL" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IS_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Domain", propOrder = {
    "name",
    "description",
    "visitorcontrol",
    "issystem"
})
public class Domain
    extends BaseObject
{

    @XmlElement(name = "NAME")
    protected String name;
    @XmlElement(name = "DESCRIPTION")
    protected String description;
    @XmlElement(name = "VISITOR_CONTROL")
    protected boolean visitorcontrol;
    @XmlElement(name = "IS_SYSTEM")
    protected boolean issystem;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPTION(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the visitorcontrol property.
     * 
     */
    public boolean isVISITORCONTROL() {
        return visitorcontrol;
    }

    /**
     * Sets the value of the visitorcontrol property.
     * 
     */
    public void setVISITORCONTROL(boolean value) {
        this.visitorcontrol = value;
    }

    /**
     * Gets the value of the issystem property.
     * 
     */
    public boolean isISSYSTEM() {
        return issystem;
    }

    /**
     * Sets the value of the issystem property.
     * 
     */
    public void setISSYSTEM(boolean value) {
        this.issystem = value;
    }

}
