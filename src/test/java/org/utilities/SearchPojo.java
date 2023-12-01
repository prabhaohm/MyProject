package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPojo extends PbaseClass {
	public SearchPojo() {
PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Search Here']")
	private WebElement srch;
	
	@FindBy(xpath="//input[@id='search_input']")
	private WebElement srchinput;
	
	@FindBy(xpath="//button[@class='search-form__btn']")
	private WebElement srchbtn;
	
	@FindBy(xpath="//a[text()='Shipping Hazardous Material']")
	private WebElement shiphazmat;

	public WebElement getSrch() {
		return srch;
	}

	public WebElement getSrchinput() {
		return srchinput;
	}

	public WebElement getSrchbtn() {
		return srchbtn;
	}

	public WebElement getShiphazmat() {
		return shiphazmat;
	}
	
	
	
	

}
