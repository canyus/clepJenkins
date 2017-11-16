package com.collegeboard.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.collegeboard.utilities.Driver;

public class LoginPage {
	
	public LoginPage() {
		PageFactory.initElements(Driver.getInstance(), this);
	}
	
	@FindBy(xpath= ".//*[@id='userName']")
	public WebElement UserNameBox;
	
	@FindBy(xpath= ".//*[@id='passWord']")
	public WebElement PasswordBox;
	
	@FindBy(xpath= ".//*[@id='signInActionBlock']/div[1]/div[2]/div/button")
	public WebElement SignInButton;
	
	@FindBy(xpath=".//*[@id='mainPage']/div[1]/div")
	public WebElement WelcomeLogo;
	
	@FindBy(xpath=".//*[@id='mainPage']/div[4]/span")
	public WebElement LoginErrorLink;
	
	public void login(String username, String password) {
		UserNameBox.sendKeys(username);
		PasswordBox.sendKeys(password);
		
	}
}
