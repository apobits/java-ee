/**
 * 
 */
package learning.ejb.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import learning.ejb.model.Person;

/**
 * @author apobits@gmail.com
 *
 */
@Stateless
public class PersonBean {

    @PersistenceContext(unitName = "apo")
    private EntityManager em;

    public Person getPerson(long id) {
	return em.find(Person.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<Person> getPersons() {
	return em.createQuery("Select p from Person p").getResultList();
    }

}
