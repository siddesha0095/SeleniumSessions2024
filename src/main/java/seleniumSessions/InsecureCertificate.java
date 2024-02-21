package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InsecureCertificate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--ignore-certificate-errors");

		WebDriver driver = new ChromeDriver(options);

	driver.get("http://opencart.antropy.co.uk/index.php?route=account/login");
	String url =driver.getCurrentUrl();
	System.out.println(url);

	}

}
