package Mouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragndrop {

	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/demoSite/practice/droppable/photo-manager.html");
		driver.manage().window().maximize();
		
//		WebElement frame = driver.findElement(By.className("iframeResult"));
//		driver.switchTo().frame(frame);
		
		Actions act = new Actions(driver);
		
//		dnd1
		WebElement img1= driver.findElement(By.xpath("//li[1]"));
		WebElement dropbox= driver.findElement(By.xpath("//div[@id='trash']"));
		
		act.dragAndDrop(img1, dropbox).perform();
		Thread.sleep(3000);
		
//		dnd2
		WebElement img2= driver.findElement(By.xpath("//li[2]"));
		WebElement dropbox2= driver.findElement(By.xpath("//div[@id='trash']"));

		act.dragAndDrop(img2, dropbox).perform();
	
	//now we'll try to re drag the item on there place back. 
		
		//back1
		Thread.sleep(3000);
		
		WebElement backimg1= driver.findElement(By.xpath("//div[@id='trash']//li[1]"));
		WebElement backdropbox= driver.findElement(By.xpath("//li[1]"));
		
		act.dragAndDrop(backimg1, backdropbox).perform();
		
	
	}

}
