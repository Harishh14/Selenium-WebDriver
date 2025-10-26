package webdrivermethods;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitingmethods {

	public static void main(String[] args) throws InterruptedException {

		// there are two types of waiting methods
		// implicit waiting methods
		// explicit waiting methods.

		/*
		 * exceptions in this case element not found exception-element is not present n
		 * the page. Syncronization nosuchelementfound exception- Locator is incorrect.
		 */

		/*
		 * basically we use Thread.sleep(); but due to time is hard coded and if the
		 * take entered is is too low then it'll throw exception and if the time limit
		 * is too high then it turns or decreases the value of your script .
		 * 
		 * so to prevent this problem we use timeouts and timeintervals.
		 */

//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		
//		Thread.sleep(3000); // creating wait by using Thread.Sleep();
//				
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
//		
//		Thread.sleep(2500);
//		
//		driver.close();

		// Implicit waits:-by using timeouts and intervals.

//		WebDriver driver = new ChromeDriver();
//		//timouts are used before running the script and it works automatically whenever the syncronization
//		//problem occurs.
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

		/*
		 * advantage and disadvantes of this method is adv:- only need to type one time
		 * applicable for all the statements if element or page taking less time than
		 * mentioned it'll not wait for time to be completed.
		 * 
		 * dis:-when element or page is taking more time than the mentioned time then
		 * you'll get the exception message.
		 */

		/*
		 * explicit methods:-
		 * 
		 */
//		WebDriver driver = new ChromeDriver();
//		// for using explicit wait we have to create another class named Webdriverwait
//		// and it works on the basis of
//		// condition.
//
//		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10)); // declaration
//
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		// we apply wait always after opening the browser together with element
//
//		WebElement txtusername = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//inpu[@placeholder='Username']")));
//		txtusername.sendKeys("Admin");
//
//		WebElement txtpassword = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//inpu[@placeholder='Password']")));
//		txtpassword.sendKeys("admin123");
//
//		WebElement login = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//bu[normalize-space()='Login']")));
//		login.click();
//
//		driver.manage().window().maximize();
		// we don't need to write this when we are using explicit wait
		// driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		//Fluent wait method
		
		WebDriver driver = new ChromeDriver();
		
		Wait <WebDriver> mywait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
			       .pollingEvery(Duration.ofSeconds(5))
			       .ignoring(NoSuchElementException.class);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		  WebElement textusername = mywait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.xpath("//input[@placeholder='Username']"));
			     }
			   });
		  
		  textusername.sendKeys("Admin");
		  
		  Thread.sleep(3000);
		  driver.close();
		
		
		
		

	}

}
