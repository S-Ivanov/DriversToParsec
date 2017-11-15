
package ru.parsec.parsec3intergationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtraFieldValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtraFieldValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://parsec.ru/Parsec3IntergationService}BaseObject">
 *       &lt;sequence>
 *         &lt;element name="TEMPLATE_ID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtraFieldValue", propOrder = {
    "templateid",
    "value"
})
public class ExtraFieldValue
    extends BaseObject
{

    @XmlElement(name = "TEMPLATE_ID", required = true)
    protected String templateid;
    @XmlElement(name = "VALUE")
    protected Object value;

    /**
     * Gets the value of the templateid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEMPLATEID() {
        return templateid;
    }

    /**
     * Sets the value of the templateid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEMPLATEID(String value) {
        this.templateid = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getVALUE() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setVALUE(Object value) {
        this.value = value;
    }

}
