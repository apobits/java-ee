
package web.learning.services.soap.binary;

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
@WebServiceClient(name = "BinaryWSMTOMService", targetNamespace = "http://soap.services.learning.web/", wsdlLocation = "http://localhost:8081/LearningWeb/BinaryWSMTOM?wsdl")
public class BinaryWSMTOMService
    extends Service
{

    private final static URL BINARYWSMTOMSERVICE_WSDL_LOCATION;
    private final static WebServiceException BINARYWSMTOMSERVICE_EXCEPTION;
    private final static QName BINARYWSMTOMSERVICE_QNAME = new QName("http://soap.services.learning.web/", "BinaryWSMTOMService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/LearningWeb/BinaryWSMTOM?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BINARYWSMTOMSERVICE_WSDL_LOCATION = url;
        BINARYWSMTOMSERVICE_EXCEPTION = e;
    }

    public BinaryWSMTOMService() {
        super(__getWsdlLocation(), BINARYWSMTOMSERVICE_QNAME);
    }

    public BinaryWSMTOMService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BINARYWSMTOMSERVICE_QNAME, features);
    }

    public BinaryWSMTOMService(URL wsdlLocation) {
        super(wsdlLocation, BINARYWSMTOMSERVICE_QNAME);
    }

    public BinaryWSMTOMService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BINARYWSMTOMSERVICE_QNAME, features);
    }

    public BinaryWSMTOMService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BinaryWSMTOMService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BinaryWSMTOM
     */
    @WebEndpoint(name = "BinaryWSMTOMPort")
    public BinaryWSMTOM getBinaryWSMTOMPort() {
        return super.getPort(new QName("http://soap.services.learning.web/", "BinaryWSMTOMPort"), BinaryWSMTOM.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BinaryWSMTOM
     */
    @WebEndpoint(name = "BinaryWSMTOMPort")
    public BinaryWSMTOM getBinaryWSMTOMPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soap.services.learning.web/", "BinaryWSMTOMPort"), BinaryWSMTOM.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BINARYWSMTOMSERVICE_EXCEPTION!= null) {
            throw BINARYWSMTOMSERVICE_EXCEPTION;
        }
        return BINARYWSMTOMSERVICE_WSDL_LOCATION;
    }

}
