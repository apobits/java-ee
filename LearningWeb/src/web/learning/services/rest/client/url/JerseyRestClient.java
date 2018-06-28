/**
 * 
 */
package web.learning.services.rest.client.url;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

/**
 * @author apobits@gmail.com
 *
 */
public class JerseyRestClient {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Client c = Client.create();
	WebResource wr = c.resource("http://localhost:8081/LearningWeb/PersonApp/person/1");
	System.out.println(wr.entity("3").post(String.class));

    }

}
