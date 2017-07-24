package learning.ejb.stateless;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class Stateless1
 */
@Stateless
@LocalBean
public class Stateless1 {

	@PersistenceContext(unitName = "lotteries")
	private EntityManager em;

	public void doSomething() {
		em.createNativeQuery("update test set FIELD1 ='ALBIN' WHERE FIELD1 ='albin'").executeUpdate();

		em.createNativeQuery("update test1 set COLUMN1='ALBIN' where COLUMN1='albin'").executeUpdate();
	}

}
