package in.pwskills.om.bean;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("bank")
public class Bank {
	
	@Scheduled(initialDelay = 2000, /*fixedDelay = 3000 */ fixedRate = 2000)
	public void generateDate() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("generate report on Date: "+ new Date());
	}
}
