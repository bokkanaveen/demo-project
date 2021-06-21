package stepDefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import utility.BaseClass;

public class Login_Steps extends BaseClass {
	WebDriver driver;	
//public Login_Steps(WebDriver driver) {
	//this.driver=driver;
//}
	
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() throws Exception {
	 BaseClass.browserSetup(ReadData_From_Properties("url"));
	 PASS();
	 
	}
	
	@When("user enters username on username field")
	public void user_enters_username_on_username_field() throws Exception {
		enterInput(ReadData_From_Properties("emailxpath"),ReadData_From_Properties("emailTextBox"));
		action(BaseClass.ReadData_From_Properties("clickNextButton"));
		
	 
	}

	@And("user enters password on password field")
	public void user_enters_password_on_password_field() throws Exception {
		
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		
	}

	@Then("user navigate to user home page")
	public void user_navigate_to_user_home_page() {
		
	}
	@Given("user is on google home page")
	public void user_is_on_google_home_page() throws Exception {
	   BaseClass.browserSetup(ReadData_From_Properties("googleUrl"));
	}

	@When("user enters text on googleText box field")
	public void user_enters_text_on_google_text_box_field() throws Exception {
		enterInput(ReadData_From_Properties("googleInputBoxXpath"),ReadData_From_Properties("googleText"));
	}

	@When("user click on google search button")
	public void user_click_on_google_search_button() throws Exception {
	   action(ReadData_From_Properties("GoogleSearchButton"));
	}

	@Then("user navigate to google search source content")
	public void user_navigate_to_google_search_source_content() throws Exception {
		action(ReadData_From_Properties("Youtubelinkxpath"));
	}
}
