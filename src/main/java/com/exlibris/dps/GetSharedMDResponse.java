
package com.exlibris.dps;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getSharedMDResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getSharedMDResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getSharedMD" type="{http://dps.exlibris.com/}metaData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSharedMDResponse", propOrder = {
    "getSharedMD"
})
public class GetSharedMDResponse {

    @XmlElement(nillable = true)
    protected List<MetaData> getSharedMD;

    /**
     * Gets the value of the getSharedMD property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getSharedMD property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetSharedMD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetaData }
     * 
     * 
     */
    public List<MetaData> getGetSharedMD() {
        if (getSharedMD == null) {
            getSharedMD = new ArrayList<MetaData>();
        }
        return this.getSharedMD;
    }

}
