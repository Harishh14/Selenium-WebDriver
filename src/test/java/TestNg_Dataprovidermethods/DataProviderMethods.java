package TestNg_Dataprovidermethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//1:14:36 need to continue from here.
public class DataProviderMethods {

	WebDriver driver;

	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test(dataProvider="dp")
	void testlogin(String email,String pwd) throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

        // Enter credentials
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
        driver.findElement(By.xpath("//input[@value='Login']")).click();

        Thread.sleep(2000);

        // Check login status
        boolean status = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();

        if (status == true) {
            driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
            Assert.assertTrue(true);
        } else {
            Assert.fail();
        }
		
		
	}

	@DataProvider(name="dp")
	Object[][] logindata() {
		
		Object data[][]= {
				{"agc12@Gmail.com","abc123"},	
				{"aec12@Gmail.com","abcp123"},	
				{"sonijoy92@gmail.com","Manu@@123"},	
				{"abc124@Gmail.com","asc123"},	
				{"ahc126@Gmail.com","abhc123"},	
		};
		
		return data;
	}
	
	@AfterClass
	void teardown() {
		driver.close();
	}
	
}
