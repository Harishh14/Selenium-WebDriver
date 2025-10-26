package Tables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Statictables {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");

		// first we'll count how many rows are there in the table.
		// we use to locate elements with class tag name or attribute if there's only
		// one element present on the page otherwise we use exact xpath for the element.

		// priniting number of rows in the table
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println(rows);

		// priniting number of coloumns in the table
		int col = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println(col);

//		 printing specific element from the specific row and from the specfic coloumn.

		String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[3]")).getText();
		System.out.println(bookname);

		// if you want to print whole table then you have to use table as 2D table.

		for (int r = 2; r <= rows; r++) {
			for (int c = 1; c <= col; c++) {
				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[" + c + "]"))
						.getText();
				System.out.print((value) + "   ");
			}
			System.out.println();

		}
		
		//printing bookname by matching the author name
	
		for(int r=2;r<=rows;r++) {
			String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			
			if(author.equals("Mukesh")) {
				String book = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(book+"\t"+author);
			}
			
		}

	
	
	}

}
