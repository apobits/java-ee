/**
 * 
 */
package java.web.learning.services.soap;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.ws.WebServiceContext;

import learning.ejb.business.PersonBean;

/**
 * @author apobits@gmail.com
 *
 */
@WebService()

@Resource(name = "context1", type = javax.xml.ws.WebServiceContext.class) // use initial context lookup with
// java:comp/env/"name" to obtain the
// reference at runtime
public class Person extends PersonParent {

	@Resource
	WebServiceContext context2;

	@EJB
	PersonBean personBean;

	@WebMethod
	public learning.ejb.model.Person getPerson(long id) throws NamingException {
		new InitialContext().lookup("java:comp/env/context1");
		context2.getMessageContext();
		return personBean.getPerson(id);
	}

	public void test(String test) {
		System.out.println(test);
		System.out.println("test method called from Person web service");
	}

}
