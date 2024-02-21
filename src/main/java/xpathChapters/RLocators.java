package xpathChapters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;


public class RLocators {


public static void main(String args[]) throws InterruptedException {

WebDriver driver;

driver = new ChromeDriver();

driver.get("https://www.browserstack.com/");


WebElement appLive = driver.findElement(By.xpath("//div[@class='product-section__content-wrapper']//h4[@class='product-section__content-title'][normalize-space()='App Live']"));

WebElement getADemo = driver.findElement(RelativeLocator.with(By.tagName("button")).above(appLive));

getADemo.click();

}

}