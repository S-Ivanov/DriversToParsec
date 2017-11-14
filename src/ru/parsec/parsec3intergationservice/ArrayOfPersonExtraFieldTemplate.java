
package ru.parsec.parsec3intergationservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPersonExtraFieldTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPersonExtraFieldTemplate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonExtraFieldTemplate" type="{http://parsec.ru/Parsec3IntergationService}PersonExtraFieldTemplate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPersonExtraFieldTemplate", propOrder = {
    "personExtraFieldTemplate"
})
public class ArrayOfPersonExtraFieldTemplate {

    @XmlElement(name = "PersonExtraFieldTemplate", nillable = true)
    protected List<PersonExtraFieldTemplate> personExtraFieldTemplate;

    /**
     * Gets the value of the personExtraFieldTemplate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personExtraFieldTemplate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonExtraFieldTemplate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonExtraFieldTemplate }
     * 
     * 
     */
    public List<PersonExtraFieldTemplate> getPersonExtraFieldTemplate() {
        if (personExtraFieldTemplate == null) {
            personExtraFieldTemplate = new ArrayList<PersonExtraFieldTemplate>();
        }
        return this.personExtraFieldTemplate;
    }

}
