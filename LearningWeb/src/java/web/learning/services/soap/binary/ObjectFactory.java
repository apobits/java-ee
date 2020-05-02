
package java.web.learning.services.soap.binary;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the java.learning.services.soap.binary package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetSomethingBinary_QNAME = new QName("http://soap.services.learning.web/", "getSomethingBinary");
    private final static QName _GetSomethingBinaryResponse_QNAME = new QName("http://soap.services.learning.web/", "getSomethingBinaryResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: java.learning.services.soap.binary
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSomethingBinary }
     * 
     */
    public GetSomethingBinary createGetSomethingBinary() {
        return new GetSomethingBinary();
    }

    /**
     * Create an instance of {@link GetSomethingBinaryResponse }
     * 
     */
    public GetSomethingBinaryResponse createGetSomethingBinaryResponse() {
        return new GetSomethingBinaryResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSomethingBinary }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSomethingBinary }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.services.learning.web/", name = "getSomethingBinary")
    public JAXBElement<GetSomethingBinary> createGetSomethingBinary(GetSomethingBinary value) {
        return new JAXBElement<GetSomethingBinary>(_GetSomethingBinary_QNAME, GetSomethingBinary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSomethingBinaryResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSomethingBinaryResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.services.learning.web/", name = "getSomethingBinaryResponse")
    public JAXBElement<GetSomethingBinaryResponse> createGetSomethingBinaryResponse(GetSomethingBinaryResponse value) {
        return new JAXBElement<GetSomethingBinaryResponse>(_GetSomethingBinaryResponse_QNAME, GetSomethingBinaryResponse.class, null, value);
    }

}
