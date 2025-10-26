package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class webdrivermethods {

	public static void main(String[] args) throws InterruptedException {
		/*there are different methods of webdrivers which is used to locate web elements
		 * 1. Get methods
		 * 2. conditional methods
		 * 3.Browser Methods
		 * 4.navigational methods
		 * 5. wait methods.
		 */
		
		//get methods-we can access through webdriver instance. used to manage web pages.
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		String url=driver.getCurrentUrl();//its returns a string you we have to eiter store this in a string or direct 
		//print by syso.
		System.out.println(url);
		
//		String source=driver.getPageSource();
//		System.out.println(source);
		
//		String wid = driver.getWindowHandle();
//		System.out.println(wid);
		
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> wd = driver.getWindowHandles(); // we are using set here because set is used when we have hetrogenous type of data.
		System.out.println(wd);
		
		
		
		
		
		
		
		
	}

}
