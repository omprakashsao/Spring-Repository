package in.pwskills.om.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="FedEx")
@Scope("prototype")
public class FedEx implements ICourier {


	@Override
	public String toString() {
		return "FedEx []";
	}
	
	@Override
	public String orderConfirmation(Integer oid) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
