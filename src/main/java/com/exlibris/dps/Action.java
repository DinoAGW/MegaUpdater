
package com.exlibris.dps;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für action.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="action">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INFO"/>
 *     &lt;enumeration value="LOCK"/>
 *     &lt;enumeration value="OVERRIDELOCK"/>
 *     &lt;enumeration value="COMMIT"/>
 *     &lt;enumeration value="ROLLBACK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "action")
@XmlEnum
public enum Action {

    INFO,
    LOCK,
    OVERRIDELOCK,
    COMMIT,
    ROLLBACK;

    public String value() {
        return name();
    }

    public static Action fromValue(String v) {
        return valueOf(v);
    }

}
