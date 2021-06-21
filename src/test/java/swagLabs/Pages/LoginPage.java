package swagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class LoginPage {
	 
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	private By username=By.name("user-name");
	private By password=By.name("password");
	private By btnClick=By.name("login-button");
	private void setUserName(String name) {
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys(name);
	}
	private void setPassword(String pass) {
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(pass);
	}
	private void click_On_Login() {
		driver.findElement(btnClick).click();
	}
	
	public void VerifyLogin(String uname,String upass) {
		this.setUserName(uname);
		this.setPassword(upass);
		this.click_On_Login();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
		
	}
}
