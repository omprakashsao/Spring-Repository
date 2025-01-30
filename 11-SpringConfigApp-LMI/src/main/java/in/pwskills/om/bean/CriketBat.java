package in.pwskills.om.bean;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class CriketBat {
	
	static {
		 System.out.println("CriketBat. class file is loading");
	}

	public CriketBat() {
		// TODO Auto-generated constructor stub
		System.out.println("CriketBat object is created using zero param constructor..)");
	}
	
	public int runScore() {
		return new Random().nextInt(200);
	}
}
