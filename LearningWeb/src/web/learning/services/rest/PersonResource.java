/**
 * 
 */
package web.learning.services.rest;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.xml.ws.BindingProvider;

import com.millicom.rm.sync.client.clicklicense.QueryClicLicenses;
import com.millicom.rm.sync.client.clicklicense.QueryClicLicensesManagerSOAPQSService;
import com.millicom.rm.sync.client.clicklicense.QueryLicensesRequest;
import com.millicom.rm.sync.client.clicklicense.QueryLicensesResponse;

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

		QueryClicLicenses port = new QueryClicLicensesManagerSOAPQSService().getQueryClicLicensesManagerSOAPQSPort();

		((BindingProvider) port).getRequestContext().put("ws-security.username", "IT_FSAR");
		((BindingProvider) port).getRequestContext().put("ws-security.password", "PruebasFS.1");

		QueryLicensesRequest request = new QueryLicensesRequest();
		request.setOperationName("Millicom");
		try {
			QueryLicensesResponse response = port.queryLicenses(request);
			System.out.println(response.getLicensesNumber());
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println(lol);
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

}
