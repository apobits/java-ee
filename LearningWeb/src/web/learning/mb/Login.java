package web.learning.mb;

import javax.faces.bean.ManagedBean;

//Using managed beans, not need to implement Serializable interface
@ManagedBean
public class Login {
    private String name;
    private String lastName;

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }
}
