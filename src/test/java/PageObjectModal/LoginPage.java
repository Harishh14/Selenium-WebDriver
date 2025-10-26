package PageObjectModal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	//constructor
	LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	//locators
	By txtu=By.xpath("//input[@placeholder='Username']");
	By txtp=By.xpath("//input[@placeholder='Password']");
	By clogin=By.xpath("//button[normalize-space()='Login']");

//actions.
	
	public void setUsername(String user) {
		driver.findElement(txtu).sendKeys(user);
	}
	public void setPassword(String pwd) {
		driver.findElement(txtu).sendKeys(pwd);
	}
	public void ClickLogin() {
		driver.findElement(clogin).click();
	}
	
	
	
}
