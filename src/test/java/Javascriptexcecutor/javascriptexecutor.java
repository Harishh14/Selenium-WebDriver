package Javascriptexcecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecutor {

	public static void main(String[] args) throws InterruptedException {
		 
			WebDriver driver= new ChromeDriver();
			//ChromeDriver driver= new ChromeDriver();
			
			
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
			
			WebElement inputbox=driver.findElement(By.xpath("//input[@id='name']"));
//			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Himanshu");
//			Thread.sleep(2500);
			
//			if sometimes driver is enable to interact with the sendkeys method and click method
//			then in those cases javascriptexecutor used to perform actions
			
			JavascriptExecutor js = (JavascriptExecutor) driver; //used when we get elementintercepted
			js.executeScript("arguments[0].setAttribute('value','Himanshu')", inputbox);
			
			
			//and want to perform the click action then .
			WebElement radio = driver.findElement(By.xpath("//input[@id='male']"));
			js.executeScript("arguments[0].click()", radio);
			
			//scrolling the page using javascriptexecutor.
			
			

	}

}
