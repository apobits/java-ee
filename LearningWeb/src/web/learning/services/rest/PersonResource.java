/**
 * 
 */
package web.learning.services.rest;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import learning.ejb.business.PersonBean;
import learning.ejb.model.Person;

/**
 * @author apobits@gmail.com
 *
 */
@Path("person")
// @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
// @Produces/@Consumes target can be a type or method, method annotation
// overrides type
// annotations

public class PersonResource {

	@EJB
	private PersonBean personBean;

	@POST
	@Path("{id}")
	// @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	// if no @Produces/@Consumes is specified all media types are accepted */*
	public Person getPerson(@PathParam("id") long id) {

		return personBean.getPerson(id);

	}

	@Produces("text/xml")
	@GET
	public String getSomething(@QueryParam("name") String name, @QueryParam("lastName") String lastName) {
		return name + ":" + lastName;
	}

	@GET
	@Produces("text/html")
	public String getSomethingElse(@QueryParam("name") String name, @QueryParam("lastName") String lastName) {
		return name + ";" + lastName;
	}

	@Path("all")
	public Persons getPerson() {
		return new Persons(personBean);
	}

	@Consumes(MediaType.APPLICATION_JSON)
	@PUT
	@Path("save")
	public String savePerson(Person person) {
		
		personBean.savePerson(person);

		return "Person " + person + " has been saved successfully";
	}

}
