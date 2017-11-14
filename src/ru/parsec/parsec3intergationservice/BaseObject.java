
package ru.parsec.parsec3intergationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseObject")
@XmlSeeAlso({
    ExtraFieldValue.class,
    PersonScheduleFix.class,
    BaseOrgUnit.class,
    Schedule.class,
    BasePerson.class,
    HardwareState.class,
    EventObject.class,
    BaseIdentifier.class,
    ScheduleDay.class,
    Domain.class,
    SubAccessGroup.class,
    TimeInterval.class,
    Holiday.class,
    Event.class
})
public class BaseObject {


}
