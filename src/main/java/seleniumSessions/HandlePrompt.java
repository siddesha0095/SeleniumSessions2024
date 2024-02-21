package seleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlePrompt {

    public static void main(String[] args) {
        // Set up ChromeDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Navigate to the webpage
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");

        // Switch to the frame containing the prompt example
        driver.switchTo().frame("iframeResult");

        // Locate and click the "Try it" button
        driver.findElement(By.cssSelector("button[onclick='myFunction()']")).click();

        // Handle the prompt
        Alert prompt = driver.switchTo().alert();
        String promptText = "Hello, please enter your name:";
        System.out.println("Prompt Text: " + promptText);
        prompt.sendKeys("YourName"); // Enter text into the prompt
        prompt.accept(); // Click the OK button

        // Switch back to the default content
        driver.switchTo().defaultContent();

        // Close the browser
       // driver.quit();
    }
}
