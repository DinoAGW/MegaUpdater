
package com.exlibris.dps;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für addRepresentationResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="addRepresentationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addRepresentation" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addRepresentationResponse", propOrder = {
    "addRepresentation"
})
public class AddRepresentationResponse {

    protected long addRepresentation;

    /**
     * Ruft den Wert der addRepresentation-Eigenschaft ab.
     * 
     */
    public long getAddRepresentation() {
        return addRepresentation;
    }

    /**
     * Legt den Wert der addRepresentation-Eigenschaft fest.
     * 
     */
    public void setAddRepresentation(long value) {
        this.addRepresentation = value;
    }

}
