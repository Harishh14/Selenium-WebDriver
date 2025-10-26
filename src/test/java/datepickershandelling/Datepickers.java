//package Handelling;
//
//import java.time.Duration;
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Datepickers {
//
//	public static void main(String[] args) {
//
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://jqueryui.com/datepicker/");
//
//		// switch to frame.
//		driver.switchTo().frame(0);
//
//		// let's first try with the sendkeys function/
//		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("14/08/2004");
//
//		// method 2 using the date picker.
//
//		String year = "2026";
//		String month = "December";
//		String date = "14";
//
//		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
//
//		// select month and year
//		while (true) {
//			String currentm = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
//			String currenty = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
//
//			if (currentm.equals(month) && currenty.equals(year)) {
//				break;
//			}
//			// next
//			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
//			// previous
////			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
//
//			// selecting the date from the calendar
//		}
//
//		List<WebElement> alldates = driver
//				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
//
//		for (WebElement od : alldates) {
//			if (od.getText().equals(date)) {
//				od.click();
//				break;
//			}
//		}
//
//	}
//
//}

//instead of this you can use it as user defined methods for furthur use in other datepickers 

package datepickershandelling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepickers {

	static void futuredatepicker(WebDriver driver, String year, String month, String date) {
		while (true) {
			String currentm = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currenty = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

			if (currentm.equals(month) && currenty.equals(year)) {
				break;
			}
			// next
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();			

		}

		// selecting the date from the calendar
		List<WebElement> alldates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

		for (WebElement od : alldates) {
			if (od.getText().equals(date)) {
				od.click();
				break;
			}
		}

	}

	static void pastdatepicker(WebDriver driver, String year, String month, String date) {
		while (true) {
			String currentm = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currenty = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

			if (currentm.equals(month) && currenty.equals(year)) {
				break;
			}

			// previous
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();

		}
		// selecting the date from the calendar

		List<WebElement> alldates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

		for (WebElement od : alldates) {
			if (od.getText().equals(date)) {
				od.click();
				break;
			}
		}

	}

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");

		// switch to frame.
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		futuredatepicker(driver,"2026","August","14");
		
	}
}
