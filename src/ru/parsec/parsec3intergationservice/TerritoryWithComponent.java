
package ru.parsec.parsec3intergationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerritoryWithComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerritoryWithComponent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://parsec.ru/Parsec3IntergationService}Territory">
 *       &lt;sequence>
 *         &lt;element name="COMPONENT_ID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="FEATURE_MASK" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerritoryWithComponent", propOrder = {
    "componentid",
    "featuremask"
})
public class TerritoryWithComponent
    extends Territory
{

    @XmlElement(name = "COMPONENT_ID", required = true)
    protected String componentid;
    @XmlElement(name = "FEATURE_MASK")
    protected long featuremask;

    /**
     * Gets the value of the componentid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPONENTID() {
        return componentid;
    }

    /**
     * Sets the value of the componentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPONENTID(String value) {
        this.componentid = value;
    }

    /**
     * Gets the value of the featuremask property.
     * 
     */
    public long getFEATUREMASK() {
        return featuremask;
    }

    /**
     * Sets the value of the featuremask property.
     * 
     */
    public void setFEATUREMASK(long value) {
        this.featuremask = value;
    }

}
