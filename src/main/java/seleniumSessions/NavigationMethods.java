package seleniumSessions;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {

	public static void main(String[] args) throws MalformedURLException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		//driver.navigate().to("https://www.amazon.com/");		
		//driver.navigate().to(new URL("https://www.amazon.com"));
		
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());

		driver.navigate().back();
		System.out.println(driver.getTitle());

		
		driver.navigate().forward();
		System.out.println(driver.getTitle());

		
		driver.navigate().back();
		System.out.println(driver.getTitle());

		driver.navigate().refresh();
		
		
		driver.quit();
		
		
		
		
	}

}

//1)Both methods serve the primary purpose of opening a web page, and for simple navigation, either can be used.
//2)navigate().to() provides additional navigation features through the navigate() interface,
//which can be useful for more complex navigation scenarios.
//3)The navigate() interface also includes methods like forward(), backward(), refresh(), etc.,
//which are not available directly with the get() method.

//For simple navigation to a URL, either get() or navigate().to() can be used interchangeably.

//If you need additional navigation features, or if you plan to chain multiple navigation actions together, using the navigate() 
//interface might be more suitable.