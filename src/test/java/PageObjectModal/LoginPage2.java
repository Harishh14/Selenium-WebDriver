package PageObjectModal;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

	WebDriver driver;

	// constructor
	LoginPage2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// locators\
	// when we are using pagefactory so we dont need to write locators in this way
	// simply we can
	// write by adding @findby();

//	@FindBy(xpath = "//input[@placeholder='Username']")
	@FindBy(how=How.XPATH,using="//input[@placeholder='Username']")
	WebElement textu;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement textp;
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement clogin;

	@FindBy(tagName = "a")
	List<WebElement> links;

//actions.

	public void setUsername(String user) {
		textu.sendKeys(user);
	}

	public void setPassword(String pwd) {
		textp.sendKeys(pwd);
	}

	public void ClickLogin() {
		clogin.click();
	}

}
