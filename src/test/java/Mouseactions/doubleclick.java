package Mouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();

		// first switch to the frame so that we can easily locate the elements and
		// perform our actions

		WebElement frame = driver.findElement(By.id("iframeResult"));

		driver.switchTo().frame(frame);

		// sending keys to the input tag .

		WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));

		WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));

		box1.clear();
		Thread.sleep(2000);
		box1.sendKeys("Himanshu");
		// now we'll double click the element so we can copy the upper and paste it to
		// the empty input.

		WebElement btn = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

		// now double click on the btn.

		Actions act = new Actions(driver);

		act.doubleClick(btn).perform();

		String text = box2.getAttribute("value");
		if (text.equals("Himanshu")) {
			System.out.println("Element is matching");
		} else {
			System.out.println("not copied");
		}
		// we are not using the gettext method because we dont have the inner html in
		// the input tag
		// so we are capturing the text into the attribute so thats why we are using
		// getattribute method.


	
	}

}
