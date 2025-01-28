package in.pwskills.om.cfg;



import java.sql.DriverManager;
import java.time.LocalDateTime;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "in.pwskills.om")
@PropertySource("application.properties")
public class AppConfig {
	
	static {
		System.out.println("AppConfig.class file is loading..");
		
	}
	
	public AppConfig() {
		System.out.println("AppConfig object is  created using Zero param constructor..");
	}
	
	@Autowired
	Environment environment;
	
	@Bean(value="ds")
	public DataSource getConnection() {
		
	
			  DriverManagerDataSource ds = new DriverManagerDataSource();
			  ds.setUrl(environment.getProperty("db.mysql.url"));
			  ds.setUsername(environment.getProperty("db.mysql.username"));
			  ds.setPassword(environment.getProperty("db.mysql.password"));
			  
			  
		return ds;
	}
	

}
