/**
 * 
 */
package java.web.learning.services.soap;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.ws.soap.MTOM;

/**
 * @author apobits@gmail.com
 *
 */
@MTOM
@WebService
public class BinaryWSMTOM {

	public @XmlMimeType("application/octect-stream") byte[] getSomethingBinary(
			@XmlMimeType("application/octect-stream") byte[] data) {

		System.out.println("The received data is: " + new String(data));

		return data;
	}

}
