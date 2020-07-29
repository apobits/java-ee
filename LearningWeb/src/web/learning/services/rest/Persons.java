/**
 * 
 */
package web.learning.services.rest;

import java.util.List;

import javax.ws.rs.GET;

import learning.ejb.business.PersonBean;
import learning.ejb.model.Person;

/**
 * @author apobits@gmail.com
 *
 */
public class Persons {

	private PersonBean personBean;

	public Persons(PersonBean personBean) {
		this.personBean = personBean;
	}

	@GET
	public List<Person> getPersons() {
		return personBean.getPersons();
	}

}
