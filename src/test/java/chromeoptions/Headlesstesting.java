package chromeoptions;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headlesstesting {

	public static void main(String[] args) {
		
		
//if we pass this option variable in the chromedriver class then only it will run in the backgroung		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless=new");

		WebDriver driver = new ChromeDriver(option);
//		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
//		driver.manage().window().maximize();
		
		String Act_title=driver.getTitle();
		System.out.println(Act_title);
		if(Act_title.equals("Just a moment...")) {
			System.out.println("test passes");
		}else {
			System.out.println("test failed");
		}
		
		
		
		

	}

}
