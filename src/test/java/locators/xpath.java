package locators;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class xpath {

	public static void main(String[] args) {
		
//		xpath is derived from xml(extensible markup language) and it's know as address of an element.
		
//		there are two types of xpath:-abosulute xpath & partial xpath.
		
		/*abouslute xpath navigate each and every node and part of the element but relative or partial xpath
		 * do not it directly addresses the element.
		 * absolute:-/html/body/header/div/div/div[3]/div/input
		 * relative:-//*[@id="search"]
		 * 
		 * difference 
		 * absolute xpath start with single / and relative with //
		 * absoulte xpath don't use attributes whereas relative uses.
		 * absoulte xpath transverse each and every node till it find the element but relative directly.
		 * 
		 * we always use relative xpath and there are two ways to generate xpaths
		 * automatically:- selectorshub,devtools
		 * manually:-(own xpaths);
		 * 
		 * syntax:-
		 *   //tagname[@attrubutename='value']
		 * in case you dont know the tag name :-//*[@attrubutename='value']
		 */
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
//		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Himanshu");//with single attribute
		
		//with mlutiple attributes.
//		driver.findElement(By.xpath("//input[@id='small-searchterms'][@placeholder='Search store']")).sendKeys("Himanshu");//with multiple attribute
		
		//with operators like 'and' 'OR'
//		driver.findElement(By.xpath("//input[@id='small-searchterms' and @placeholder='Search store']")).sendKeys("Himanshu");//with single attribute
//		driver.findElement(By.xpath("//input[@id='small-searchterms' or @placeholder='Search store']")).sendKeys("Himanshu");//with single attribute
		
	// xpath with inner text it can be used only with inner text of links that has href.
//		driver.findElement(By.xpath("//a[text()=' Electronics ']")).click();//with single attribute
		
	//want to verify is something is displaying or not on ui then you can use this.
//		boolean ch =driver.findElement(By.xpath("//strong[text()='Featured products']")).isDisplayed();//with single attribute
//		System.out.println(ch);
		
		
		//contains method used to locate element with its matching partial value.
//		driver.findElement(By.xpath("//input[contains(@id,'small-sea')]")).sendKeys("himanshu");
		
		//xpath by starts-with
//		driver.findElement(By.xpath("//input[starts-with(@id,'small-sea')]")).sendKeys("himanshu");
		
		//chained xpath is used in the scenario when you try to ocate an image that has no attribute 
		//so we try to locate its parent its combinate of absolute xpath and relative xpath.
//		syntax= //tagname[@attribute='value']/childnode/childnode.
		boolean view=driver.findElement(By.xpath("//div[@class='picture']/a/img")).isDisplayed();
				System.out.println(view);
		
		
	}

}
