/**
 * 
 */
package learning.ejb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author apobits@gmail.com
 *
 */
@Entity
@XmlRootElement(name = "person")
@XmlType(propOrder = { "id", "name", "lastName" })
public class Person {

    private Long id;

    private String name;

    private String lastName;

    @Id
    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    @Column(name = "LAST_NAME")
    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

}
