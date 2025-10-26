package Handelling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class authenticationpopupHandle {

	public static void main(String[] args) {
		 
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://the-internet.herokuapp.com/basic_auth");
		//so to handle this type of popup we use this command.
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		

	}

}
