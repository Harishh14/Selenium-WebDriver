package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalmethods {

	public static void main(String[] args) {
		
		//conditionals methods are used to checkboxes and radio buttons are selected or not.
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/register");
		
		//isdisplayed is used to check wheather the element is visible or not
//		boolean logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
//		System.out.println(logo);
//
//		//isenabled is used to check wheather the element is enabled or not(radio buttons,checkboxes,inputbox)
//		boolean enable = driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
//		System.out.println(enable);
	
		
		//isselected is used to check wheather the element is selected or not 
//		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		WebElement selectedm = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement selectedf = driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		//before selection 
//		System.out.println(selectedm.isSelected());
//		System.out.println(selectedf.isSelected());

		//after selection
		selectedf.click();
		
		System.out.println("male radio button isn't selected"+selectedm.isSelected());
		System.out.println("female is button is got selected"+selectedf.isSelected());
		
		boolean news = driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		System.out.println(news);
//		driver.close(); used to exit single page or browser
//		driver.quit();  used to exit multiple page or browser
		
		
		
		
	}

}
