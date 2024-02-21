package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementDisplayed {

	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://opencart.antropy.co.uk/index.php?route=account/login");
		ElementUtil eleUtil = new ElementUtil(driver);
		
		By emailId = By.id("input-email");
		driver.findElement(emailId).sendKeys("test@gmail.com");
		//NoSuchElementException
		//ElementNotFoundException --is not a selenium exception
		
//		boolean flag = driver.findElement(emailId).isDisplayed();
//		System.out.println(flag);
		
		eleUtil.doIsDisplayed(emailId);
		
//		if(eleUtil.doIsDisplayed(emailId)) {
//			eleUtil.doSendKeys(emailId, "test@gmail.com");
//		}
//		
//		driver.findElement(emailId).isEnabled();
		
		
		
	}

}