
package ru.parsec.parsec3intergationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubAccessGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubAccessGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{http://parsec.ru/Parsec3IntergationService}BaseObject">
 *       &lt;sequence>
 *         &lt;element name="SubGroupID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="ScheduleID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="Territories" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfGuid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubAccessGroup", propOrder = {
    "subGroupID",
    "scheduleID",
    "territories"
})
public class SubAccessGroup
    extends BaseObject
{

    @XmlElement(name = "SubGroupID", required = true)
    protected String subGroupID;
    @XmlElement(name = "ScheduleID", required = true)
    protected String scheduleID;
    @XmlElement(name = "Territories")
    protected ArrayOfGuid territories;

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
