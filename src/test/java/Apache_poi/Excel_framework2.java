package Apache_poi;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Excel_framework2 {

    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement cookie = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[contains(text(),'Reject All')]")));
        cookie.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,410)");

        String file = System.getProperty("user.dir") + "\\test data\\CD1.xlsx";

        int totalrow = Excel_Utils.getRowCount(file, "Sheet1");
        System.out.println("Total Rows: " + totalrow);

        for (int i = 1; i <= totalrow; i++) {
            String inid = Excel_Utils.getCellData(file, "Sheet1", i, 0);
            String irate = Excel_Utils.getCellData(file, "Sheet1", i, 1);
            String len = Excel_Utils.getCellData(file, "Sheet1", i, 2);
            String comp = Excel_Utils.getCellData(file, "Sheet1", i, 3);
            String extotal = Excel_Utils.getCellData(file, "Sheet1", i, 4).replace("$", "").replace(",", "");

            driver.findElement(By.id("mat-input-0")).clear();
            driver.findElement(By.id("mat-input-1")).clear();
            
            WebElement rateInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mat-input-2")));

         // ✅ Set value directly using JS (bypasses sendKeys issue)
         js.executeScript("arguments[0].value = arguments[1]; arguments[0].dispatchEvent(new Event('input')); arguments[0].dispatchEvent(new Event('change'));",
                 rateInput, irate);


            // ✅ Fill other fields after interest field works
            driver.findElement(By.id("mat-input-0")).sendKeys(inid);
            driver.findElement(By.id("mat-input-1")).sendKeys(len);

            // Handle dropdown
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//div[contains(@class,'mat-mdc-select-arrow-wrapper')]"))).click();

            List<WebElement> options = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                    By.xpath("//mat-option[@role='option']//span")));

            for (WebElement opt : options) {
                if (opt.getText().equalsIgnoreCase(comp)) {
                    opt.click();
                    break;
                }
            }

            driver.findElement(By.id("CIT-chart-submit")).click();

            String actualtot = driver.findElement(By.id("displayTotalValue"))
                    .getText().replace("$", "").replace(",", "");

            double actual = Double.parseDouble(actualtot);
            double expected = Double.parseDouble(extotal);

            if (Math.abs(actual - expected) < 0.01) {
                System.out.println("✅ Pass for Row: " + i);
                Excel_Utils.setCellData(file, "Sheet1", i, 6, "Pass");
            } else {
                System.out.println("❌ Fail for Row: " + i + " | Expected: " + expected + " | Actual: " + actual);
                Excel_Utils.setCellData(file, "Sheet1", i, 6, "Fail");
            }

            Thread.sleep(2000);
        }

        driver.quit();
    }
}
