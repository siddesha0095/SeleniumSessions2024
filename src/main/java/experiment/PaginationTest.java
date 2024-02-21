package experiment;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginationTest {

    static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");

        int pageCount = 1;
        try {
            while (true) {
                if (driver.findElements(By.xpath("//td[text()='Samsun']")).size() > 0) {
                    selectCity("Samsun");
                    System.out.println("page count: " + pageCount);
                    break;
                } else {
                    // Pagination logic:
                    WebElement next = driver.findElement(By.linkText("Next"));
                    if (next.getAttribute("class").contains("disabled")) {
                        System.out.println("Pagination is over. Record is not found.");
                        break;
                    }
                    next.click();
                    // Wait for the next page to load (if needed)
                    //new WebDriverWait(driver, 10).until(ExpectedConditions.urlContains("your_pagination_url_part"));
                    
                   // new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("your_pagination_url_part"));
                    pageCount++;
                }
            }
        } finally {
            // Close the WebDriver in the finally block to ensure it's closed even if an exception occurs
            driver.quit();
        }
    }

    public static void selectCity(String cityName) {
        WebElement cityElement = driver.findElement(By.xpath("//td[text()='" + cityName + "']"));
       // driver.findElement(with(By.xpath("//input[@type='checkbox']"))s.toLeftOf(cityElement)).click();
        
        driver.findElement(with(By.xpath("//input[@type='checkbox']")).toLeftOf(cityElement)).click();
    }
}
