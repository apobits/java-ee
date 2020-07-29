/**
 *
 */
package web.learning.services.soap;

import javax.jws.WebService;

/**
 * @author apobits@gmail.com
 *
 */
@WebService
public class PersonParent {

    public void testParent(String name) {
	System.out.println(name);
    }

}
