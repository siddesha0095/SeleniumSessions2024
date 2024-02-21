package experiment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWait1 {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://edition.cnn.com/");
		waitForPageLoad(20);
//		By emailid = By.id("input-email");
//		retryingElement(emailid, 20, 2000).sendKeys("test@gmail.com");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static WebElement retryingElement(By locator, int timeOut) {

		WebElement element = null;
		int attempts = 0;
		while (attempts < timeOut) {
			try {
				element = getElement(locator);
				break;
			} catch (NoSuchElementException e) {
				System.out.println("element is not found in attempt : " + attempts + ":" + locator);
				try {
					Thread.sleep(500);// default interval time
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			attempts++;
		}
		if (element == null) {
			try {
				throw new Exception("ELEMENTNOTFOUNDEXCEPTION");
			} catch (Exception e) {
				System.out.println("element is not found exception...tried for : " + timeOut + " secs "
						+ " with the interval of : " + 500 + " ms");
			}
		}

		return element;

	}

	public static WebElement retryingElement(By locator, int timeOut, int intervalTime) {

		WebElement element = null;

		int attempts = 0;
		while (attempts < timeOut) {
			try {
				element = getElement(locator);
				break;
			} catch (NoSuchElementException e) {
				System.out.println("element is not found in attempt : " + attempts + ":" + locator);
				try {
					Thread.sleep(intervalTime);// custom interval time
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			attempts++;
		}
		if (element == null) {
			try {
				throw new Exception("ELEMENTNOTFOUNDEXCEPTION");
			} catch (Exception e) {
				System.out.println("element is not found exception...tried for : " + timeOut + " secs "
						+ " with the interval of : " + intervalTime + " ms");
			}
		}

		return element;

	}

//	public static void waitForPageLoad(int timeOut) {
//
//		long endTime = System.currentTimeMillis() + timeOut;
//		while (System.currentTimeMillis() < endTime) {
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			String state = js.executeScript("return document.readyState").toString();
//			System.out.println(state);
//			if (state.equals("complete")) {
//				break;
//			}
//
//		}
//
//	}
	
	public static void waitForPageLoad(int timeOut) {
	    long endTime = System.currentTimeMillis() + timeOut;
	    while (System.currentTimeMillis() < endTime) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        String state = js.executeScript("return document.readyState").toString();
	        System.out.println(state);
	        if (state.equals("complete")) {
	            return;
	        }
	    }
	    throw new TimeoutException("Page load timeout after " + timeOut + " milliseconds.");
	}

}