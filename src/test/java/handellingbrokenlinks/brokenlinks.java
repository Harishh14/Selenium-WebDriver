package handellingbrokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
//import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinks {

	public static void main(String[] args) throws InterruptedException {

		// first we should have the href tag and the url in the tag is mandatory
		// capture the link
//		then check the status code
//		status code>400 broken link
//		status code<400 not broken link

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();

		// capture all the links of the page.

		List<WebElement> links = driver.findElements(By.tagName("a"));

//		int size = links.size();
//		System.out.println(size);

		int brokenlink = 0;

		for (WebElement linke : links) {

			String hrefatt = linke.getAttribute("href");

			if (hrefatt == null || hrefatt.isEmpty()) {
				System.out.println("the link is null or empty");
				continue;
			}

			// hit the server.

			// convert string into url.

			try {
				URL urlL = new URL(hrefatt); // coverting string into url format
				HttpURLConnection conn = (HttpURLConnection) urlL.openConnection(); // open connection
				conn.connect(); // connecting the url.

				if (conn.getResponseCode() >= 400) {
					System.out.println(hrefatt + "not a broken link");
					brokenlink++;
				} else {
					System.out.println(hrefatt + "not a broken link");
				}
			} catch (Exception e) {
//				
			}

		}
		System.out.println(brokenlink);

	}

}
