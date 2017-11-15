
package ru.parsec.parsec3intergationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for IdentifierTemp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentifierTemp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://parsec.ru/Parsec3IntergationService}Identifier">
 *       &lt;sequence>
 *         &lt;element name="VALID_FROM" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="VALID_TO" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifierTemp", propOrder = {
    "validfrom",
    "validto"
})
@XmlSeeAlso({
    StockIdentifier.class
})
public class IdentifierTemp
    extends Identifier
{

    @XmlElement(name = "VALID_FROM", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validfrom;
    @XmlElement(name = "VALID_TO", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validto;

    /**
     * Gets the value of the validfrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVALIDFROM() {
        return validfrom;
    }

    /**
     * Sets the value of the validfrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVALIDFROM(XMLGregorianCalendar value) {
        this.validfrom = value;
    }

    /**
     * Gets the value of the validto property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVALIDTO() {
        return validto;
    }

    /**
     * Sets the value of the validto property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVALIDTO(XMLGregorianCalendar value) {
        this.validto = value;
    }

}
