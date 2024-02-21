package seleniumSessions;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		
		
		//FirefoxOptions options = new FirefoxOptions();
		//options.setCapability("firefox_binary", new FirefoxBinary(new File("C:\\Users\\Siddesha\\Downloads\\geckodriver-v0.34.0-win32\\geckodriver.exe")));
		//WebDriver driver = new FirefoxDriver(options);


		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Siddesha\\Downloads\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//WebDriver driver =new SafariDriver();
		
		WebDriver driver =new EdgeDriver();
		
		
		driver.get("https://www.google.com");//enter url
		String title = driver.getTitle(); //get thte page title -- Google
		System.out.println(title);
		
		driver.quit();
		
		
		
	}

}