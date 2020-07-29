/**
 * 
 */
package web.learning.services.providerendpoint;

import java.io.ByteArrayInputStream;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Provider;
import javax.xml.ws.WebServiceProvider;

/**
 * @author apobits@gmail.com
 *
 */
@WebServiceProvider
public class ProviderWS implements Provider<Source> {

    @Override
    public Source invoke(Source request) {
	Source sourceResponse = null;
	try {
	    DOMResult domResult = new DOMResult();
	    Transformer transformer = TransformerFactory.newInstance().newTransformer();
	    transformer.transform(request, domResult);
	    String message = "<response>" + domResult.getNode().getFirstChild().getFirstChild().getNodeValue()
		    + "</response>";
	    System.out.println(domResult.getNode().getFirstChild().getFirstChild().getNodeValue());
	    sourceResponse = new StreamSource(new ByteArrayInputStream(message.getBytes()));
	} catch (Exception e) {

	}
	return sourceResponse;
    }

}
