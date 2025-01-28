package in.pwskills.om.cfg;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
	
	
	@Bean(name="wish")
	public WishMsgGenerator getInstance() {
		WishMsgGenerator wishMsgGenerator = new WishMsgGenerator();
		LocalDateTime ldt = LocalDateTime.now();
		wishMsgGenerator.setLdt(ldt);
		
		return wishMsgGenerator;
		
	}

}
