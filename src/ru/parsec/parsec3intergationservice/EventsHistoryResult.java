
package ru.parsec.parsec3intergationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventsHistoryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventsHistoryResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://parsec.ru/Parsec3IntergationService}BaseResult">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{http://parsec.ru/Parsec3IntergationService}EventsHistory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventsHistoryResult", propOrder = {
    "value"
})
public class EventsHistoryResult
    extends BaseResult
{

    @XmlElement(name = "Value")
    protected EventsHistory value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link EventsHistory }
     *     
     */
    public EventsHistory getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsHistory }
     *     
     */
    public void setValue(EventsHistory value) {
        this.value = value;
    }

}
