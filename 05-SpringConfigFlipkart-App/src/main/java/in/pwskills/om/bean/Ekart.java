package in.pwskills.om.bean;

import org.springframework.stereotype.Component;

@Component //(value="courier")
public class Ekart implements ICourier {

	@Override
	public String orderConfirmation(Integer oid) {
		// TODO Auto-generated method stub
		return "item : "+ oid + "order id is dilivered using Ekart";
	}

	
	

}
