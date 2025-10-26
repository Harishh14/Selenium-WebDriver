package testng_annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//TC 01:- in this test we are using login and logout repeatedly.before and after every test.
/* login (before method)
 * search (test)
 * logout (after method)
 * login same as uupar.
 * advnce search
 * logout
 */

//TC02:- in this test we are using before class and after class method for once till the 
//completeion of the execution of tests.
public class Annotations {
//	TC 01

	// @BeforeMethod()
//	void login() {
//	System.out.println("this is login");	
//	}
//	
//	@Test(priority =1)	
//	void search() {
//		System.out.println("this is search");
//	}
//	
//	@Test (priority =2)
//	void advanceS() {
//		System.out.println("this is avance search");
//	}
//	
//	@AfterMethod()
//	void logout() {
//		System.out.println("this is logout");
//	}

	// TC 02

//	@BeforeClass()
//	void login() {
//		System.out.println("this is login");
//	}
//
//	@Test(priority = 1)
//	void search() {
//		System.out.println("this is search");
//	}
//
//	@Test(priority = 2)
//	void advanceS() {
//		System.out.println("this is avance search");
//	}
//
//	@AfterClass()
//	void logout() {
//		System.out.println("this is logout");
//	}

	//TC 03
	
	@BeforeTest()
	void login() {
		System.out.println("this is login");
	}

	@Test(priority = 1)
	void search() {
		System.out.println("this is search");
	}

	@Test(priority = 2)
	void advanceS() {
		System.out.println("this is avance search");
	}

	@AfterTest()
	void logout() {
		System.out.println("this is logout");
	}




}
