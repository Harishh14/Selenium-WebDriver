package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
//import java.net.URI;
//import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class navigationalmethods {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

//		driver.get("https://demo.nopcommerce.com/"); this only accepts string format url
		// like get methode there is another method that's called navigate to method.
//		driver.navigate().to("https://demo.nopcommerce.com"); //this can accept either string 		or url object.
		// like
//		URL myurl = new URL("https://demo.nopcommerce.com");
//		driver.navigate().to(myurl);

//		driver.navigate().to("https://demo.nopcommerce.com");
//		Thread.sleep(2000);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		System.out.println(driver.getTitle());

//		driver.navigate().back();
//		System.out.println(driver.getCurrentUrl());
//
//		driver.navigate().forward();
//		System.out.println(driver.getTitle());
//		Thread.sleep(2000);
//		
//		driver.navigate().refresh();
		
		//so this is all about navigation methods further we'll learning about how to navigate through different window handles or id's.for closing and forwarding and backwarding.
		
	
		
		

	}

}
