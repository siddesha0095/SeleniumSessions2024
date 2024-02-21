package xpathChapters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQAPracticeForm {
    public static void main(String[] args) {
        // Set the path to chromedriver.exe
      //  System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        
        
        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

        // Initialize ChromeDriver
       // WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, null);

        // Open the URL
        driver.get("https://demoqa.com/automation-practice-form");

        // Find the form fields and fill in the dummy values
        WebElement firstNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));
        firstNameInput.sendKeys("John");

        WebElement lastNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lastName")));
        lastNameInput.sendKeys("Doe");

        WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userEmail")));
        emailInput.sendKeys("johndoe@example.com");

        WebElement genderRadio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='gender-radio-1']")));
        genderRadio.click();

        WebElement mobileNumberInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userNumber")));
        mobileNumberInput.sendKeys("1234567890");

        WebElement dateOfBirthInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dateOfBirthInput")));
        dateOfBirthInput.sendKeys("01 Jan 1990");

        WebElement subjectsInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("subjectsInput")));
        subjectsInput.sendKeys("Maths");

        WebElement hobbiesCheckbox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='hobbies-checkbox-1']")));
        hobbiesCheckbox.click();

        WebElement currentAddressInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("currentAddress")));
        currentAddressInput.sendKeys("123 Main St");

        // Upload a file
        WebElement uploadButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("uploadPicture")));
        uploadButton.sendKeys("path/to/image.jpg");

        // Click the submit button
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
        submitButton.click();

        // Wait for the form to be submitted (you might need to implement a wait strategy here)

        // Close the browser
        driver.quit();
    }
}
