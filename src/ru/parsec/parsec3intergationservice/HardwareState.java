
package ru.parsec.parsec3intergationservice;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HardwareState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HardwareState">
 *   &lt;complexContent>
 *     &lt;extension base="{http://parsec.ru/Parsec3IntergationService}BaseObject">
 *       &lt;sequence>
 *         &lt;element name="TerritoryID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HardwareState", propOrder = {
    "territoryID",
    "state"
})
public class HardwareState
    extends BaseObject
{

    @XmlElement(name = "TerritoryID", required = true)
    protected String territoryID;
    @XmlElement(name = "State", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger state;

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
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setState(BigInteger value) {
        this.state = value;
    }

}
