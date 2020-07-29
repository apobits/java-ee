/**
 * 
 */
package web.learning.services.rest.client.url;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
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
        test();
//	URL url = new URL("http://localhost:8081/LearningWeb/PersonApp/person/test1");
//	HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
//	urlConn.setRequestMethod("POST");
//	urlConn.setDoOutput(true);
//	urlConn.connect();
//	DataOutputStream dos = new DataOutputStream(urlConn.getOutputStream());
//	dos.writeChars("{name:'albin'}");
//
//	InputStreamReader isr = new InputStreamReader(urlConn.getInputStream());
//	BufferedReader br = new BufferedReader(isr);
//
//	String line = null;
//	while ((line = br.readLine()) != null) {
//	    System.out.println(line);
//	}
//
//	br.close();
    }

    public static void test() throws IOException {
	URL url = new URL("https://oracleapigw.tigo.net.bo:9443/OutgoingMessagesAdapters/PS/AssignmentCompleteAdapter/V2?wsdl");
	HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
	urlConn.setRequestMethod("POST");
	urlConn.setDoOutput(true);
	urlConn.connect();
	DataOutputStream dos = new DataOutputStream(urlConn.getOutputStream());
	dos.writeChars("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"
			+ "   <soapenv:Header>\n"
			+ "      <wsse:Security soapenv:mustUnderstand=\"1\" xmlns:wsse=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\">\n"
			+ "         <wsse:UsernameToken wsu:Id=\"UsernameToken-B2918E5DA6EAA5A9C715876830918261\">\n"
			+ "            <wsse:Username>usrcliser</wsse:Username>\n"
			+ "            <wsse:Password Type=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText\">telecel1</wsse:Password>\n"
			+ "            <wsse:Nonce EncodingType=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary\">/cUBnZOQFgmerJ+t7k/Agg==</wsse:Nonce>\n"
			+ "            <wsu:Created>2020-04-23T23:04:51.818Z</wsu:Created>\n"
			+ "         </wsse:UsernameToken>\n" + "      </wsse:Security>\n" + "   </soapenv:Header>\n"
			+ "   <soapenv:Body>\n" + "      <ProvisioningRequest Destination=\"1\" CreatedBy=\"1\">\n"
			+ "         <MCPartsInStock>\n" + "            <Area>\n"
			+ "               <Name>Bolivia</Name>\n" + "            </Area>\n"
			+ "            <ExternalRefID>24-3008-15416789298182014a563-864b-47ad-b404-f45f0554526c</ExternalRefID>\n"
			+ "            <ProvisioningAction>A</ProvisioningAction>\n"
			+ "            <Serial>F81D0FF00003</Serial>\n" + "            <Service>\n"
			+ "               <ExternalRefID>4656236+7051920</ExternalRefID>\n"
			+ "               <ServiceName>R HFC CORP - 16 Mbps 1</ServiceName>\n"
			+ "            </Service>\n" + "            <TaskCallID>BOLDS0001649988</TaskCallID>\n"
			+ "            <TaskNumber>1</TaskNumber>\n" + "         </MCPartsInStock>\n"
			+ "      </ProvisioningRequest>\n" + "   </soapenv:Body>\n" + "</soapenv:Envelope>");

	InputStreamReader isr = new InputStreamReader(urlConn.getInputStream());
	BufferedReader br = new BufferedReader(isr);

	String line = null;
	while ((line = br.readLine()) != null) {
	    System.out.println(line);
	}

	br.close();
    }

}
