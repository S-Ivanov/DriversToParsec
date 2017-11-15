
package ru.parsec.parsec3intergationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventsHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventsHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Events" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfEvent" minOccurs="0"/>
 *         &lt;element name="Persons" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfGuid" minOccurs="0"/>
 *         &lt;element name="PersonFullNames" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Territories" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfGuid" minOccurs="0"/>
 *         &lt;element name="TerritoryNames" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventsHistory", propOrder = {
    "events",
    "persons",
    "personFullNames",
    "territories",
    "territoryNames"
})
public class EventsHistory {

    @XmlElement(name = "Events")
    protected ArrayOfEvent events;
    @XmlElement(name = "Persons")
    protected ArrayOfGuid persons;
    @XmlElement(name = "PersonFullNames")
    protected ArrayOfString personFullNames;
    @XmlElement(name = "Territories")
    protected ArrayOfGuid territories;
    @XmlElement(name = "TerritoryNames")
    protected ArrayOfString territoryNames;

    /**
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEvent }
     *     
     */
    public ArrayOfEvent getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEvent }
     *     
     */
    public void setEvents(ArrayOfEvent value) {
        this.events = value;
    }

    /**
     * Gets the value of the persons property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuid }
     *     
     */
    public ArrayOfGuid getPersons() {
        return persons;
    }

    /**
     * Sets the value of the persons property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuid }
     *     
     */
    public void setPersons(ArrayOfGuid value) {
        this.persons = value;
    }

    /**
     * Gets the value of the personFullNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getPersonFullNames() {
        return personFullNames;
    }

    /**
     * Sets the value of the personFullNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setPersonFullNames(ArrayOfString value) {
        this.personFullNames = value;
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

    /**
     * Gets the value of the territoryNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getTerritoryNames() {
        return territoryNames;
    }

    /**
     * Sets the value of the territoryNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setTerritoryNames(ArrayOfString value) {
        this.territoryNames = value;
    }

}
