package com.collegeboard.step_defs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.collegeboard.pages.RegisterPage;
import com.collegeboard.utilities.Config;
import com.collegeboard.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class RegistorForClepExam {
	
	RegisterPage homePage = new RegisterPage();
	WebDriver driver = Driver.getInstance();
	JavascriptExecutor jse;
	
	public String getProperty(String keyword) {
		return Config.getProperty(keyword);
	}
	
	
	
	
	@Given("^the user on the registration page$")
	public void the_user_on_the_registration_page() throws Throwable {
	   homePage.open();
	}

	@When("^the user verifies Register for CLEP Exams text is displayed$")
	public void the_user_verifies_Register_for_CLEP_Exams_text_is_displayed() throws Throwable {
		String expectedText = "Register for CLEP Exams";
		String actualText = homePage.RegisterForClepExams.getText();
		Assert.assertEquals(expectedText, actualText);
	
	}

	@When("^the user selecets three courses under Businees$")
	public void the_user_selecets_three_courses_under_Businees() throws Throwable {

		homePage.FinancialAccounting.click();
	    homePage.InformationSystems.click();
	    jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 250)");
		Thread.sleep(1500);
		homePage.PrinciplesOfMarketing.click();
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0, 550)");
	}

	@When("^the user selects three courses under Composition & Literature$")
	public void the_user_selects_three_courses_under_Composition_Literature() throws Throwable {
		for(int i=2; i<8; i++) {
		driver.findElement(By.xpath(".//*[@id='purchase-clep-exams-form']/fieldset[2]/div["+i+"]")).click();
		}
		Thread.sleep(1000);
		jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 400)");
		Thread.sleep(1000);
		
	}

	@When("^the user selects three courses under Foreign Languages$")
	public void the_user_selects_three_courses_under_Foreign_Languages() throws Throwable {
	   for (int i =2; i<5; i++) {
		   driver.findElement(By.xpath(".//*[@id='purchase-clep-exams-form']/fieldset[3]/div["+i+"]")).click();
	   }
		Thread.sleep(1000);
		jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 520)");
		Thread.sleep(1500);
	}

	@When("^the user selects three courses under History & Social Science$")
	public void the_user_selects_three_courses_under_History_Social_Science() throws Throwable {
		 for (int i =2; i<8; i++) {
			   driver.findElement(By.xpath(".//*[@id='purchase-clep-exams-form']/fieldset[4]/div["+i+"]")).click();
		   }Thread.sleep(1000);
		   jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0, 460)");
			Thread.sleep(1000);
			 for (int i =8; i<14; i++) {
				   driver.findElement(By.xpath(".//*[@id='purchase-clep-exams-form']/fieldset[4]/div["+i+"]")).click();
			 }
			 Thread.sleep(1000);
		   
		   
	}

	@When("^the user selects three courses under Science & Mathematics$")
	public void the_user_selects_three_courses_under_Science_Mathematics() throws Throwable {
		 jse = (JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy(0, 670)");
		 Thread.sleep(1000);
		 for (int i =2; i<9; i++) {
			   driver.findElement(By.xpath(".//*[@id='purchase-clep-exams-form']/fieldset[5]/div["+i+"]")).click();
		 }Thread.sleep(1000);
	}

	@When("^the user clicks on Add to Card button$")
	public void the_user_clicks_on_Add_to_Card_button() throws Throwable {
	   homePage.AddToCardButton.click();
	   Thread.sleep(1000);
	}

	@When("^the user clicks on Add Materials and Checkout button$")
	public void the_user_clicks_on_Add_Materials_and_Checkout_button() throws Throwable {
	    homePage.ViewCardAndCheckoutButton.click();
	    Thread.sleep(1000);
	}

	@When("^the user clicks on Register and Checkout$")
	public void the_user_clicks_on_Register_and_Checkout() throws Throwable {
		 jse = (JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy(0, 1870)");
		 Thread.sleep(1000);
		 homePage.RegisterAndCheckOutButton.click();
	}

}
