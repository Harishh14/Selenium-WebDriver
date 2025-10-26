package Mouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) {
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/demoSite/practice/slider/range.html");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement minslide = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		
		//this is default location slider location is kept in x and y axis so first o all we
		//have to find location by using getlocation class.
		System.out.println("default location is:"+minslide.getLocation());//(201, 46)
		
		//and if horizontal slide we increase x point if vertical then y axis but one should be 
//		constant
		act.dragAndDropBy(minslide, -200, 46).perform();
		
		
		//max slider decrease
		
		WebElement maxslide = driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
		
		act.dragAndDropBy(maxslide, 530, 46).perform();
		System.out.println("increased slider:"+maxslide.getLocation());

		

	}

}
