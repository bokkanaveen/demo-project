package swagLabs.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	
	static WebDriver driver;
	public WebDriver openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		return driver;
	}
	public void url(String Url) {
		driver.get(Url);
	}
	public void closeBrowser() {
		driver.close();
	}
}
