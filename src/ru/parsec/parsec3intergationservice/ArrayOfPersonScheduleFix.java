
package ru.parsec.parsec3intergationservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPersonScheduleFix complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPersonScheduleFix">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonScheduleFix" type="{http://parsec.ru/Parsec3IntergationService}PersonScheduleFix" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPersonScheduleFix", propOrder = {
    "personScheduleFix"
})
public class ArrayOfPersonScheduleFix {

    @XmlElement(name = "PersonScheduleFix", nillable = true)
    protected List<PersonScheduleFix> personScheduleFix;

    /**
     * Gets the value of the personScheduleFix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personScheduleFix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonScheduleFix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonScheduleFix }
     * 
     * 
     */
    public List<PersonScheduleFix> getPersonScheduleFix() {
        if (personScheduleFix == null) {
            personScheduleFix = new ArrayList<PersonScheduleFix>();
        }
        return this.personScheduleFix;
    }

}
