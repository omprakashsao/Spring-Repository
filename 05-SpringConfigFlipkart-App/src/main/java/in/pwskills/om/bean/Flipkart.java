package in.pwskills.om.bean;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Flipkart {
	
	@Autowired
	@Qualifier("FedEx")
	private ICourier courier;

	public String shopping(String items[], Float prices[]) {
		
		
		Float totalAmount = 0.0f;
		
		 for (Float cost : prices) {
			totalAmount += cost;
		}
		 
		 return "items : "+Arrays.toString(items) +  "prices : "+ Arrays.toString(prices)+ "total amount : "+ totalAmount + courier.orderConfirmation(new Random().nextInt(100));
	}
	


}
