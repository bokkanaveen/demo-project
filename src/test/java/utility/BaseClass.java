package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;




import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass  {
	
	static WebDriver driver;
	
	public static void browserSetup(String URL) throws Exception {
		 WebDriverManager.chromedriver().setup();
		  //System.setProperty("webdriver.chrome.driver","")
		   driver=new ChromeDriver();
		  
		   driver.get(URL);
		   driver.manage().deleteAllCookies();
		   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		   driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	}
	public static String ReadData_From_Properties(String key) throws IOException {
		
		File src=new File("C:\\Users\\bokka\\NewWork_Space\\com.MyCucumber_Demo\\src\\test\\resources\\TestData\\confing.properties");
		FileInputStream inputStream=new FileInputStream(src);
		Properties pro=new Properties();
		pro.load(inputStream);
		return pro.getProperty(key);
	}
	public static void enterInput(String xpath,String input) throws Exception {
		 driver.findElement(By.xpath(xpath)).sendKeys(input);
		  
	}
	public void action(String Click) {
		
		driver.findElement(By.xpath(Click)).click();
	}
	
	public void PASS() throws Exception {
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, ReadData_From_Properties("expectedTitle"));
	}
}
