
package com.millicom.rm.sync.client.clicklicense;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.1-SNAPSHOT
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "resourcesManagerFault", targetNamespace = "http://xmlns.tigo.com/TigoFS/ResourcesManagerFault/V1/schema")
public class QueryLicensesFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ResourcesManagerFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public QueryLicensesFault(String message, ResourcesManagerFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public QueryLicensesFault(String message, ResourcesManagerFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.millicom.rm.sync.client.clicklicense.ResourcesManagerFault
     */
    public ResourcesManagerFault getFaultInfo() {
        return faultInfo;
    }

}
