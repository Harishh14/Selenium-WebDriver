package handellingbrokenlinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Svg_handelling {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // ✅ Use WebDriverWait instead of Thread.sleep()
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Login
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("admin123");

        WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        loginBtn.click();

        // ✅ Wait for PIM menu to be clickable
        WebElement pimMenu = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//li[@class='oxd-main-menu-item-wrapper']//*[name()='svg'])[2]")));
        pimMenu.click();

        // ✅ Wait for Employee Name input to be visible
        WebElement empNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters'][1]//input[@placeholder='Type for hints...']")));
        empNameInput.sendKeys("Don");

//        System.out.println("✅ Successfully entered Employee Name!");

        
    }
}
