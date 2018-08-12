
package com.millicom.rm.sync.client.clicklicense;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="licensesNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "licensesNumber"
})
@XmlRootElement(name = "queryLicensesResponse", namespace = "http://xmlns.tigo.com/TigoFS/FieldServiceProxy/QueryClicLicensesResponse/V1/schema")
public class QueryLicensesResponse {

    @XmlElement(namespace = "http://xmlns.tigo.com/TigoFS/FieldServiceProxy/QueryClicLicensesResponse/V1/schema", required = true)
    protected BigInteger licensesNumber;

    /**
     * Obtiene el valor de la propiedad licensesNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLicensesNumber() {
        return licensesNumber;
    }

    /**
     * Define el valor de la propiedad licensesNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLicensesNumber(BigInteger value) {
        this.licensesNumber = value;
    }

}
