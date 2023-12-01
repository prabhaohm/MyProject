package org.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.utilities.PbaseClass;
import org.utilities.SearchPojo;

import io.cucumber.java.en.*;

public class SearchStepDefinition extends PbaseClass {

	@Given("User should open the chrome browser and load the Url")
	public void userShouldOpenTheChromeBrowserAndLoadTheUrl() {
		launchChrome();
		loadUrl("https://www.freightcenter.com/");
		winMax();
	    
	}

	@When("User should click the search here button")
	public void userShouldClickTheSearchHereButton() {
		SearchPojo s = new SearchPojo();
		WebElement srch = s.getSrch();
		clickjs(srch);
	    
	}

	@When("User should input text in the search text box")
	public void userShouldInputTextInTheSearchTextBox() {
		
		SearchPojo s = new SearchPojo();
		WebElement srchinput = s.getSrchinput();
		fill(srchinput, "dangerous goods");
		
	   
	}

	@When("User should click the search image button")
	public void userShouldClickTheSearchImageButton() {
		
		SearchPojo s = new SearchPojo();
		WebElement srchbtn = s.getSrchbtn();
		clickjs(srchbtn);
	    
	}

	@When("User should click the shipping hazardous material")
	public void userShouldClickTheShippingHazardousMaterial() {
		
		SearchPojo s = new SearchPojo();
		WebElement shiphazmat = s.getShiphazmat();
		clickjs(shiphazmat);
	    
	}

	@Then("User should navigate to the hazard page")
	public void userShouldNavigateToTheHazardPage() {
		
		String current = driver.getCurrentUrl();
		Assert.assertTrue("Check the page", current.contains("hazardous"));
		System.out.println("Test Case Pass");
	    
	}
}
