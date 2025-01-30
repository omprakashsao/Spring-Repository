package in.pwskills.om.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.om.bean.Cricketer;
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
        Cricketer bean = context.getBean(Cricketer.class);
        		 bean.wicketKepping();
        		 bean.ball();
        		 bean.batting();
        		
        
        ((AbstractApplicationContext) context).close();
        
    }
}
