package testng_annotation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class c2 {

	@AfterTest()
	void logout() {
		System.out.println("this is logout");
	}
	@Test (priority =2)
	void adsearch () {
		System.out.println("this is adsearch");
	}
	
}
