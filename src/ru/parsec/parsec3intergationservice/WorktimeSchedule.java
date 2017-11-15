
package ru.parsec.parsec3intergationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorktimeSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorktimeSchedule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://parsec.ru/Parsec3IntergationService}AccessSchedule">
 *       &lt;sequence>
 *         &lt;element name="HOURS_PER_WEEK" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HOURS_PER_DAY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorktimeSchedule", propOrder = {
    "hoursperweek",
    "hoursperday"
})
public class WorktimeSchedule
    extends AccessSchedule
{

    @XmlElement(name = "HOURS_PER_WEEK")
    protected int hoursperweek;
    @XmlElement(name = "HOURS_PER_DAY")
    protected int hoursperday;

    /**
     * Gets the value of the hoursperweek property.
     * 
     */
    public int getHOURSPERWEEK() {
        return hoursperweek;
    }

    /**
     * Sets the value of the hoursperweek property.
     * 
     */
    public void setHOURSPERWEEK(int value) {
        this.hoursperweek = value;
    }

    /**
     * Gets the value of the hoursperday property.
     * 
     */
    public int getHOURSPERDAY() {
        return hoursperday;
    }

    /**
     * Sets the value of the hoursperday property.
     * 
     */
    public void setHOURSPERDAY(int value) {
        this.hoursperday = value;
    }

}
