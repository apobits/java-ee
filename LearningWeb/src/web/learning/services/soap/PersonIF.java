/**
 * 
 */
package web.learning.services.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.naming.NamingException;

/**
 * @author apobits@gmail.com
 *
 */
@WebService
public interface PersonIF {

    @WebMethod
    public learning.ejb.model.Person getPerson(long id) throws NamingException;

}
