package in.pwskills.om.bean;

import org.springframework.stereotype.Component;

@Component(value="courier")
public class Ekart implements ICourier {

	@Override
	public String orderConfirmation(Integer oid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Ekart []";
	}
	
	

}
