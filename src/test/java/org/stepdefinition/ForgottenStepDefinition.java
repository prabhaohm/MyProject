package org.stepdefinition;

import org.openqa.selenium.WebElement;
import org.utilities.ForgottenPojo;
import org.utilities.PbaseClass;

import io.cucumber.java.en.*;

public class ForgottenStepDefinition extends PbaseClass {
	
	@Given("User should open the chrome browser and load url")
	public void userShouldOpenTheChromeBrowserAndLoadUrl() {
		launchChrome();
		loadUrl("https://www.freightcenter.com/");
		winMax();
	    
	}
	
	@When("User should click the Signin")
	public void userShouldClickTheSignin() {
	   
		ForgottenPojo f = new ForgottenPojo();
		WebElement signin = f.getSignin();
		clickjs(signin);
	}

	@When("User should input the invalid email in the text box")
	public void userShouldInputTheInvalidEmailInTheTextBox() {
		
		ForgottenPojo f = new ForgottenPojo();
		WebElement username = f.getUsername();
		fill(username, "Moto@gmail.com");
	   
	}

	@When("User should click the forgot link")
	public void userShouldClickTheForgotLink() {
		
		ForgottenPojo f = new ForgottenPojo();
		WebElement clickhere = f.getClickhere();
		clickjs(clickhere);
		
	   
	}

	@When("User should input invalid email in the recover text box")
	public void userShouldInputInvalidEmailInTheRecoverTextBox() {
		
		ForgottenPojo f = new ForgottenPojo();
		WebElement recovermail = f.getRecovermail();
		fill(recovermail, "Moto@gmail.com");
	  
	}

	@Then("User should click the recover buton")
	public void userShouldClickTheRecoverButon() {
		
		ForgottenPojo f = new ForgottenPojo();
		WebElement recoverbtn = f.getRecoverbtn();
		clickjs(recoverbtn);
		//closeChrome();
		
	    
	}
}
