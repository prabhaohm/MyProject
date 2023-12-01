package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgottenPojo extends PbaseClass {
	public ForgottenPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Sign in']")
	private WebElement signin;
	
	@FindBy(xpath="//input[@name='emailId']")
	private WebElement username;
	
	@FindBy(xpath="//a[text()='Click here.']")
	private WebElement clickhere;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement recovermail;
	
	@FindBy(xpath="//span[text()='Recover']")
	private WebElement recoverbtn;

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getClickhere() {
		return clickhere;
	}

	public WebElement getRecovermail() {
		return recovermail;
	}

	public WebElement getRecoverbtn() {
		return recoverbtn;
	}
	
	
	
	
	
	
	
	

}
