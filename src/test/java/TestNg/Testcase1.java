package TestNg;

import org.testng.annotations.Test;

public class Testcase1 {

	@Test(priority =1) 
	//we have to import this from testng package and we have to add this before every main method.
	//in testng we have to add priority perameter after test because in testng it follows alphabetical manner.
	//negative values are also allowed in the priority.
	void openapp() {
		System.out.println("Opening the app");
	}

	@Test (priority =2)
	void login() {
		System.out.println("Login to the app");

	}

	@Test (priority =3)
	void logout() {
		System.out.println("Loging Out The app");


	
	}

}
