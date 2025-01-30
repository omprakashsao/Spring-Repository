package in.pwskills.om.bean;

import java.time.LocalDateTime;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
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

	@PostConstruct
	public void init() {
		System.out.println("Intialization ....");
		ldt = LocalDateTime.now();
		
	}


	public void wish(String name) {
		int hour = ldt.getHour();
		
		if(hour< 11) {
			System.out.println("Good morning "+ name);
		} else if(hour < 16) System.out.println("Good afternoon "+ name);
		else if(hour < 20) System.out.println("Good evening "+ name);
		else System.out.println("Good Night "+ name);	
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("distroyed ...");
		ldt=null;
	}

}
