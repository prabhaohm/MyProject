package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPojo extends PbaseClass {
	public SigninPojo() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//span[text()='Sign in']")
	private WebElement signin;
	
	@FindBy(xpath="//input[@name='emailId']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement login;

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
}
