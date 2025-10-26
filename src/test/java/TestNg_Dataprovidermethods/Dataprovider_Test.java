package TestNg_Dataprovidermethods;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Dataprovider_Test {
	WebDriver driver;

	@Parameters({ "browser" })
	@BeforeClass
	void setup(String br) {

		switch (br.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Invalid browser: " + br);
			return; // exit if invalid input
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	void logo() throws InterruptedException {
		Thread.sleep(2500);
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		AssertJUnit.assertEquals(status, true);
	}

	@Test(priority = 2)
	void title() {
		AssertJUnit.assertEquals(driver.getTitle(), "OrangeHRM");
	}

	@Test(priority = 3)
	void url() {
		AssertJUnit.assertEquals(driver.getCurrentUrl(),
				"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterClass
	void logout() {
		driver.close();
	}

}
