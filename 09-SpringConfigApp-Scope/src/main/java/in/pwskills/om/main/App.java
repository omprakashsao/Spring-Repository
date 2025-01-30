package in.pwskills.om.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.om.bean.Employee;
import in.pwskills.om.bean.WishMsgGenerator;
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
        		WishMsgGenerator bean1 = context.getBean("wish1", WishMsgGenerator.class);
//        		bean.wish("Om Prakash");
        		System.out.println(bean1.hashCode());
        		
        		WishMsgGenerator bean2 = context.getBean("wish1", WishMsgGenerator.class);
//        		bean.wish("Om Prakash");
        		System.out.println(bean2.hashCode());
        		
        		WishMsgGenerator bean3 = context.getBean("wish2", WishMsgGenerator.class);
//        		bean.wish("Om Prakash");
        		System.out.println(bean3.hashCode());
        		
        		WishMsgGenerator bean4 = context.getBean("wish2", WishMsgGenerator.class);
//        		bean.wish("Om Prakash");
        		System.out.println(bean4.hashCode());
        
        ((AbstractApplicationContext) context).close();
        
    }
}
