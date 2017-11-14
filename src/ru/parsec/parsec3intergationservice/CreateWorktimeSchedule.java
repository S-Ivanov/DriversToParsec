
package ru.parsec.parsec3intergationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="schedule" type="{http://parsec.ru/Parsec3IntergationService}WorktimeSchedule" minOccurs="0"/>
 *         &lt;element name="days" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfScheduleDay" minOccurs="0"/>
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
    "schedule",
    "days"
})
@XmlRootElement(name = "CreateWorktimeSchedule")
public class CreateWorktimeSchedule {

    @XmlElement(required = true)
    protected String sessionID;
    protected WorktimeSchedule schedule;
    protected ArrayOfScheduleDay days;

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
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link WorktimeSchedule }
     *     
     */
    public WorktimeSchedule getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorktimeSchedule }
     *     
     */
    public void setSchedule(WorktimeSchedule value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the days property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfScheduleDay }
     *     
     */
    public ArrayOfScheduleDay getDays() {
        return days;
    }

    /**
     * Sets the value of the days property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfScheduleDay }
     *     
     */
    public void setDays(ArrayOfScheduleDay value) {
        this.days = value;
    }

}
