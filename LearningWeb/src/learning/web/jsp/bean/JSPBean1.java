/**
 * 
 */
package learning.web.jsp.bean;

import javax.servlet.ServletContext;

/**
 * @author aposo
 *
 */
public class JSPBean1 {

	// Injection does not work for beans created by JSPs
	// @EJB(lookup="java:module/Stateless1")
	// Stateless1 stateless1;
	
	private String name;
	
	private ServletContext context;

	public JSPBean1() {
		name = "Danna";
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ServletContext getContext() {
		return context;
	}

	public void setContext(ServletContext context) {
		this.context = context;
	}

}
