package xpathChapters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BigBasketMenuTraversal {
    public static void main(String[] args) {
  	  WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();


        // Open the URL
        driver.get("https://www.bigbasket.com/");

        // Click on "Shop by Category"
        WebElement shopByCategory = driver.findElement(By.xpath("(//*[local-name()='svg' and @class = 'CategoryMenu___StyledArrowDown-sc-d3svbp-3 iwTeGC transform rotate-180'])[1]"));
        shopByCategory.click();

        // Traverse through main menus
        for (int i = 1; i <= 7; i++) { // Assuming there are 7 main categories
            WebElement mainMenu = driver.findElement(By.xpath("//ul[@id='navBarMegaNav']/li[" + i + "]"));
            String mainMenuText = mainMenu.getText();
            System.out.println("Main Menu: " + mainMenuText);

            // Traverse through submenus
            for (int j = 1; j <= 3; j++) { // Assuming there are 3 subcategories in each main category
                WebElement subMenu = driver.findElement(By.xpath("//ul[@id='navBarMegaNav']/li[" + i + "]/div/ul/li[" + j + "]/a"));
                String subMenuText = subMenu.getText();
                System.out.println("Sub Menu: " + subMenuText);
            }
        }

        // Close the browser
        driver.quit();
    }
}
