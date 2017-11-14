
package ru.parsec.parsec3intergationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccessSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccessSchedule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://parsec.ru/Parsec3IntergationService}Schedule">
 *       &lt;sequence>
 *         &lt;element name="DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IS_WEEK" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="HOLIDAYS_ACTION" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessSchedule", propOrder = {
    "desc",
    "isweek",
    "holidaysaction"
})
@XmlSeeAlso({
    WorktimeSchedule.class
})
public class AccessSchedule
    extends Schedule
{

    @XmlElement(name = "DESC")
    protected String desc;
    @XmlElement(name = "IS_WEEK")
    protected boolean isweek;
    @XmlElement(name = "HOLIDAYS_ACTION")
    protected int holidaysaction;

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESC() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESC(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the isweek property.
     * 
     */
    public boolean isISWEEK() {
        return isweek;
    }

    /**
     * Sets the value of the isweek property.
     * 
     */
    public void setISWEEK(boolean value) {
        this.isweek = value;
    }

    /**
     * Gets the value of the holidaysaction property.
     * 
     */
    public int getHOLIDAYSACTION() {
        return holidaysaction;
    }

    /**
     * Sets the value of the holidaysaction property.
     * 
     */
    public void setHOLIDAYSACTION(int value) {
        this.holidaysaction = value;
    }

}
