package in.pwskills.om.bean;

import java.time.LocalDateTime;

public class WishMsgGenerator {
	
	static {
		System.out.println("WhisMsgGenerator .class file is loading ..");
	}
	
	public WishMsgGenerator() {
		System.out.println("WhisMsgGenerator.WhisMsgGenerator() object created using zero param contructor..");
	}
	
	private LocalDateTime ldt;
	
	
	
	public LocalDateTime getLdt() {
		return ldt;
	}


	//setter style injection
	public void setLdt(LocalDateTime ldt) {
		this.ldt = ldt;
	}



	public void wish(String name) {
		int hour = ldt.getHour();
		
		if(hour< 11) {
			System.out.println("Good morning "+ name);
		} else if(hour < 16) System.out.println("Good afternoon "+ name);
		else if(hour < 20) System.out.println("Good evening "+ name);
		else System.out.println("Good Night "+ name);	
	}

}
