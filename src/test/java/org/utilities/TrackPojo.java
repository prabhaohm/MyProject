package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrackPojo extends PbaseClass {
	public TrackPojo() {
PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Track']")
	private WebElement track;
	
	@FindBy(xpath="//input[@placeholder='Enter freight center shippment ID'][1]")
	private WebElement shipmentid;
	
	@FindBy(xpath="//button[text()='Track'][1]")
	private WebElement clicktrack;

	public WebElement getTrack() {
		return track;
	}

	public WebElement getShipmentid() {
		return shipmentid;
	}

	public WebElement getClicktrack() {
		return clicktrack;
	}
	
	
	
	
	

}
