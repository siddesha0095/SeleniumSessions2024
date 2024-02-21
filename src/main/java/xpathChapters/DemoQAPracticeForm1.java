package xpathChapters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class DemoQAPracticeForm1 {
    public static void main(String[] args) {
        // Set the path to chromedriver.exe
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
    	
    	  WebDriverManager.chromedriver().setup();
  		WebDriver driver = new ChromeDriver();

  	// Open the URL
        driver.get("https://demoqa.com/automation-practice-form");

        // Define FluentWait with 10 seconds timeout and 2 seconds polling interval
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(Exception.class);

        // Fill in the form fields using FluentWait
        WebElement firstNameInput = wait.until(new ExpectedCondition<WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id("firstName"));
            }
        });
        firstNameInput.sendKeys("John");

        WebElement lastNameInput = wait.until(new ExpectedCondition<WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id("lastName"));
            }
        });
        lastNameInput.sendKeys("Doe");

        WebElement emailInput = wait.until(new ExpectedCondition<WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id("userEmail"));
            }
        });
        emailInput.sendKeys("johndoe@example.com");

        WebElement genderRadio = wait.until(new ExpectedCondition<WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//label[normalize-space()='Male']"));
            }
        });
        genderRadio.click();

        WebElement mobileNumberInput = wait.until(new ExpectedCondition<WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id("userNumber"));
            }
        });
        mobileNumberInput.sendKeys("1234567890");

        WebElement dateOfBirthInput = wait.until(new ExpectedCondition<WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id("dateOfBirthInput"));
            }
        });
        dateOfBirthInput.sendKeys("01 Jan 1990");

        WebElement subjectsInput = wait.until(new ExpectedCondition<WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id("subjectsInput"));
            }
        });
        subjectsInput.sendKeys("Maths");

        WebElement hobbiesCheckbox = wait.until(new ExpectedCondition<WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
            }
        });
        hobbiesCheckbox.click();

        WebElement currentAddressInput = wait.until(new ExpectedCondition<WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id("currentAddress"));
            }
        });
        currentAddressInput.sendKeys("123 Main St");

        // Upload a file
        WebElement uploadButton = wait.until(new ExpectedCondition<WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id("uploadPicture"));
            }
        });
        uploadButton.sendKeys("path/to/image.jpg");

        // Click the submit button
        WebElement submitButton = wait.until(new ExpectedCondition<WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id("submit"));
            }
        });
        submitButton.click();

        // Wait for the form to be submitted (you might need to implement a wait strategy here)

        // Close the browser
        //driver.quit();
    }
}