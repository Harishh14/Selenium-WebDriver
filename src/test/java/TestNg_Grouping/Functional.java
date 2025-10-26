package TestNg_Grouping;

import org.testng.annotations.Test;

public class Functional {
//	(function=sanity+reggression)

	@Test(priority = 1,groups = {"sanity","reggression"})
	void payment_rs() {
		System.out.println("payment in ruppees");
	}

	@Test(priority = 2,groups = {"sanity","reggression"})
	void payment_dollar() {
		System.out.println("payment in dollar");
	}

}
