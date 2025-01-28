package in.pwskills.om.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.pwskills.om.bean.Employee;

@Configuration
public class AppConfig {
	
	static {
		System.out.println("AppConfig.class file is loading..");
		
	}
	
	public AppConfig() {
		System.out.println("AppConfig object is  created using Zero param constructor..");
	}
	
	
	@Bean(name="emp")
	public Employee getInstance() {
		Employee employee = new Employee();
		employee.setPid(1);
		employee.setPname("Om Prakash");
		employee.setPage(23);
		employee.setPaddress("bhilai");
		
		return employee;
	}

}
