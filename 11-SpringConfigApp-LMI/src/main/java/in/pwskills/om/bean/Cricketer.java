package in.pwskills.om.bean;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("criketer")
public interface Cricketer {
	
	public  default void ball(){
		System.out.println("bolling ...");
	}
	
	public default void wicketKepping() {
		System.out.println("wicketKeeping ...");
	}
	
	@Lookup
	public default CriketBat dependencyLookupMethod() {
		return null;
	}
	
	public default void batting() {
		CriketBat obj = dependencyLookupMethod();
		int score = obj.runScore();
		System.out.println("Current Random score: "+ score);
	}
	

}
