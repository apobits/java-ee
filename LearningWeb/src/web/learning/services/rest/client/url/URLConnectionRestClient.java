package web.learning.services.rest.client.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionRestClient {

	public static void main(String[] args) throws MalformedURLException, IOException {

		URLConnection connection = new URL("http://localhost:8081/LearningWeb/PersonApp/person/all").openConnection();
		connection.connect();

		InputStreamReader isr = new InputStreamReader(connection.getInputStream());
		BufferedReader br = new BufferedReader(isr);
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

	}

}
