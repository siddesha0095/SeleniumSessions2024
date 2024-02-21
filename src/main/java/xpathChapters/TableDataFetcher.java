package xpathChapters;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableDataFetcher {
    
    public static List<String> getFirstColumnData(WebDriver driver) {
        List<String> firstColumnData = new ArrayList<>();
        
        // Find the table element
        WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
        
        // Find all rows of the table
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        
        // Iterate through rows and get data from the first column (excluding header)
        for (int i = 1; i < rows.size(); i++) {
            // Find the first cell (column) of the row
            WebElement firstCell = rows.get(i).findElement(By.tagName("td"));
            
            // Get text from the first cell and add to the list
            firstColumnData.add(firstCell.getText().trim());
        }
        
        return firstColumnData;
    }
    
    public static void main(String[] args) {
    	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        
        // Open the web page containing the table
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        
        // Call the function to get first column data
        List<String> firstColumnData = getFirstColumnData(driver);
        
        // Print the first column data
        for (String data : firstColumnData) {
            System.out.println(data);
        }
        
        // Close the browser
        driver.quit();
    }
}
