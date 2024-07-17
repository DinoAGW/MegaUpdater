
package com.exlibris.dps;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getRipStatusInfoResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getRipStatusInfoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getRipStatusInfo" type="{http://dps.exlibris.com/}ripStatusInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRipStatusInfoResponse", propOrder = {
    "getRipStatusInfo"
})
public class GetRipStatusInfoResponse {

    protected RipStatusInfo getRipStatusInfo;

    /**
     * Ruft den Wert der getRipStatusInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RipStatusInfo }
     *     
     */
    public RipStatusInfo getGetRipStatusInfo() {
        return getRipStatusInfo;
    }

    /**
     * Legt den Wert der getRipStatusInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RipStatusInfo }
     *     
     */
    public void setGetRipStatusInfo(RipStatusInfo value) {
        this.getRipStatusInfo = value;
    }

}
