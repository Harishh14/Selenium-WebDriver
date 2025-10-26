package Handelling;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkboxhandelling {

	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//if you want to select one element then we use.
//		driver.findElement(By.xpath("//input[@id ='sunday']")).click();
		
		
//		we want to select multiple then we will store it in an array list
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class ='form-check-input' and @type='checkbox']"));
		
		//using simple for loop
//		for(int i=0; i<checkboxes.size();i++) {
//			checkboxes.get(i).click();
//		}
		
		//by using enhanced for loop.
		
//		for(WebElement check :checkboxes) {
//			check.click();
//		}
//		
		
		//if we want to select only last three checkboxes then 
		
//		for(int i=4;i<checkboxes.size();i++) {
//			checkboxes.get(i).click();
//		}
		
		//if we want to select first three checkboxes then want to uncheck them them.
		
		for(int i=0;i<3;i++) {
			checkboxes.get(i).click();
		}
		
		Thread.sleep(5000);
		
		for(int i=0;i<checkboxes.size();i++) {
			
			if(checkboxes.get(i).isSelected()) {
				
				checkboxes.get(i).click();
			}
		}
		

	}

}
