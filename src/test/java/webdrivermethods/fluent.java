package webdrivermethods;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class fluent{

    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        
        // Open the OrangeHRM login page
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        // FluentWait setup
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))       // Maximum wait time
                .pollingEvery(Duration.ofSeconds(2))       // Check every 2 seconds
                .ignoring(NoSuchElementException.class);   // Ignore exception if element not found yet
        
        // Wait until the username input is visible
        WebElement textusername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
        
        // Perform action on the element
        textusername.sendKeys("Admin");
        
//        driver.quit();
    }
}