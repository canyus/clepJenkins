package com.collegeboard.pages;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.collegeboard.utilities.Config;
import com.collegeboard.utilities.Driver;

public class SignUpPage {
	
	public SignUpPage() {
		PageFactory.initElements(Driver.getInstance(), this);
	}
	
	@FindBy(xpath=".//*[@id='global-header']/div/div[3]/div/div/div/div/div[3]/div[1]/div/a/div[1]/div[1]")
	public WebElement signInLink;
	
	@FindBy(xpath=".//*[@id='global-header']/div/div[5]/div/div/div/div/div/div[2]/div[1]/div/a")
	public WebElement SignUpButton;
	
	@FindBy(xpath=".//*[@id='checkSignUpForm']/fieldset/dl/div/div/span/p[2]/a[1]")
	public WebElement aStudetnLink;
	
	@FindBy(xpath=".//*[@id='firstNameField']")
	public WebElement FirstNameBox;
	
	@FindBy(xpath=".//*[@id='lastNameField']")
	public WebElement LastNameBox;
	
	@FindBy(xpath=".//*[@id='emailAddressField']")
	public WebElement emailBox;
	
	@FindBy(xpath=".//*[@id='confirmEmailField']")
	public WebElement confirmEmailBox;
	
	@FindBy(xpath=".//*[@id='zipPostalField']")
	public WebElement zipCodeBox;
	
	@FindBy(xpath=".//*[@id='userNameField']")
	public WebElement userNameBox;
	
	@FindBy(xpath=".//*[@id='passwordField']")
	public WebElement passwordBox;
	
	@FindBy(xpath=".//*[@id='confirmPasswordField']")
	public WebElement confirmPasswordBox;
	
	@FindBy(xpath=".//*[@id='securityQuestionField']")
	public WebElement dropDownList;
	
	@FindBy(xpath=".//*[@id='securityQuestionField']/option")
	public List <WebElement> dropDownOptions;
	
	@FindBy(xpath=".//*[@id='securityAnswerField']")
	public WebElement answerBox;
	
	@FindBy(xpath=".//*[@id='registerAccount']/div[12]/div/label/strong")
	public WebElement agreeTermsBox;
	
	@FindBy(xpath=".//*[@id='form-submit']")
	public WebElement nextButton;
	
	
	
	
	
	
	public void open() {
		Driver.getInstance().get(Config.getProperty("url"));
	}

}
