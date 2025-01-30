package in.pwskills.om.cfg;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import in.pwskills.om.bean.Employee;
import in.pwskills.om.bean.WishMsgGenerator;

@Configuration
public class AppConfig {
	
	static {
		System.out.println("AppConfig.class file is loading..");
		
	}
	
	public AppConfig() {
		System.out.println("AppConfig object is  created using Zero param constructor..");
	}
	
	
	@Bean(name="wish1")
	@Scope("singleton")
	public WishMsgGenerator getInstance1() {
		System.out.println("AppConfig.getInstance1()");
		WishMsgGenerator wishMsgGenerator = new WishMsgGenerator();
		LocalDateTime ldt = LocalDateTime.now();
		wishMsgGenerator.setLdt(ldt);
		
		return wishMsgGenerator;
		
	}
	
	@Bean(name="wish2")
	@Scope("prototype")
	public WishMsgGenerator getInstance2() {
		System.out.println("AppConfig.getInstance2()");
		WishMsgGenerator wishMsgGenerator = new WishMsgGenerator();
		LocalDateTime ldt = LocalDateTime.now();
		wishMsgGenerator.setLdt(ldt);
		
		return wishMsgGenerator;
		
	}

}
