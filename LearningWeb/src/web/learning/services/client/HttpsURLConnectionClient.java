/**
 * 
 */
package web.learning.services.client;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/**
 * @author apobits@gmail.com
 *
 */
public class HttpsURLConnectionClient {

	private static void useHttpURLConnection(URL url) throws IOException {
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.connect();
		BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}

	private static void useHttpsURLConnection(URL url) throws IOException {
		HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
		connection.connect();
		BufferedInputStream bis = new BufferedInputStream(connection.getInputStream());
		int byt3 = -1;
		while ((byt3 = bis.read()) != -1) {
			System.out.print((char) byt3);
		}
		System.out.println(connection.getCipherSuite());
		Certificate[] certificates = connection.getServerCertificates();
		for (int i = 0; i < certificates.length; i++) {
			System.out.println(certificates[i].toString());
		}

	}

	private TrustManager[] getTrustMgr() {
		// No exceptions thrown in any of the methods.
		TrustManager[] certs = new TrustManager[] { new X509TrustManager() {
			public X509Certificate[] getAcceptedIssuers() {

				return null;
			}

			public void checkClientTrusted(X509Certificate[] certs, String type) {
			}

			public void checkServerTrusted(X509Certificate[] certs, String type) {
			}
		} };
		return certs;
	}

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.google.com/");
		try {
			useHttpURLConnection(url);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
