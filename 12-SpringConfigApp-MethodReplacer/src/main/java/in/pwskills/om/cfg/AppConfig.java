package in.pwskills.om.cfg;



import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "in.pwskills.om")
@ImportResource("in/pwskills/om/cfg/applicationContext.xml")
public class AppConfig {
	
	
	

}
