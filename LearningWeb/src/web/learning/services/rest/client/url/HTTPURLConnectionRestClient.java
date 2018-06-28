/**
 * 
 */
package web.learning.services.rest.client.url;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author apobits@gmail.com
 *
 */
public class HTTPURLConnectionRestClient {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
	URL url = new URL("http://localhost:8081/LearningWeb/PersonApp/person/1");
	HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
	urlConn.setRequestMethod("GET");
	urlConn.setDoOutput(true);
	urlConn.connect();
	DataOutputStream dos = new DataOutputStream(urlConn.getOutputStream());
	dos.writeChars("5");
	
	InputStreamReader isr = new InputStreamReader(urlConn.getInputStream());
	BufferedReader br = new BufferedReader(isr);

	String line = null;
	while ((line = br.readLine()) != null) {
	    System.out.println(line);
	}

	br.close();
    }

}
