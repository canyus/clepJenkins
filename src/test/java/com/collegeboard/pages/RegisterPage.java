package com.collegeboard.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.collegeboard.utilities.Config;
import com.collegeboard.utilities.Driver;

public class RegisterPage {
	
	public RegisterPage() {
		PageFactory.initElements(Driver.getInstance(), this);
	
		
	}
	
	@FindBy(xpath=".//*[@id='block-cb-feature-page-feature-page-hero-anchor-menu']/div/div/div/div/div/div/h1")
	public WebElement RegisterForClepExams;
	
	@FindBy(xpath=".//*[@id='purchase-clep-exams-form']/fieldset[1]/div[2]")
	public WebElement FinancialAccounting;
	
	@FindBy(xpath=".//*[@id='purchase-clep-exams-form']/fieldset[1]/div[3]/label/strong")
	public WebElement InformationSystems;
	
	@FindBy(xpath=".//*[@id='purchase-clep-exams-form']/fieldset[1]/div[6]/label/strong")
	public WebElement PrinciplesOfMarketing;
	
	@FindBy(xpath=".//*[@id='block-clep-products-shopping-cart-footer']/div/div/button")
	public WebElement AddToCardButton;
	
	@FindBy(xpath=".//*[@id='add-clep-study-guides']/div[3]/div/a")
	public WebElement ViewCardAndCheckoutButton;
	
	@FindBy(xpath=".//*[@id='regCheckoutBtn']")
	public WebElement RegisterAndCheckOutButton;
	
	
	
	
	
	
	
	
	
	public void open () {
		Driver.getInstance().get(Config.getProperty("urlRegistrationExam"));
	}

}
