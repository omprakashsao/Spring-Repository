package in.pwskills.om.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.om.bean.Employee;
import in.pwskills.om.bean.Flipkart;
import in.pwskills.om.bean.Employee;
import in.pwskills.om.cfg.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        		Flipkart bean = context.getBean(Flipkart.class);
        		String status = bean.shopping(new String[] {"ball", "bat", "carrom"}, new Float[] {1200.0f, 1000.0f, 4500.0f}  );
        		System.out.println(status);
        	
        
        ((AbstractApplicationContext) context).close();
        
    }
}
