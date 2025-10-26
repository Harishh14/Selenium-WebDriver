package TestNg_Grouping;

import org.testng.annotations.Test;

public class Sanity {

	@Test(priority = 1, groups = { "sanity" })
	void login_gmail() {
		System.out.println("login to gmail......");
	}

	@Test(priority = 2, groups = { "sanity" })
	void login_facebook() {
		System.out.println("login to facebook......");
	}

	@Test(priority = 3, groups = { "sanity" })
	void login_twitter() {
		System.out.println("login to twitter......");
	}

}
