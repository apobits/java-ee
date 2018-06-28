/**
 * 
 */
package web.learning.services.soap.servletclient;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

/**
 * @author apobits@gmail.com
 *
 */
@WebServlet(urlPatterns = "webservlet")
public class ServletClient extends HttpServlet {

    @WebServiceRef
    PersonService service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PersonIF1 port = service.getPersonPort();
	port.test();
    }

}
