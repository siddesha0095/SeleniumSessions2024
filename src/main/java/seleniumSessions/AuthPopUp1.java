package seleniumSessions;

import java.util.Base64;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopUp1 {

    public static void main(String[] args) throws InterruptedException {
        // Set up ChromeDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Navigate to the URL with basic authentication
        driver.get("https://the-internet.herokuapp.com/basic_auth");
        Thread.sleep(3000);

        // Handle the authentication pop-up
        Alert alert = driver.switchTo().alert();
        String credentials = "admin:admin";
        String encodedCredentials = new String(Base64.getEncoder().encode(credentials.getBytes()));
        alert.sendKeys(encodedCredentials);
        alert.accept();

        // You can continue with your testing after handling the authentication

        // Close the browser
        driver.quit();
    }
}

