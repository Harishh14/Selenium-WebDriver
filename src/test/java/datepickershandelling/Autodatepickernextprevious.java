package datepickershandelling;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Autodatepickernextprevious {

	static Month convertMonth(String month) {

		HashMap<String, Month> mymap = new HashMap<String, Month>();

		  mymap.put("Jan", Month.JANUARY);
		    mymap.put("Feb", Month.FEBRUARY);
		    mymap.put("Mar", Month.MARCH);
		    mymap.put("Apr", Month.APRIL);
		    mymap.put("May", Month.MAY);
		    mymap.put("Jun", Month.JUNE);
		    mymap.put("Jul", Month.JULY);
		    mymap.put("Aug", Month.AUGUST);
		    mymap.put("Sep", Month.SEPTEMBER);
		    mymap.put("Oct", Month.OCTOBER);
		    mymap.put("Nov", Month.NOVEMBER);
		    mymap.put("Dec", Month.DECEMBER);

		Month vmonth = mymap.get(month);
		if (vmonth == null) {
			System.out.println("invalid month.....");
		}

		return vmonth;

	}
	static void selectdate(WebDriver driver,String reqyear,String reqMonth,String reqdate) {
//		select year
		WebElement yeardrop = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select selyear = new Select(yeardrop);
		selyear.selectByVisibleText(reqyear);

		// select month
		while (true) {
			 WebElement monthDrop = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		        Select selMonth = new Select(monthDrop);
		        String displayMonth = selMonth.getFirstSelectedOption().getText();

			// covertreq month and display month in month objects

			Month expectedMonth = convertMonth(reqMonth);
			Month currentMonth = convertMonth(displayMonth);

			// compare

			int result = expectedMonth.compareTo(currentMonth);
			// 0 equal
			// >0 if greater than zero than future
			// <0 past

			if (result > 0) {
				// future month
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			} else if (result < 0) {
				// past month
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			} else {
				break;
			}

		}
		
		//date 
		List<WebElement> mydate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement alldate:mydate) {
			if(alldate.getText().equals(reqdate)) {
				alldate.click();
				break;
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");

		// switch to frame.

		driver.findElement(By.xpath("//input[@name='SelectedDate']")).click();
		Thread.sleep(3000);

		// input

		selectdate(driver,"2027","Feb","14");
		
		
		
		
//		String reqyear = "2026";
//		String reqMonth = "December";
//		String reqdate = "14";

////		select year
//		WebElement yeardrop = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
//		Select selyear = new Select(yeardrop);
//		selyear.selectByVisibleText(reqyear);
//
//		// select month
//		while (true) {
//			String displayMonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")).getText();
//
//			// covertreq month and display month in month objects
//
//			Month expectedMonth = convertMonth(reqMonth);
//			Month currentMonth = convertMonth(displayMonth);
//
//			// compare
//
//			int result = expectedMonth.compareTo(currentMonth);
//			// 0 equal
//			// >0 if greater than zero than future
//			// <0 past
//
//			if (result > 0) {
//				// future month
//				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
//			} else if (result < 0) {
//				// past month
//				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
//			} else {
//				break;
//			}
//
//		}
//		
//		//date 
//		List<WebElement> mydate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
//		
//		for(WebElement alldate:mydate) {
//			if(alldate.getText().equals(reqdate)) {
//				alldate.click();
//				break;
//			}
//		}

	}

}
