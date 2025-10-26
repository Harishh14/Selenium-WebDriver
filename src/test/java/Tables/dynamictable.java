package Tables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamictable {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://datatables.net/examples/data_sources/ajax.html");

		//first we will try to count number of pages we have.
		
		List<WebElement> pages = driver.findElements(By.xpath(
			    "//nav[@aria-label='pagination']//button[contains(@class,'dt-paging-button') and not(contains(@class,'first')) and not(contains(@class,'previous')) and not(contains(@class,'next')) and not(contains(@class,'last'))]"
			));

		int totalp = pages.size();
		System.out.println(totalp);
		
		for(int p=1;p<=6;p++) {
			
			 if(p>=1) {
				 WebElement activep=driver.findElement(By.xpath("//nav[@aria-label='pagination']//*[text()="+p+"]"));
				 activep.click();
				 Thread.sleep(3000);
			 }
			 
		

		int rows = driver.findElements(By.xpath("//table[@id='example']//tbody//tr")).size();
		System.out.println(rows);
		
		for(int i=1;i<=rows;i++) {
			String name=driver.findElement(By.xpath("//table[@id='example']//tbody//tr["+i+"]//td[1]")).getText();
			String position=driver.findElement(By.xpath("//table[@id='example']//tbody//tr["+i+"]//td[2]")).getText();
			System.out.println("Name- "+name+"\t"+"Position- "+position);
			
		}
	
		}
	
	
	}

}
