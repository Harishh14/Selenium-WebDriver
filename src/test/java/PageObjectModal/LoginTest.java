package PageObjectModal;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;

	@BeforeClass
	void setup() {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@Test
	void logintest() {
		LoginPage2 lp = new LoginPage2(driver);
		lp.setUsername("Admin");
		lp.setPassword("admin123");
		lp.ClickLogin();
		
		//validation
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

	@AfterClass
	void close() {
		driver.quit();
	}

}
