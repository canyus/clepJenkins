package com.collegeboard.step_defs;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.collegeboard.pages.SignUpPage;
import com.collegeboard.utilities.Config;
import com.collegeboard.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class ClepSignUpFeature {

		JavascriptExecutor jse;
		SignUpPage homePage = new SignUpPage();
		
		WebDriver driver = Driver.getInstance();
		
		public String getProperty(String value) {
			return Config.getProperty(value);
		}
		 
		 
	
		
		
		@Given("^The user is on the clep page$")
		public void the_user_is_on_the_clep_page() throws Throwable {
		    
		   homePage.open();
		   //driver.manage().window().maximize();
		}

		@When("^the user verifies the title and the url$")
		public void the_user_verifies_the_title_and_the_url() throws Throwable {
		String expectedUrl="https://clep.collegeboard.org/";
		String expectedTitle="CLEP – Get College Credit With What You Already Know – The College Board";
		String actualUrl=driver.getCurrentUrl();
		String actualTitle=driver.getTitle();
		assertEquals(expectedUrl, actualUrl);
		assertEquals(expectedTitle, actualTitle);
		
		
		
			
		  
		}

		@When("^the user clicks Sign In link$")
		public void the_user_clicks_Sign_In_link() throws Throwable {
			Thread.sleep(2000);
			homePage.signInLink.click();
		  
		}

		@When("^the user clicks Sign Up button$")
		public void the_user_clicks_Sign_Up_button() throws Throwable {
		   Thread.sleep(1500);
		   homePage.SignUpButton.click();
		    
		}

		@When("^the user clicks on a Student link$")
		public void the_user_clicks_on_a_Student_link() throws Throwable {
			Thread.sleep(1500);
			homePage.aStudetnLink.click();
		    
		}

		@When("^the user enters the first name$")
		public void the_user_enters_the_first_name() throws Throwable {
		   homePage.FirstNameBox.sendKeys(Config.getProperty("name"));
		   
		}

		@When("^the user enters the last name$")
		public void the_user_enters_the_last_name() throws Throwable {
		    homePage.LastNameBox.sendKeys(Config.getProperty("lastName"));
		    
		}

		@When("^the user enters the email address$")
		public void the_user_enters_the_email_address() throws Throwable {
		    homePage.emailBox.sendKeys(getProperty("email"));
		    
		}

		@When("^the user confirms the email adress$")
		public void the_user_confirms_the_email_adress() throws Throwable {
			homePage.confirmEmailBox.sendKeys(Config.getProperty("email"));
		   
		}

		@When("^the user enters the zip/postal code$")
		public void the_user_enters_the_zip_postal_code() throws Throwable {
			homePage.zipCodeBox.sendKeys(Config.getProperty("zip"));
		    
		}

		@When("^the user enters the username$")
		public void the_user_enters_the_username() throws Throwable {
			homePage.userNameBox.sendKeys(Config.getProperty("userName"));
		    
		}

		@When("^the user enters the password$")
		public void the_user_enters_the_password() throws Throwable {
			homePage.passwordBox.sendKeys(Config.getProperty("password"));
		    
		}

		@When("^the user confirms the passwords$")
		public void the_user_confirms_the_passwords() throws Throwable {
			homePage.confirmPasswordBox.sendKeys(Config.getProperty("password"));
		    
		}

		@When("^the user chooses a security question from the dropdown list$")
		public void the_user_chooses_a_security_question_from_the_dropdown_list() throws Throwable {
			Select sel = new Select(homePage.dropDownList);
			int size = homePage.dropDownOptions.size();
			for(int i =0; i<size; i++) {
			sel.selectByIndex(i);
			Thread.sleep(100);
			
			}
		    
		}

		@When("^the user enters answer$")
		public void the_user_enters_answer() throws Throwable {
			homePage.answerBox.sendKeys(Config.getProperty("answer"));
		    
		}

		@When("^the user clicks on the Clep Alerts checkbox$")
		public void the_user_clicks_on_the_Clep_Alerts_checkbox() throws Throwable {
		    
		   
		}

		@When("^the user clicks on I agree with the Terms & Conditions\\. checkbox$")
		public void the_user_clicks_on_I_agree_with_the_Terms_Conditions_checkbox() throws Throwable {
			Thread.sleep(1000);
			jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0, 800)");
			Thread.sleep(2000);
			homePage.agreeTermsBox.click();
		   
		}


		@When("^the user clicks next button$")
		public void the_user_clicks_next_button() throws Throwable {
			Thread.sleep(1000);
			homePage.nextButton.click();
			
		   
		}
		
}
