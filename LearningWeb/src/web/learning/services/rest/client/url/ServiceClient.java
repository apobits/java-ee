/**
 * 
 */
package web.learning.services.rest.client.url;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import web.learning.services.soap.PersonIF1;

/**
 * @author apobits@gmail.com
 *
 */
public class ServiceClient {

    public static void main(String[] args) throws MalformedURLException {

	Service service = Service.create(new URL("http://localhost:8081/LearningWeb/Person?wsdl"),
		new QName("http://soap.services.learning.web/", "PersonService"));
	PersonIF1 i = service.getPort(new QName("http://soap.services.learning.web/", "PersonPort"), PersonIF1.class);
	i.test();
    }

}
