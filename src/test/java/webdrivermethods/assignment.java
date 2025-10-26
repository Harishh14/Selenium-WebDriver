package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class assignment {

	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("selenium");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(3000);
		List<WebElement> slinks = driver.findElements(By.partialLinkText("Selenium"));
		System.out.println("Total links found: " + slinks.size());
	
		for(WebElement link:slinks) {
			String linktext = link.getText();
			
			System.out.println(linktext);
			
			driver.findElement(By.linkText(linktext)).click();
			Thread.sleep(2000);
		}
		
		Set<String>winid=driver.getWindowHandles();
		System.out.println("total window ids: "+winid.size());
		
		for(String Winid:winid) {
			System.out.println(Winid);
		}
		
		for(String Winid:winid) {
			driver.switchTo().window(Winid);
			String title = driver.getTitle();
			System.out.println(title);
			
			if (title.equals("Selenium - Wikipedia") || title.equals("Selenium dioxide - Wikipedia")) {
				System.out.println("Closing window: " + title);
				driver.close();
			}
		}
	
		
		
		
		
		

	}

}
