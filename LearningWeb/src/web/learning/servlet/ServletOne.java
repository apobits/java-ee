package web.learning.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet(value = "servletOne")
public class ServletOne implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
	return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse)
		    throws ServletException, IOException {

	servletResponse.getWriter().write("Testing servlet");
    }

    @Override
    public String getServletInfo() {
	return null;
    }

    @Override
    public void destroy() {

    }
}
