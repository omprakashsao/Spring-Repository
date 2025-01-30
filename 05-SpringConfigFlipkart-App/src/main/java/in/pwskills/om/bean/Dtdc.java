package in.pwskills.om.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Dtdc implements ICourier {


	@Override
	public String orderConfirmation(Integer oid) {
		
		return "item : "+ oid + "order id is dilivered using DTCD";
	}

	
	
	

}
