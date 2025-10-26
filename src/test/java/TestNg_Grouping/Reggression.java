package TestNg_Grouping;

import org.testng.annotations.Test;

public class Reggression {

	@Test(priority = 1, groups = { "reggression" })
	void signin_gmail() {
		System.out.println("login to gmail......");
	}

	@Test(priority = 2, groups = { "reggression" })
	void signin_facebook() {
		System.out.println("login to facebook......");
	}

	@Test(priority = 3, groups = { "reggression" })
	void signin_twitter() {
		System.out.println("login to twitter......");
	}
	
	
}
