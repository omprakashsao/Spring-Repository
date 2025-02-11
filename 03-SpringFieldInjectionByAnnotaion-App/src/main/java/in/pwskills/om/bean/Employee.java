package in.pwskills.om.bean;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("application.properties")
public class Employee {
	
	@Value("${info.emp.id}")
	private Integer eid;
	
	@Value("${info.emp.name}")
	private String ename;
	
	@Value("${info.emp.address}")
	private String eaddress;
	
	@Autowired
	private LocalDateTime date;
	
	static {
		System.out.println("Employee .class file is loading ..");
	}
	
	public Employee() {
		System.out.println("Employee object created using zero param contructor..");
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + ", date=" + date + "]";
	}
	
	
}
