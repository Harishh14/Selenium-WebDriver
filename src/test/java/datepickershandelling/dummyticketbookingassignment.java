package datepickershandelling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dummyticketbookingassignment {
	

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://dummy-tickets.com/buyticket");
//		driver.navigate().refresh();

		// first click on both page.
		driver.findElement(By.xpath("//a[normalize-space()='Both']")).click();

		// then click on from input box.
//		
		Thread.sleep(3500);
		driver.findElement(By.xpath("(//div[@class='col-sm-12 p-0 suggestion-container'])[6]//input")).sendKeys("american samoa");
		Thread.sleep(2000);
		//then selecting from auto suggestion button.
		List<WebElement> auto = driver.findElements(By.xpath("//ul//li//div//div[@class='city']"));
		
//		int size = auto.size();
//		System.out.println(size);
		
	
		for(int i=0;i<auto.size();i++) {
			System.out.println(auto.get(i).getText());
			if(auto.get(i).getText().equals("American Samoa")) {
				auto.get(i).click();
				auto.get(i).getText();
				break;
				
			}
			
		}

		// then clicking on to input box and send keys.
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='destination[]'])[4]")).sendKeys("south suda");
		
//		driver.findElement(By.xpath("//div[normalize-space()='South Sudan']")).click();

		List<WebElement> toauto = driver.findElements(By.xpath("//ul//li//div//div[@class='city']"));

		for (int j = 0; j < toauto.size(); j++) {
			System.out.println(toauto.get(j).getText());
			if (toauto.get(j).getText().equals("South Sudan")) {
				toauto.get(j).click();
				toauto.get(j).getText();
				break;
			}
		
			
		}
	
		//selecting the date of Departure with this input.
		String depyear= "2026";
		String depmonth= "Dec";
		String depdate= "14";
		
		//clicking on the element.
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/section[1]/div[2]/div[1]/div[3]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[2]/div[1]/input[1]")).click();
		
//		//selecting year
		
		WebElement Dropyear =driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select selyear = new Select(Dropyear);
		selyear.selectByVisibleText(depyear);
		
		Thread.sleep(2000);
		//selecting month 
		WebElement Dropmonth =driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select selmonth = new Select(Dropmonth);
		selmonth.selectByVisibleText(depmonth);

		//selecting month.
		List<WebElement> date = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td//a"));
		
//		for(int k=0; k<=date.size();k++) {
//			String d = date.get(k).getText();
//			if(d.equals(depdate)) {
//				date.get(k).click();
//			}
//		}
		for(WebElement alldate:date) {
			if(alldate.getText().equals(depdate)) {
				alldate.click();
				break;
			}
		}
		
		//selecting the city
		driver.findElement(By.xpath("(//input[@name='city[]'])[2]")).sendKeys("dallas");
		Thread.sleep(2000);
		//after sending keys locating the city
		List<WebElement> hotel = driver.findElements(By.xpath("//ul[@class='suggestions-cities-list']//li"));
		
		for(int h=0;h<hotel.size();h++) {
			if(hotel.get(h).getText().equals("Dallas")) {
				hotel.get(h).click();
				
			}
		}
	
		//selecting checkin date.
		//first of all select year. because it's in non selectable form so we use this approach.
		
		// input values for checkin.
		String checkyear = "2027";
		String checkmonth = "Sep";
		String checkdate = "22";

		// open checkin datepicker
		driver.findElement(By.xpath("//form[@id='both_oneway']//label[@for='checkin'][normalize-space()='Check In']/following-sibling::input")).click();
		Thread.sleep(2000);

		// handle YEAR (non-selectable span, so loop with next/prev buttons)
		while (true) {
		    String displayYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		    int currentYear = Integer.parseInt(displayYear);
		    int expectedYear = Integer.parseInt(checkyear);

		    if (expectedYear > currentYear) {
		        // click next
		        driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		    } else if (expectedYear < currentYear) {
		        // click previous
		        driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		    } else {
		        break; // year matched
		    }
		}

		// select MONTH (dropdown)
		WebElement dropMonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select selMonth = new Select(dropMonth);
		selMonth.selectByVisibleText(checkmonth);

		// select DATE
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
		for (WebElement d : allDates) {
		    if (d.getText().equals(checkdate)) {
		        d.click();
		        break;
		    }
		}
		
		//inputs for check out datepicker
		
		String outyear = "2028";
		String outmonth = "Jan";
		String outdate = "1";
		
		//first step lets click on the checkout datepicker.
		
		driver.findElement(By.xpath("//form[@id='both_oneway']//label[@for='checkout'][normalize-space()='Check Out']/following-sibling::input")).click();
		
		
		Thread.sleep(2000);
		while(true) {
			String viewyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			int currentoutyear= Integer.parseInt(viewyear);
			int expectedoutyear = Integer.parseInt(outyear); 
			
			if(expectedoutyear>currentoutyear) {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
			 else if(expectedoutyear<currentoutyear) {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			}
			 else {
				 break; //year match.
			 }
		}
			//now select month.
			
			WebElement dropoutmonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
			Select doutmonth = new Select(dropoutmonth);
			doutmonth.selectByVisibleText(outmonth);
			
			//now select the date.
			
			List<WebElement> datelist= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
			for(WebElement alloutdate:datelist) {
				if(alloutdate.getText().equals(outdate)) {
					alloutdate.click();
				}
				
			}
				
		
	
	
		//finally after this we'll submit the page.
	
			
	
	
	
	
	}

}
