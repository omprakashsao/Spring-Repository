package in.pwskills.om.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.stereotype.Component;

@Component("interestReplacer")
public class SimpleInterest implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		double pamt = (double)args[0];
		double rate = (double)args[1];
		double time = (double)args[2];
		return (pamt*rate*time)/100;
	}

}
