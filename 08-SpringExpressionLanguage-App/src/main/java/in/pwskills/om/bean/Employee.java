package in.pwskills.om.bean;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("employee")
@PropertySource("application.properties")
public class Employee {
	
	@Value("${info.emp.name}")
	private String ename;
	
	@Value("${info.emp.age}")
	private String eage;
	
	@Value("${info.emp.friends}")
	private List<String> friends;
	
	@Value("${info.emp.ph}")
	private Set<String> phoneNumber;
	
	@Value("#{${info.emp.account}}")
	private Map<String, Long> account;
	
	@Value("#{10<20 ? 5000 : 3000 }")
	private Float balance;
	
	@Value("#{T(java.time.LocalDate).now()}")
    private LocalDate currentDate;
	
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eage=" + eage + ", friends=" + friends + ", phoneNumber=" + phoneNumber
				+ ", account=" + account + ", balance=" + balance + ", currentDate=" + currentDate + "]";
	}
	

}
