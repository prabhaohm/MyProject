package org.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.utilities.PbaseClass;
import org.utilities.TrackPojo;

import io.cucumber.java.en.*;

public class TrackStepDefinition extends PbaseClass {

	@Given("User should open the Chrome browser and load url")
	public void userShouldOpenTheChromeBrowserAndLoadUrl() {
	    launchChrome();
	    loadUrl("https://www.freightcenter.com/");
	    winMax();
	}

	@When("User should click the Track in the upper menu")
	public void userShouldClickTheTrackInTheUpperMenu() {
		
		TrackPojo t = new TrackPojo();
		WebElement track = t.getTrack();
		clickjs(track);
	   
	}

	@When("Uesr should input their id in the Track text box")
	public void uesrShouldInputTheirIdInTheTrackTextBox() {
		
		TrackPojo t = new TrackPojo();
		WebElement shipmentid = t.getShipmentid();
		fill(shipmentid, "999-99999-1");
	    
		
	}

	@When("User should click the Track button")
	public void userShouldClickTheTrackButton() {
	   
		TrackPojo t = new TrackPojo();
		WebElement clicktrack = t.getClicktrack();
		clickjs(clicktrack);
		 
	}

	@Then("User should navigate to the result page")
	public void userShouldNavigateToTheResultPage() {
		
		String current= driver.getCurrentUrl();
		Assert.assertTrue("Check the page", current.contains("recover"));
		System.out.println("Test Case Pass");
	    
	}
}
