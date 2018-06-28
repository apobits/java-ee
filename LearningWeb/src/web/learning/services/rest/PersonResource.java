/**
 * 
 */
package web.learning.services.rest;

import javax.ejb.EJB;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

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
    public Person getPerson(@PathParam("id") long id, String lol) {
	System.out.println(lol);
	return personBean.getPerson(id);

    }

    @Path("all")
    public Persons getPerson() {
	return new Persons(personBean);
    }

}
