/**
 * 
 */
package web.learning.services.soap.binary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.activation.DataHandler;
import javax.ws.rs.core.MediaType;
import javax.xml.ws.soap.MTOMFeature;

/**
 * @author Administrador
 *
 */
public class BinaryWSMTOMClient_SA {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		String greeting = "Hello Albin";

		BinaryWSMTOMService service = new BinaryWSMTOMService();

		BinaryWSMTOM port = service.getBinaryWSMTOMPort(new MTOMFeature());

		DataHandler handler = new DataHandler(greeting.getBytes(), MediaType.APPLICATION_OCTET_STREAM);

		DataHandler result = port.getSomethingBinary(handler);

		InputStreamReader reader = new InputStreamReader(result.getInputStream());

		BufferedReader b = new BufferedReader(reader);
		String line = null;
		while ((line = b.readLine()) != null) {
			System.out.println(line);
		}

	}

}
