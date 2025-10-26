	package Handelling;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alerthandelling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
//		1)normal alert with ok button
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		 
//		driver.switchTo().alert().accept(); if we want to perform only single action then we use this.
		
		//if we want to perform multiple actions then we use this command.
//		Alert myalert = driver.switchTo().alert();
//		System.out.println(myalert.getText()); //if want to capture alert message in the console window.
//		myalert.accept();
		//alert in not a web element so we cannot inspect this so that's why we switch to alert.
//		
//		//2)confirmation alert- ok & cancel 
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
//		Thread.sleep(5000);
//		
////		driver.switchTo().alert().accept(); //for clicking okay.
//		driver.switchTo().alert().dismiss(); //for clicking on cancel button.
		
		//3) prompt alert - input box
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		
		Thread.sleep(3000);
		Alert myalert = driver.switchTo().alert(); // always do like this if you want to avoid repeating the code driver.switchto.alert();
		myalert.sendKeys("confirm");

		myalert.accept();

		Thread.sleep(3000);

		
		driver.close();
		
		
		
		
		
		
		
		
	}

}
