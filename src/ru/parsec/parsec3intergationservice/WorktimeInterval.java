
package ru.parsec.parsec3intergationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorktimeInterval complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorktimeInterval">
 *   &lt;complexContent>
 *     &lt;extension base="{http://parsec.ru/Parsec3IntergationService}TimeInterval">
 *       &lt;sequence>
 *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorktimeInterval", propOrder = {
    "type"
})
public class WorktimeInterval
    extends TimeInterval
{

    @XmlElement(name = "TYPE")
    protected int type;

    /**
     * Gets the value of the type property.
     * 
     */
    public int getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     */
    public void setTYPE(int value) {
        this.type = value;
    }

}
