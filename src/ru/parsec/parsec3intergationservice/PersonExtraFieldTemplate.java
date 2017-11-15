
package ru.parsec.parsec3intergationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonExtraFieldTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonExtraFieldTemplate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="TYPE" type="{http://parsec.ru/Parsec3IntergationService}XmlTypeCode"/>
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GROUP_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IS_BASE" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ORDER_INDEX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonExtraFieldTemplate", propOrder = {
    "id",
    "type",
    "name",
    "groupname",
    "isbase",
    "orderindex"
})
public class PersonExtraFieldTemplate {

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "TYPE", required = true)
    @XmlSchemaType(name = "string")
    protected XmlTypeCode type;
    @XmlElement(name = "NAME")
    protected String name;
    @XmlElement(name = "GROUP_NAME")
    protected String groupname;
    @XmlElement(name = "IS_BASE")
    protected boolean isbase;
    @XmlElement(name = "ORDER_INDEX")
    protected int orderindex;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link XmlTypeCode }
     *     
     */
    public XmlTypeCode getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlTypeCode }
     *     
     */
    public void setTYPE(XmlTypeCode value) {
        this.type = value;
    }

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
     * Gets the value of the groupname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGROUPNAME() {
        return groupname;
    }

    /**
     * Sets the value of the groupname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGROUPNAME(String value) {
        this.groupname = value;
    }

    /**
     * Gets the value of the isbase property.
     * 
     */
    public boolean isISBASE() {
        return isbase;
    }

    /**
     * Sets the value of the isbase property.
     * 
     */
    public void setISBASE(boolean value) {
        this.isbase = value;
    }

    /**
     * Gets the value of the orderindex property.
     * 
     */
    public int getORDERINDEX() {
        return orderindex;
    }

    /**
     * Sets the value of the orderindex property.
     * 
     */
    public void setORDERINDEX(int value) {
        this.orderindex = value;
    }

}
