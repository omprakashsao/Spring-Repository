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
        		Flipkart bean1 = context.getBean(Flipkart.class);
        		System.out.println("Flipkart : "+bean1.hashCode() + "  Courier: "+ bean1.getCourier().hashCode());
        		
        		Flipkart bean2 = context.getBean(Flipkart.class);
        		System.out.println("Flipkart : "+bean2.hashCode() + "  Courier: "+ bean2.getCourier().hashCode());
        	
        
        ((AbstractApplicationContext) context).close();
        
    }
}
