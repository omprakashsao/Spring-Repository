package in.pwskills.om.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.om.bean.CustomerVO;
import in.pwskills.om.cfg.AppConfig;
import in.pwskills.om.controller.CustomerController;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        		CustomerController controller = context.getBean(CustomerController.class);
        		
        		Scanner scanner = new Scanner(System.in);
        		CustomerVO vo = new  CustomerVO();
        		
        		
        		System.out.println("Enter name: ");
        		String name = scanner.next();
        		
        		System.out.println("Enter Address: ");
        		String address = scanner.next();
        		
        		System.out.println("Enter principal amount : ");
        		String pamt = scanner.next();
        		
        		System.out.println("Enter time : ");
        		String time = scanner.next();
        		
        		System.out.println("Enter rate : ");
        		String rate = scanner.next();
        		
        		vo.setCustomerName(name);
        		vo.setCustomerAddress(address);
        		vo.setPamt(pamt);
        		vo.setTime(time);
        		vo.setRate(rate);
        		String status = controller.customerProcess(vo);
        		System.out.println(status);
        		
        
        ((AbstractApplicationContext) context).close();
        
    }
}
