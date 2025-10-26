package keyboardactions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class kbactions {

	public static void main(String[] args) throws InterruptedException {

//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://text-compare.com/");
//		driver.manage().window().maximize();
//		
//		Actions act = new Actions(driver);
//		
////		we have to perform copy and paste action through keyboard action keys
//		
//		//first send keys to the imputbox.
//		
//		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Himanshu");
//		
//		//now after sending keys we have to select copy change box and paste
//		
//		//first we select the text.
//		
//		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
//		
//		//after select we have to copy the text.
//		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
//		
//		//now change the tab
//		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
//		
//		//now paste the text in the box 2.
//		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
//		
//		//now compare the text.
//		driver.findElement(By.xpath("//button[@id='compareButton']")).click();
//		
//		Thread.sleep(2000);
//		//now get message when the text is compare or not.
//		String mess=driver.findElement(By.xpath("//span[@class='messageForUser']")).getText();
//		System.out.println(mess);
//		
	
	//now we will do the registration on the same page
		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://demo.nopcommerce.com/");
//		driver.manage().window().maximize();
//		
//		Actions act = new Actions(driver);
//	
//		//first we have to capture the element then perform the control+click
//		WebElement reg=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
//		
//		//now registration page is opened in the new tab.
//		act.keyDown(Keys.CONTROL).click(reg).keyUp(Keys.CONTROL).perform();
//		
////		now we have to switch on the registration page to perform action on the page because we
////		cannot perform actions without switching on the page 
//		
//		List<String> id= new ArrayList(driver.getWindowHandles()); //because sets doesnt have index we have to convert this into arraylist
//		driver.switchTo().window(id.get(1));
//		
//		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Himanshu");
//		
//		Thread.sleep(2500);
//		driver.switchTo().window(id.get(0));
//		
//		driver.findElement(By.xpath("//input[@placeholder='Search store']")).sendKeys("Tshirts");
//		Thread.sleep(2500);
//		driver.quit();
//		
		
//switching in new tab and switching in new window.		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		
//		if wanna switch in new tab
//		driver.switchTo().newWindow(WindowType.TAB);
		
		//if wanna open the site on new window.
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://orangehrm.com");
		Thread.sleep(2500);
		driver.quit();
	
	
	}

}
