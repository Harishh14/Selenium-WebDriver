package TestNg_Listners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(TestNg_Listners.Listener.class)
public class OrangeHrm {
	
	WebDriver driver;
	@BeforeClass
	void setup() throws InterruptedException {
	driver=new ChromeDriver();	
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	Thread.sleep(3500);
}

@Test(priority = 1)
void logo(){
	
	boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	AssertJUnit.assertEquals(status, true);
}

@Test(priority = 2)
void title() {
	AssertJUnit.assertEquals(driver.getTitle(), "OrangeHR");
}

@Test(priority = 3,dependsOnMethods = {"title"})
void url() {
	AssertJUnit.assertEquals(driver.getCurrentUrl(),
			"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}

@AfterClass
void logout() {
	driver.close();
}


}
