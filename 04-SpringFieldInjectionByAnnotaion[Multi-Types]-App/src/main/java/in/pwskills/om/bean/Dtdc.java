package in.pwskills.om.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Dtdc implements ICourier {

	

	@Override
	public String toString() {
		return "Dtdc []";
	}

	@Override
	public String orderConfirmation(Integer oid) {
		
		return null;
	}

	
	
	

}
