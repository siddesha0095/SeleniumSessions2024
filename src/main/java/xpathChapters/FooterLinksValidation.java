package xpathChapters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLinksValidation {
    public static void main(String[] args) {
    	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        

        // Open the URL
        driver.get("https://www.bell.ca/");

        // Find the footer element
        WebElement footer = driver.findElement(By.tagName("footer"));

        // Find all the links within the footer
        List<WebElement> footerLinks = footer.findElements(By.tagName("a"));

        // Iterate through each footer link
        for (WebElement footerLink : footerLinks) {
            // Get the href attribute of the link
            String url = footerLink.getAttribute("href");

            // Validate the link
            if (url != null && !url.isEmpty()) {
                // Check if the URL is valid
                if (isValidURL(url)) {
                    System.out.println("Valid footer link: " + url);
                } else {
                    System.out.println("Invalid footer link: " + url);
                }
            }
        }

        // Close the browser
        driver.quit();
    }

    // Method to validate URL
    public static boolean isValidURL(String url) {
        try {
            new java.net.URL(url).toURI();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
