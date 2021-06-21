package swagLabs.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import swagLabs.Pages.LoginPage;
import swagLabs.utility.Browser;
import swagLabs.utility.Custom_Listeners;

@Listeners(Custom_Listeners.class)
public class TC001 extends Browser{
	 SoftAssert softassert=new SoftAssert();
	WebDriver driver;
	@BeforeClass()
	public void browserSetup() {
		driver=openBrowser();
		url("https://www.saucedemo.com/");
	}
	private Object[][] logins;
	@DataProvider(name="LoginCredentials")
	public Object[][] dataProvider() {
		logins=new Object[2][2];
		logins[0][0]="standard_user";
		logins[0][1]="secret_sauce";
		logins[1][0]="problem_user";
		logins[1][1]="secret_sauce";
		return logins;
	}
	@Parameters({"username","password"})
	@Test(invocationCount = 2)
	public void Login_Test(String username,String password) {
		LoginPage login=new LoginPage(driver);
		login.VerifyLogin(username, password);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.navigate().to("https://www.saucedemo.com/");
		
		
		
	}
	
	public void tearDown() {
		System.out.println(driver.getCurrentUrl());
		closeBrowser();
	}//*[@id="inventory_container"]/div/div[1]
	//*[@id="inventory_container"]/div/div[2] 
}
