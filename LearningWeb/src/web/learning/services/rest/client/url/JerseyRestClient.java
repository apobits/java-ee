/**
 * 
 */
package web.learning.services.rest.client.url;

import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.client.oauth1.ConsumerCredentials;
import org.glassfish.jersey.client.oauth1.OAuth1AuthorizationFlow;
import org.glassfish.jersey.client.oauth1.OAuth1ClientSupport;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import learning.ejb.model.Person;

/**
 * @author apobits@gmail.com
 *
 */
public class JerseyRestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ConsumerCredentials consumerCredentials = new ConsumerCredentials("FMkOk7RUZaNLX6LPVGi6LjsZfBvq8UPu",
				"ALOG1TPrz6hoPmvz");

		OAuth1AuthorizationFlow flow = OAuth1ClientSupport.builder(consumerCredentials)
				.authorizationFlow("https://qa.api.tigo.com/oauth/client_credential/accesstoken",
						"https://qa.api.tigo.com/oauth/client_credential/accesstoken",
						"https://qa.api.tigo.com/oauth/client_credential/accesstoken")
				.build();
		
		

		System.exit(1);
		Client c = Client.create();
		WebResource wr = c.resource("http://localhost:8081/LearningWeb/PersonApp/person/3");
		Person person = wr.post(Person.class);
		System.out.println(person);

		WebResource save = c.resource("http://localhost:8081/LearningWeb/PersonApp/person/save");

		save.type(MediaType.APPLICATION_JSON).entity(new Person(Long.valueOf(5), "Nidia", "Ortiz")).put();

	}

}
