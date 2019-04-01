/**
 * 
 */
package web.learning.services.rest.client.url;

import java.io.InputStreamReader;
import java.net.URL;

/**
 * @author apobits@gmail.com
 *
 */
public class URLRestClient {

	public static void main(String args[]) {
		try {
			URL url = new URL("http://localhost:8081/LearningWeb/PersonApp/person/all");
			InputStreamReader isr = new InputStreamReader(url.openStream());
			int letter = -1;
			while ((letter = isr.read()) != -1) {
				System.out.print((char) letter);
			}
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}

}
