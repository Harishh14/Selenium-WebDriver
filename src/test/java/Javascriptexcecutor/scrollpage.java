package Javascriptexcecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollpage {

	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		//1)scroll down the page by pixel number of the page
//		js.executeScript("window.scrollBy(0,1500)","");
//		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//2)scroll the page till the element is visible.
//		WebElement ele = driver.findElement(By.xpath("//h2[normalize-space()='Slider']"));
//		js.executeScript("arguments[0].scrollIntoView();", ele);
//		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//3)scroll down till the end of the page.
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		Thread.sleep(3000);
		//scrolling up to initial height
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		
		//notes if its vertical scrollbar then you have to use yoffset and if its horizontal then
		// you have to use x offset.
		//and instead if height you have to choose width.
		

	}

}
