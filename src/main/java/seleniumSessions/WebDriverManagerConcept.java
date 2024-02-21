package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept{

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup(); //1st Webdriver manager
		
		//WebDriverManager.chromedriver().browserVersion("89.0").setup();
		
		
		//New Updates in WebDriverManager 5.x: No Need to write WebDriver driver = new ChromeDriver();
		//https://www.youtube.com/watch?v=kqQd6PlQtcs
		
		
//		WebDriverManager.firefoxdriver().setup();
	//	WebDriverManager.safaridriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// after 5.1.0 of Webdrivermanager -
				//WebDriver driver = WebDriverManager.chromedriver().create(); // it will create driver instance
				
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}



