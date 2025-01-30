package in.pwskills.om.bean;

import org.springframework.stereotype.Component;

@Component("bank")
public class Bank {
	
	public double calculateCompoundInterest(double pamt, double rate, double time) {
		return (pamt*Math.pow(1+(rate/100), time));
	}

}
