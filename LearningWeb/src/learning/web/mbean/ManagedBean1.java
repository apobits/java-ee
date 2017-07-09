/**
 * 
 */
package learning.web.mbean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import learning.ejb.stateless.Stateless1;

/**
 * @author aposo
 *
 */
@ManagedBean
public class ManagedBean1 {

	@EJB(lookup="java:module/Stateless1")
	Stateless1 stateless1;

	public void doSomething() {
		stateless1.doSomething();
	}

}
