package TestNg;
/*
 *  opening the application
 * varifying the logo
 * login to the application
 * loging out the application.
 */


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangerHrmLogin_Test {

	WebDriver driver;
	
	@Test(priority = 1)
	void open() {
		//if we want to use driver class in every method then we have to make it as a class level variable.
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test(priority = 2)
	void logo() throws InterruptedException {
		Thread.sleep(4000);
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("Logo Is Displaying Correctly= "+status);
	}

	@Test(priority = 3)
	void login() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin"); //entering the username
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();;
	}

	@Test(priority = 4)
	void logout() {
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		driver.findElement(By.xpath("//ul[@role='menu']//li[4]")).click();
	}
	
	@Test(priority =5)
	void close() {
	driver.quit();	
	}
}
