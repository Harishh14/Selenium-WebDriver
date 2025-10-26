package locators;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class opencart {

	public static void main(String[] args) {
		// locators are used to identify the various elements on the
		// web pages.

		/*
		 * there are different methods by which we can locate web element:-
		 * id,class,name,linktext/partiallink,tagname. drier.findelement(); used to find
		 * element with these parameters inside.
		 */

		WebDriver driver = new ChromeDriver();

		driver.get("https://opencart.com/");
		driver.manage().window().maximize(); // for maximizing the window.

		// if with the help of name
//		driver.findElement(By.name("newsletter")).sendKeys("Himanshu");// when there's 
		// something ;ike searchbar and you want to give input in the search bar.

		// if with the help of classname & id.
		// we can do this with id but because logo is in the class instead of id
		// so that's why we'd used class here instead of id.

//		boolean logo =driver.findElement(By.className("navbar-brand")).isDisplayed();
//		System.out.println(logo);
//		
		// 3. with the help of linktext. it's used when we want to locate a link on a
		// web browser. and when you want to find any link uniqly

//		driver.findElement(By.linkText("MARKETPLACE")).click(); //in this we type the
		// name of link tag on ui.

		// partial linktext used when you want to locate only one element and that
		// have no duplicates or matches . so that you can locate with just partial
		// name.
//		driver.findElement(By.partialLinkText("FEATU")).click();

		// class name and tag name is used to locate collection or group of elements.
//so if you want to find with class name then we use findelements();
		
//		List<WebElement> headerLinks = driver.findElements(By.className("nav"));
//		System.out.println(headerLinks.size());//cz there's no class we are using tag.

//by Tag name
		List<WebElement> headerLinks = driver.findElements(By.tagName("img"));
		System.out.println(headerLinks.size());//cz there's no class we are using tag.
		
		driver.close();
	}

}
