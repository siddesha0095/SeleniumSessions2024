package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks2 {
	
	static WebDriver driver;
	
	public static void main(String[] args) {

		
		//https://www.bell.ca/
		
//		BrowserUtil br=new BrowserUtil();
//		
//		//ElementUtil ele=new ElementUtil(driver);
//		
//		
//		
//		br.launchBrowser("chrome");
//		br.launchUrl("https://www.bell.ca/");
//		System.out.println(br.getPageTitle());
//		System.out.println(br.getPageUrl());
		
		
		//br.quitBrowser();
		
		//driver.get("https://www.bell.ca/");
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.bell.ca/");
		//ElementUtil eleUtil = new ElementUtil(driver);
		
		ElementUtil ele=new ElementUtil(driver);
		By links = By.tagName("a");
		
		System.out.println("total links : " + ele.getElements(links).size());
		
		List<String> eleTextList = ele.getLinksTextList(links);
		System.out.println(eleTextList.size());
		System.out.println(eleTextList.contains("Internet"));
		
		for(String e: eleTextList ) {
			System.out.println(e);
			
		}
		
	}
		

	
	

}