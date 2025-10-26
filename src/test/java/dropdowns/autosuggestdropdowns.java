package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestdropdowns {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com/");
//		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2500);
		
		
		List<WebElement>options=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		System.out.println(options.size());
		
		for(int i=0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
			if(options.get(i).getText().equals("selenium")) {
				options.get(i).click();
				break;
			}
		}
		
		
		
		
		
//		for(WebElement loop:options) {
//			System.out.println(loop.getText());
//		}
		
		
		
		

	}

}
