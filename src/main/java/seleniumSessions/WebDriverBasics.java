package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.manager.SeleniumManagerOutput.Result;


public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://www.youtube.com/watch?v=4qznbBhfwUs
		//New Selenium Manager | No WebDriverManager | No System.setProperty() | No System Path Needed
		
		ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("--start-maximized");
		Result driverpath=SeleniumManager.getInstance().getDriverPath(chromeOptions, false);
		System.out.println(driverpath);
		
		WebDriver driver=new ChromeDriver();
		//driver.navigate("www.google.com");
		
		driver.get("https://google.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();
		
		

	}

}
