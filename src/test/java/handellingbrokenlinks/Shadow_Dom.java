package handellingbrokenlinks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadow_Dom {

	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://dev.automationtesting.in/shadow-dom");
		driver.manage().window().maximize();
		
		//shadow dom hierarchy:- Shadow host--->>Shadow Root-->Shadow Tree or elements.
//	you cannot handle shadow dom elements directly and this is only place where xpath doesn't 
//	work you have to handel this step by step like 1 to 2 to 3 

		//entering by accessing the first shadow dom.
 SearchContext host1=driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
 Thread.sleep(1000);
// String hs=host1.findElement(By.cssSelector("#shadow-element")).getText();
// System.out.println(hs);

 //now let'smove to the next second element.
 SearchContext host2 = host1.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
 Thread.sleep(1000);
// String hs2=host2.findElement(By.cssSelector("#nested-shadow-element")).getText();
// System.out.println(hs2);

 //now moving to the last element.
 SearchContext host3 = host2.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot();
 Thread.sleep(1000);
 String hs3=host3.findElement(By.cssSelector("#multi-nested-shadow-element")).getText();
 System.out.println(hs3);
	
	}

}
