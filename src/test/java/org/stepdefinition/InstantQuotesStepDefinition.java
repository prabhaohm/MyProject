package org.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.utilities.InstantQuotesPojo;
import org.utilities.PbaseClass;

import io.cucumber.java.en.*;

public class InstantQuotesStepDefinition extends PbaseClass {

	@Given("User should open the chrome browser and load the url")
	public void userShouldOpenTheChromeBrowserAndLoadTheUrl() {
		launchChrome();
		loadUrl("https://www.freightcenter.com/");
		winMax();
	    
	}

	@When("User should click the free instant freight quotes")
	public void userShouldClickTheFreeInstantFreightQuotes() {
		InstantQuotesPojo i = new InstantQuotesPojo();
		WebElement freequotes = i.getFreequotes();
		clickjs(freequotes);
	   
	}

	@When("User should give input in the height text box")
	public void userShouldGiveInputInTheHeightTextBox() {
		InstantQuotesPojo i = new InstantQuotesPojo();
		WebElement height = i.getHeight();
		fill(height, "48");
	   
	}

	@When("User should give input in the lbs text box")
	public void userShouldGiveInputInTheLbsTextBox() {
		InstantQuotesPojo i = new InstantQuotesPojo();
		WebElement lbs = i.getLbs();
		fill(lbs, "1000");
	    
	}

	@When("User should give input of pickup postal code in the text box")
	public void userShouldGiveInputOfPickupPostalCodeInTheTextBox() {
		InstantQuotesPojo i = new InstantQuotesPojo();
		WebElement pickupcode = i.getPickupcode();
		fill(pickupcode, "30907");
	}

	@When("User should click the pickup resdidental area check box")
	public void userShouldClickThePickupResdidentalAreaCheckBox() {
		InstantQuotesPojo i = new InstantQuotesPojo();
		WebElement presidentclick = i.getPresidentclick();
		clickjs(presidentclick);
	    
	}

	@When("User should give input of delivery postal code in the text box")
	public void userShouldGiveInputOfDeliveryPostalCodeInTheTextBox() {
		
		InstantQuotesPojo i = new InstantQuotesPojo();
		WebElement deliveryloc = i.getDeliveryloc();
		fill(deliveryloc, "32003");
		clickjs(deliveryloc);
	    
	}

	@When("User should click the delivery residental area check box")
	public void userShouldClickTheDeliveryResidentalAreaCheckBox() {
		InstantQuotesPojo i = new InstantQuotesPojo();
		WebElement dresidentclick = i.getDresidentclick();
		clickjs(dresidentclick);
	    
	}

	@When("User should click the Quote button")
	public void userShouldClickTheQuoteButton() {
		
		InstantQuotesPojo i = new InstantQuotesPojo();
		WebElement getquote = i.getGetquote();
		clickjs(getquote);
	    
	}

	@Then("User should navigate to the quick register page")
	public void userShouldNavigateToTheQuickRegisterPage() {
		
		String current = driver.getCurrentUrl();
		Assert.assertTrue("Check the Page",current.contains("quote") );
		System.out.println("Test Case Pass");
		//closeChrome();
	    
	}
}
