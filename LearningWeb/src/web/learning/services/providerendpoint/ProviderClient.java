/**
 * 
 */
package web.learning.services.providerendpoint;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.StringReader;

import javax.xml.namespace.QName;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

/**
 * @author apobits@gmail.com
 *
 */
public class ProviderClient {

    public static String sourceToXMLString(Source result) {
	String xmlResult = null;
	try {
	    TransformerFactory factory = TransformerFactory.newInstance();
	    Transformer transformer = factory.newTransformer();
	    transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
	    transformer.setOutputProperty(OutputKeys.METHOD, "xml");
	    OutputStream out = new ByteArrayOutputStream();
	    StreamResult streamResult = new StreamResult();
	    streamResult.setOutputStream(out);
	    transformer.transform(result, streamResult);
	    xmlResult = streamResult.getOutputStream().toString();
	} catch (TransformerException e) {
	    e.printStackTrace();
	}
	return xmlResult;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

	Service service = Service
		.create(new QName("http://providerendpoint.services.learning.web/", "ProviderWSService"));
	service.addPort(new QName("http://providerendpoint.services.learning.web/", "ProviderWSPort"),
		SOAPBinding.SOAP11HTTP_BINDING, "http://localhost:8081/LearningWeb/ProviderWS?wsdl");
	Dispatch<Source> dispatch = service.createDispatch(
		new QName("http://providerendpoint.services.learning.web/", "ProviderWSPort"), Source.class,
		Service.Mode.PAYLOAD);
	Source sourceResponse = dispatch.invoke(new StreamSource(new StringReader("<request>lol</request>")));

	String response = sourceToXMLString(sourceResponse);
	System.out.println(response);

    }

}
