package locators;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class demoblaze {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoblaze.com/");
		driver.manage().window().maximize();
		
		//total number of tags.
//		List<WebElement> hearderLink = driver.findElements(By.tagName("a"));
//		System.out.println(hearderLink.size());
		
//		total number of images
//		List<WebElement> hearderLink = driver.findElements(By.tagName("img"));
//		System.out.println(hearderLink.size());
//		
		//click on any product link using linktext and partiallinktext
		driver.findElement(By.linkText("Samsung galaxy s6")).click();
		
//		driver.close();
		
	
	
	
	
	}

}
