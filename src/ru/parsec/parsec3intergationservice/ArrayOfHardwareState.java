
package ru.parsec.parsec3intergationservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHardwareState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHardwareState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HardwareState" type="{http://parsec.ru/Parsec3IntergationService}HardwareState" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHardwareState", propOrder = {
    "hardwareState"
})
public class ArrayOfHardwareState {

    @XmlElement(name = "HardwareState", nillable = true)
    protected List<HardwareState> hardwareState;

    /**
     * Gets the value of the hardwareState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hardwareState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHardwareState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HardwareState }
     * 
     * 
     */
    public List<HardwareState> getHardwareState() {
        if (hardwareState == null) {
            hardwareState = new ArrayList<HardwareState>();
        }
        return this.hardwareState;
    }

}
