package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Guru99 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://live.techpanda.org/index.php/customer/account/login/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("siddesha0095@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Navaneeth5#");
		driver.findElement(By.xpath("//*[@id='send2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Mobile']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@id='product-collection-image-1']")).click();
		Thread.sleep(2000);
		boolean flag=driver.findElement(By.xpath("//span[normalize-space()='Sony Xperia']")).isDisplayed();
		System.out.println(flag);
		
		
	}
		
		
		
		
//
////		WebElement country = driver.findElement(By.id("Form_submitForm_Country"));
////		//html tag = select -- dropdown
////		Select select = new Select(country);
////		//select.selectByIndex(5);
////		select.selectByVisibleText("India");
////		//select.selectByValue("Algeria");
////		
////		Thread.sleep(2000);
////		
////		WebElement state = driver.findElement(By.id("Form_submitForm_State"));
////		Select select1 = new Select(state);
////		select1.selectByVisibleText("Goa");
//
//		By country = By.id("Form_getForm_Country");
////		By state = By.id("Form_submitForm_State");
////		doSelectByVisibleText(country, "India");
////		Thread.sleep(2000);
////		doSelectByVisibleText(state, "Goa");
//		
//		Select select = new Select(driver.findElement(country));
//		System.out.println(select.isMultiple());	
//		select.getAllSelectedOptions();
//
//	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}

	public static void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public static void doSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	

}