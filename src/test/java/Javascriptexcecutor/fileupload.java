package Javascriptexcecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		driver.manage().window().maximize();
		// for single file upload .
//		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("D:\\automation\\java\\Arrays\\.classpath");
//		
//		String text=driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText();
//		System.out.println(text);
//		
//		if(text.equals(".classpath")) {
//			System.out.println("file uploaded successfully");
//		}else {
//			
//			System.out.println("file uploaded failed");
//		}
		
		//for multiple file upload.
		String file1= "D:\\automation\\java\\Arrays\\.classpath";
		String file2= "D:\\automation\\java\\Arrays\\.project";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		
		int number = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		System.out.println(number);
		String name1= driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText();
		String name2= driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText();
//		validation by number of files
		if(number==2) {
			System.out.println("file are uploaded correctly");
		}else {
			System.out.println("file uploading failed");
			
		}
		
		//validation through file name.
		
		if(name1.equals(".classpath") && name2.equals(".project")) {
			System.out.println("file upload successfull");
		}else {
			System.out.println("file upload failed");
		}
		
	
		
		
		
	}
}
