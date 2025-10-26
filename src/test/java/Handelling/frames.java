package Handelling;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class frames {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();

		// before using this we have to decide i frame and we can locate it we three
		// different approaches 1.driver.switchto().frame(id,name,webelement,index);
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1); // we cannot do this without switching to frame.

		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");

		// if we want to move on to next frame then we cannot do that directly so
		// firstly we have to move to the previous page then only it's possible. so for
		// that syntax is.
		driver.switchTo().defaultContent(); // so after that we can move on to the next frame.

		// frame 2.
		// so the process we have done for the first frame exact same we have to perform
		// here.

		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("soni");

		// and again if we want to switch to another frame then we have to comeback to
		// the defaultpage.

		driver.switchTo().defaultContent();

		// frame 3
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("learning selenium");

		// after that if you want to enter in an inner iframe then you dont need to
		// repeat all the process because you are already in the outter frame that
		// contains inner iframe. so only this command will be enough .

		driver.switchTo().frame(0);

//		driver.findElement(By.xpath("//div[@id='i6']//div[@class='AB7Lab Id5V1']")).click();
//		Thread.sleep(2000);
//		boolean show = driver.findElement(By.xpath("//div[@id='i6']//div[@class='AB7Lab Id5V1']")).isSelected();
//		System.out.println(show);
		
		//if wanna click on the element and check wheather the element is selected or not.
		WebElement radio = driver.findElement(By.xpath("//div[@id='i6']"));
		radio.click();

		// Now check selection using aria-checked attribute
		String state = radio.getAttribute("aria-checked");
		System.out.println("Selected? " + state.equals("false"));

	}

}
