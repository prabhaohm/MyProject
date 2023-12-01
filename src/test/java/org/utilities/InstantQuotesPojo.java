package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstantQuotesPojo extends PbaseClass {
	public InstantQuotesPojo() {
PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Free Instant Freight Quotes']")
	private WebElement freequotes;
	
	@FindBy(xpath="//input[@name='height[]']")
	private WebElement height;
	
	@FindBy(xpath="//input[@name='weight[]']")
	private WebElement lbs;
	
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement pickupcode;
	
	@FindBy(xpath="//div[@class='icon-check'][1]")
	private WebElement presidentclick;
	
	@FindBy(xpath="//input[@name='postal-code-delivery[zip]']")
	private WebElement deliveryloc;
	
	@FindBy(xpath="(//span[text()='Residental area'])[2]")
	private WebElement dresidentclick;
	
	@FindBy(xpath="//button[text()='Get Quote']")
	private WebElement getquote;

	public WebElement getFreequotes() {
		return freequotes;
	}

	public WebElement getHeight() {
		return height;
	}
	

	public WebElement getLbs() {
		return lbs;
	}

	public WebElement getPickupcode() {
		return pickupcode;
	}

	public WebElement getPresidentclick() {
		return presidentclick;
	}

	public WebElement getDeliveryloc() {
		return deliveryloc;
	}

	public WebElement getDresidentclick() {
		return dresidentclick;
	}

	public WebElement getGetquote() {
		return getquote;
	}

	
}
