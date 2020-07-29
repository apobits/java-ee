package web.learning.mb;

import javax.faces.bean.ManagedBean;
import javax.faces.component.UIInput;
import java.io.Serializable;

//Using managed beans with a backing bean(UI classes), no need to implement Serializable interface
@ManagedBean
public class Login2 implements Serializable {

    private UIInput name;

    private UIInput lastName;

    public UIInput getName() {
	return name;
    }

    public void setName(UIInput name) {
	this.name = name;
    }

    public UIInput getLastName() {
	return lastName;
    }

    public void setLastName(UIInput lastName) {
	this.lastName = lastName;
    }

    public Double getPrice() {
	return 13.35;
    }
}
