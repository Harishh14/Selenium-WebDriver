package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args) {
		 
		//there are three types of dropdowns 1.select dropdown 2. bootstrap dropdown 3.hidden dropdown if you see select tag then it's definately select dropdown otherwise its hidden or bootstrap dropdown.
		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//		driver.get("https://testautomationpractice.blogspot.com/");
//		driver.manage().window().maximize();
//		
//		WebElement drop = driver.findElement(By.xpath("//select[@id='country']"));
//		
//		Select insidedrop = new Select(drop);
//		
//		//now we'll see how we can select options in the dropdown.
//		//selectbyvalue,selectbyvisibletype,selectbyindex.
//		
//		//methods
////		insidedrop.selectByVisibleText("Canada");
////		insidedrop.selectByValue("japan");
////		insidedrop.selectByIndex(2);
//		
//		//getoptions is methods used to print all the option from a dropdown.
//		
//		List<WebElement> options = insidedrop.getOptions();
//		System.out.println(options.size());
//		
////		for(int i=0;i<options.size();i++) {
////			System.out.println(options.get(i).getText());
////		}
//		
////		using enhanced for loop
//		
//		for(WebElement items:options) {
//			System.out.println(items.getText());
//		}
		
		//bootstrap dropdown handelling.
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		
		//for selectiong only single checkbox.
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		driver.findElement(By.xpath("//span[@data-id='0']")).click();
		
		
//	for selecting all the options in the drop down.	
		
		List<WebElement> options = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
//		System.out.println(options.size());
//		
//		for(WebElement option : options) {
//			
//		System.out.println(option.getText());
//			option.click();
//		}
		
		//select multiple options.
		
		
		for(WebElement op:options) {
			
			String option = op.getText();
			if(option.equals("choice 2 2") || option.equals("choice 3")){
				op.click();
			}
			
		}
		
		
		
		
		
		
		
		//for selecting multiple checkboxes in the dropdown list. below this is my approach after that i;m gonna use real approach.
//		 driver.findElement(By.xpath("//span[@data-id='1']")).click();
//		 
//		 List<WebElement> child = driver.findElements(By.xpath("//span[text()='choice 2']/parent::li/ul/li/span"));
//		 
//		 for(WebElement options:child) {
//			 options.click();
//			 System.out.println(options.getText());
//		 }
//
//	
	
	
	
		 	
	}

}
