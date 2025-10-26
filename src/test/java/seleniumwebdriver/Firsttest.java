package seleniumwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firsttest {

    public static void main(String[] args) {
        // Launch Chrome
        WebDriver driver = new ChromeDriver();

        // Open the correct URL
        driver.get("https://demo.opencart.com/");

        // Validate the title
        String actitle = driver.getTitle();

        if (actitle.equals("Just a moment...")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed. Actual Title: " + actitle);
        }

        // Close the browser
        driver.close();
    }
}

