
package ru.parsec.parsec3intergationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScheduleFix complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleFix">
 *   &lt;complexContent>
 *     &lt;extension base="{http://parsec.ru/Parsec3IntergationService}ScheduleDay">
 *       &lt;sequence>
 *         &lt;element name="ACTION" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleFix", propOrder = {
    "action"
})
public class ScheduleFix
    extends ScheduleDay
{

    @XmlElement(name = "ACTION")
    protected int action;

    /**
     * Gets the value of the action property.
     * 
     */
    public int getACTION() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     */
    public void setACTION(int value) {
        this.action = value;
    }

}
