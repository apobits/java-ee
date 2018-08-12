
package com.millicom.rm.sync.client.clicklicense;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.1-SNAPSHOT
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "QueryClicLicensesManagerSOAPQSService", targetNamespace = "http://www.resourcesmanager.com", wsdlLocation = "http://10.5.24.25:8012/ResourcesManager/FSP/QueryClicLicenses?wsdl")
public class QueryClicLicensesManagerSOAPQSService
    extends Service
{

    private final static URL QUERYCLICLICENSESMANAGERSOAPQSSERVICE_WSDL_LOCATION;
    private final static WebServiceException QUERYCLICLICENSESMANAGERSOAPQSSERVICE_EXCEPTION;
    private final static QName QUERYCLICLICENSESMANAGERSOAPQSSERVICE_QNAME = new QName("http://www.resourcesmanager.com", "QueryClicLicensesManagerSOAPQSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.5.24.25:8012/ResourcesManager/FSP/QueryClicLicenses?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        QUERYCLICLICENSESMANAGERSOAPQSSERVICE_WSDL_LOCATION = url;
        QUERYCLICLICENSESMANAGERSOAPQSSERVICE_EXCEPTION = e;
    }

    public QueryClicLicensesManagerSOAPQSService() {
        super(__getWsdlLocation(), QUERYCLICLICENSESMANAGERSOAPQSSERVICE_QNAME);
    }

    public QueryClicLicensesManagerSOAPQSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), QUERYCLICLICENSESMANAGERSOAPQSSERVICE_QNAME, features);
    }

    public QueryClicLicensesManagerSOAPQSService(URL wsdlLocation) {
        super(wsdlLocation, QUERYCLICLICENSESMANAGERSOAPQSSERVICE_QNAME);
    }

    public QueryClicLicensesManagerSOAPQSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, QUERYCLICLICENSESMANAGERSOAPQSSERVICE_QNAME, features);
    }

    public QueryClicLicensesManagerSOAPQSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public QueryClicLicensesManagerSOAPQSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns QueryClicLicenses
     */
    @WebEndpoint(name = "QueryClicLicensesManagerSOAPQSPort")
    public QueryClicLicenses getQueryClicLicensesManagerSOAPQSPort() {
        return super.getPort(new QName("http://www.resourcesmanager.com", "QueryClicLicensesManagerSOAPQSPort"), QueryClicLicenses.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns QueryClicLicenses
     */
    @WebEndpoint(name = "QueryClicLicensesManagerSOAPQSPort")
    public QueryClicLicenses getQueryClicLicensesManagerSOAPQSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.resourcesmanager.com", "QueryClicLicensesManagerSOAPQSPort"), QueryClicLicenses.class, features);
    }

    private static URL __getWsdlLocation() {
        if (QUERYCLICLICENSESMANAGERSOAPQSSERVICE_EXCEPTION!= null) {
            throw QUERYCLICLICENSESMANAGERSOAPQSSERVICE_EXCEPTION;
        }
        return QUERYCLICLICENSESMANAGERSOAPQSSERVICE_WSDL_LOCATION;
    }

}