package testng_annotation;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class c3 {

	@BeforeSuite()
	void login() {
		System.out.println("this is bs");
	}



	@Test
	void advanceSs() {
		System.out.println("this is avance search");
	}

	@AfterSuite()
	void logout() {
		System.out.println("this is as");
	}

}
