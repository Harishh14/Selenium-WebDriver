package chromeoptions;


import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class enableExtension {

    public static void main(String[] args) throws InterruptedException {

//         Path to extracted extension folder
        String extensionPath = "D:\\automation\\selenium\\seleniumwebdriver\\CRX\\SelectorsHub.crxs";

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions-except=" + extensionPath);
        options.addArguments("--load-extension=" + extensionPath);

        WebDriver driver = new ChromeDriver(options);

        driver.get("chrome://extensions/");
        driver.manage().window().maximize();

        Thread.sleep(10000);
        driver.quit();
    

        // Path to your Chrome Extension (.crx file or unpacked directory)
//        String extensionPath = "D:\\automation\\selenium\\seleniumwebdriver\\CRX\\SelectorsHub.crx";  
//        // OR for unpacked folder -> "C:\\Users\\YourUser\\Downloads\\MyExtensionFolder"
//
//        // Create ChromeOptions instance
//        ChromeOptions options = new ChromeOptions();
//
//        // Add the extension
//        options.addExtensions(new File(extensionPath)); 
//        // For unpacked extension, use:
//        // options.addArguments("load-extension=" + extensionPath);
//
//        // Initialize WebDriver with options
//        WebDriver driver = new ChromeDriver(options);
//
//        driver.get("https://google.com");
//        System.out.println("Title is: " + driver.getTitle());
//    
//    
    
    
    
    }
}
