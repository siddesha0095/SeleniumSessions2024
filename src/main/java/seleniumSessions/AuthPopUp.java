package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopUp {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//username password need to pass in url
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		//CDP -auth - selenium 4.x
		
		
	}

}