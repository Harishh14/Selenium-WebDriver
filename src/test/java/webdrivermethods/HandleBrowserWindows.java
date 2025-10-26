package webdrivermethods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String>WinID =driver.getWindowHandles();
		
//		we can handle window id's with two approaches Ist is coverting set into Arreylist. second is by foreach loop.
		
//		List<String> windowlist = new ArrayList(WinID);
//		
//		String parentid = windowlist.get(0);
//		String childid = windowlist.get(1);
//		 
//		
//		//we have to use switch function to switch from orignal browser to new open window.
//		driver.switchTo().window(childid);
//		System.out.println(driver.getTitle());
//		
//		//if want to capture parent window title then.
//		
//		driver.switchTo().window(parentid);
//		System.out.println(driver.getTitle());
//		
		//here navigation commands won't work because switch function is performing the action.
		
		//second approach is using for each loop
		
		for(String WindowIDs:WinID) {
			
			String title = driver.switchTo().window(WindowIDs).getTitle();
			if(title.equals("Human Resources Management Software | HRMS | OrangeHRM")) {
				System.out.println(driver.getTitle());
			}
		}
		
		
		
		

	}

}
