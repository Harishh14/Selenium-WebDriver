package locators;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class css_selectors {

	public static void main(String[] args) {
		 
		/* it includes tagid = tag#id, tagclassname= tag.class, tag attribute =tag[attribute="value],
		 * tag class attribute= tag.classname[attribute="value"]
		 */
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//tag is optional and we don't have to write it mandatory or compulsory.
		
//		driver.findElement(By.name("q")).sendKeys("apple");
		
//find elements by tag&id (if you want to varify then you need to inspect this input#small-searchterms) 
//		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Himanshu");
//		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Himanshu");
		
		
		//find elements by tag.classname
//		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("suwar");
//		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("suwar");
		
//if id and class isn't available then you can use attributes such as name,type,placeholder,aria-lable
	//	driver.findElement(By.cssSelector("placeholder=\"Search store\"")).sendKeys("suwar"); //befor start before end 
		//if want to use double quote inside double quote otherwise you can simply write this in single ' '
//		driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("suwar"); 
		
	// tag.classname[attribute=""] its used to locate some specific web elements or if you want to select
	//something between two same object having same properties and classname or other same attributes
		
//		driver.findElement(By.cssSelector("input.search-box-text[name=\"q\"]")).sendKeys("Himanshu");
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Himanshu");
		
		

	}

}
