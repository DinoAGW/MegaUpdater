
package com.exlibris.dps;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getSharedMDByMidResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getSharedMDByMidResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getSharedMDByMid" type="{http://dps.exlibris.com/}metaData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSharedMDByMidResponse", propOrder = {
    "getSharedMDByMid"
})
public class GetSharedMDByMidResponse {

    protected MetaData getSharedMDByMid;

    /**
     * Ruft den Wert der getSharedMDByMid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetaData }
     *     
     */
    public MetaData getGetSharedMDByMid() {
        return getSharedMDByMid;
    }

    /**
     * Legt den Wert der getSharedMDByMid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaData }
     *     
     */
    public void setGetSharedMDByMid(MetaData value) {
        this.getSharedMDByMid = value;
    }

}
