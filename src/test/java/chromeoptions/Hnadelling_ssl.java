package chromeoptions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hnadelling_ssl {

	public static void main(String[] args) {
		 
		ChromeOptions option = new ChromeOptions();
		option.setAcceptInsecureCerts(true);//if we dont add this statement we'll not be able to access the page or we'll get the error of privacy.

		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://expired.badssl.com/");
		String titl =driver.getTitle();
		System.out.println(titl);

	}

}
