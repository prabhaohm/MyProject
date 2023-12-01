package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.utilities.PbaseClass;
import org.utilities.SigninPojo;

import io.cucumber.java.en.*;

public class SigninStepDefinition extends PbaseClass {
	
	@Given("User should load the chrome browser and load the url")
	public void user_should_load_the_chrome_browser_and_load_the_url()  {
		
		launchChrome();
		loadUrl("https://www.freightcenter.com/");
		winMax();
		
	   
	}

	@When("User should click the signin")
	public void user_should_click_the_signin() throws InterruptedException  {
		SigninPojo s = new SigninPojo();
		WebElement signin = s.getSignin();
		s.clickjs(signin);
		Thread.sleep(2000);
		
	    
	}

	@When("User should input invalid username in the textbox")
	public void user_should_input_invalid_username_in_the_textbox() throws InterruptedException {
		SigninPojo s = new SigninPojo();
		WebElement username = s.getUsername();
		fill(username, "Freight@hotmail.com");
	    Thread.sleep(1000);
	}

	@When("User should input invalid password in the textbox")
	public void user_should_input_invalid_password_in_the_textbox() {
		SigninPojo s = new SigninPojo();
		WebElement password = s.getPassword();
		fill(password, "Pass1234");
		
		
	}

@When("User should print the title of the page")
public void userShouldPrintTheTitleOfThePage() {
	printCurrentUrl();
   
}

	@When("User should click the login button")
	public void user_should_click_the_login_button() {
		SigninPojo s = new SigninPojo();
		WebElement login = s.getLogin();
		clickjs(login);
	}
	
	@Then("User should check the credential page")
	public void user_should_che4ck_the_credential_page() {
		String current = driver.getCurrentUrl();
		Assert.assertTrue("Check Login Page", current.contains("login"));
		System.out.println("Test case pass");
		//closeChrome();
	   
	}
	
	@When("User should input valid username and invalid password in the textbox")
	public void userShouldInputValidUsernameAndInvalidPasswordInTheTextbox() throws InterruptedException {
		SigninPojo s = new SigninPojo();
		WebElement username = s.getUsername();
		WebElement password = s.getPassword();
		fill(username, "Center@gmail.com");
		fill(password, "Pass1234");
	    Thread.sleep(1000);
	    
	}
	
	@When("User should input valid invalidusername{string} and valid password{string} in the textbox")
	public void userShouldInputValidInvalidusernameAndValidPasswordInTheTextbox(String s1, String s2) {
		
		SigninPojo s = new SigninPojo();
		WebElement username = s.getUsername();
		WebElement password = s.getPassword();
		fill(username, s1);
		fill(password, s2);
	}
	
	@When("User should input valid username and invalid passworD in the textbox")
	public void userShouldInputValidUsernameAndInvalidPassworDInTheTextbox(io.cucumber.datatable.DataTable d) {
	    
		SigninPojo s = new SigninPojo();
		WebElement username = s.getUsername();
		WebElement password = s.getPassword();
		
		//2D Map
		List<Map<String, String>> mp = d.asMaps();
		Map<String, String> m = mp.get(2);
		//get (key);
		String userValue = m.get("Person");
		
		Map<String, String> x = mp.get(0);
		String passValue = x.get("Animal");
		 
		
		fill(username, userValue);//Marsh@hotmail.com
		fill(password, passValue);//Tiger123
	}
		
		
}
