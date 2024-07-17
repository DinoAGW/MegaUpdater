
package com.exlibris.dps;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für updateMD complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="updateMD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="metadata" type="{http://dps.exlibris.com/}metaData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pdsHandle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateMD", propOrder = {
    "commit",
    "metadata",
    "pid",
    "pdsHandle"
})
public class UpdateMD {

    protected Boolean commit;
    @XmlElement(nillable = true)
    protected List<MetaData> metadata;
    @XmlElement(name = "PID")
    protected String pid;
    protected String pdsHandle;

    /**
     * Ruft den Wert der commit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommit() {
        return commit;
    }

    /**
     * Legt den Wert der commit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommit(Boolean value) {
        this.commit = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetaData }
     * 
     * 
     */
    public List<MetaData> getMetadata() {
        if (metadata == null) {
            metadata = new ArrayList<MetaData>();
        }
        return this.metadata;
    }

    /**
     * Ruft den Wert der pid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPID() {
        return pid;
    }

    /**
     * Legt den Wert der pid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPID(String value) {
        this.pid = value;
    }

    /**
     * Ruft den Wert der pdsHandle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdsHandle() {
        return pdsHandle;
    }

    /**
     * Legt den Wert der pdsHandle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdsHandle(String value) {
        this.pdsHandle = value;
    }

}
