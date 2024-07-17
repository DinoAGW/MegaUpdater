
package com.exlibris.dps;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für manageIEResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="manageIEResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="manageIE" type="{http://dps.exlibris.com/}ieStatusInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "manageIEResponse", propOrder = {
    "manageIE"
})
public class ManageIEResponse {

    protected IeStatusInfo manageIE;

    /**
     * Ruft den Wert der manageIE-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IeStatusInfo }
     *     
     */
    public IeStatusInfo getManageIE() {
        return manageIE;
    }

    /**
     * Legt den Wert der manageIE-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IeStatusInfo }
     *     
     */
    public void setManageIE(IeStatusInfo value) {
        this.manageIE = value;
    }

}
