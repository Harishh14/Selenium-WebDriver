//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//public class mouseactions {
//
//	public static void main(String[] args) {
		 
		/* there are different types of mouse actions 
		 * double click
		 * mouse hover
		 * right click
		 * drag and drop
		 */
		
//		Actions contains driver instance
		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://practice.expandtesting.com/hovers");
//		driver.manage().window().maximize();
//		
//		WebElement img =driver.findElement(By.xpath("//div[@class='container']//div[1]//img[1]"));
//		WebElement profile = driver.findElement(By.xpath("(//a[contains(text(),'View profile')])[1]"));
//		
//		Actions act = new Actions(driver);
//		//mouse hover action. every method shoul ends up with build and perform class.
//
//		act.moveToElement(img).moveToElement(profile).click().build( ).perform();
		//if you wanna click on the hovered element then
//		act.moveToElement(img).perform();
//		profile.click();
//		act.moveToElement(img).click(driver.findElement(By.xpath("(//a[text()='View profile'])[1]"))).perform();

		
		//for performing right click.
package Mouseactions;

import java.time.Duration;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;

		public class mouseactions {

			public static void main(String[] args) {
				
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://js.devexpress.com/jQuery/Demos/WidgetsGallery/Demo/ContextMenu/Basics/MaterialBlueLight/");
				driver.manage().window().maximize();
				
				// Locate the iframe first
				WebElement frameElement = driver.findElement(By.id("demoFrame"));
				
				// Switch to iframe
				driver.switchTo().frame(frameElement);
				
				// Locate the image inside iframe
				WebElement rclick = driver.findElement(By.xpath("//img[@id='image']"));
				
				// Perform right-click (context click) on image
				Actions act = new Actions(driver);
				act.contextClick(rclick).perform();
				
			
		
		
		
	}

}
