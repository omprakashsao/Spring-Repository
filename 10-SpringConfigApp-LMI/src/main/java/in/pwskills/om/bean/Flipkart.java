package in.pwskills.om.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Flipkart {
	
//	@Autowired
//	@Qualifier("FedEx")
	
	@Value("#{FedEx}")
	private ICourier courier;
	
	

	public ICourier getCourier() {
		 courier = lmiMethod();	
		return courier;
	}

	@Lookup(value="FedEx")
	public ICourier lmiMethod() {
		return null;
	}


	public void setCourier(ICourier courier) {
		this.courier = courier;
	}



	@Override
	public String toString() {
		return "Flipkart [courier=" + courier + "]";
	}
	
	

}
