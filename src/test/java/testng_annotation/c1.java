package testng_annotation;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class c1 {

	@BeforeTest()
	void login() {
		System.out.println("this is login");
	}
	@Test (priority =1)
	void search () {
		System.out.println("this is search");
	}
}
