package in.pwskills.om.bean;

import org.springframework.stereotype.Component;

@Component(value="FedEx")
public class FedEx implements ICourier {


	
	
	@Override
	public String orderConfirmation(Integer oid) {
		return "item : "+ oid + "order id is dilivered using FedEx";
	}
	

}
