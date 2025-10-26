package Screeshot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class takescreenshot {

	public static void main(String[] args) {
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
//		1) full page screenshots
		TakesScreenshot ts = (TakesScreenshot)driver; 
		
		File sourcefile=ts.getScreenshotAs(OutputType.FILE); //screenshots already taken and stored in a variable 
		//but we cannot see so thats why we have to store these ss in out own location or place.
		File target = new File(System.getProperty("user.dir")+"\\Screenshots\\fullpage.png"); //path created
		sourcefile.renameTo(target);//files are copied.
		
//		2) take screenshot of the specific field on the page.
		//first we store that field in a webelement .
		
		WebElement specific = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		
		File ssfile = specific.getScreenshotAs(OutputType.FILE);
		File mypath= new File(System.getProperty("user.dir")+"\\Screenshots\\specific.png");
		ssfile.renameTo(mypath);
		
		//capturing the logo.
		WebElement logo= driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		
		File sfile = logo.getScreenshotAs(OutputType.FILE);
		File sslogo = new File(System.getProperty("user.dir")+"\\Screenshots\\logo.png");
		sfile.renameTo(sslogo);
		
		
		
		

	}

}
