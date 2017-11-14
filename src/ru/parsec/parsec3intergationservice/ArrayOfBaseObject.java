
package ru.parsec.parsec3intergationservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBaseObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBaseObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseObject" type="{http://parsec.ru/Parsec3IntergationService}BaseObject" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBaseObject", propOrder = {
    "baseObject"
})
public class ArrayOfBaseObject {

    @XmlElement(name = "BaseObject", nillable = true)
    protected List<BaseObject> baseObject;

    /**
     * Gets the value of the baseObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaseObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaseObject }
     * 
     * 
     */
    public List<BaseObject> getBaseObject() {
        if (baseObject == null) {
            baseObject = new ArrayList<BaseObject>();
        }
        return this.baseObject;
    }

}
