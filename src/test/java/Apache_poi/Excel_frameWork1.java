package Apache_poi;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Excel_frameWork1 {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(
				"https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		driver.manage().window().maximize();
		try {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			WebElement nobtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'No thanks')]")));
			nobtn.click();
			System.out.println("notification is handelled successfully");
		}catch(Exception e) {
			System.out.println("no pop-up message");
		}

		String filepath = System.getProperty("user.dir") + "\\test data\\interest.xlsx";

		int totalrow = Excel_Utils.getRowCount(filepath, "Sheet1");

//		int totalcell = Excel_Utils.getCellCount(filepath, "Sheet1", 0);
//		System.out.println(totalrow);
//		System.out.println(totalcell);

		for (int i = 1; i < totalrow; i++) {
			// step 1:-get the data from the excel
			String princ = Excel_Utils.getCellData(filepath, "SHeet1", i, 0);
			String roi = Excel_Utils.getCellData(filepath, "SHeet1", i, 1);
			String period = Excel_Utils.getCellData(filepath, "SHeet1", i, 2);
			String freq = Excel_Utils.getCellData(filepath, "SHeet1", i, 3);
			String type = Excel_Utils.getCellData(filepath, "SHeet1", i, 4);
			String maturity = Excel_Utils.getCellData(filepath, "SHeet1", i, 5);

			// step2:- pass the data into the application.

			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(princ);

			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(roi);

			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(period);

			Select tperiod = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			tperiod.selectByVisibleText(freq);

			Select frequency = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			frequency.selectByVisibleText(type);

			driver.findElement(By.xpath("//div[@class='CTR PT15']//a[1]")).click();

			// validation

			String mat = driver.findElement(By.xpath("//span[@id='resp_matval']")).getText();

			if (Double.parseDouble(maturity) == Double.parseDouble(mat)) {
				System.out.println("pass");
				Excel_Utils.setCellData(filepath, "Sheet1", i, 7, "Pass");
			} else {
				System.out.println("Fail");
				Excel_Utils.setCellData(filepath, "Sheet1", i, 7, "Fail");
			}

			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='CTR PT15']//a[2]")).click();

		}

		
		driver.quit();

	}
}