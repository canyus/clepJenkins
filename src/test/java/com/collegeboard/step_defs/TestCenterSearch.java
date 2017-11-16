package com.collegeboard.step_defs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.collegeboard.pages.TestCenterSearchPage;
import com.collegeboard.utilities.Config;
import com.collegeboard.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestCenterSearch {
	
	TestCenterSearchPage homePage = new TestCenterSearchPage();
	WebDriver driver = Driver.getInstance();
	JavascriptExecutor jse;
	
	public String getProperty(String keyName) {
		return Config.getProperty(keyName);
	}
	
	@Given("^the user is on the test-center-search page$")
	public void the_user_is_on_the_test_center_search_page() throws Throwable {
	    homePage.open();
	    
	}

	@When("^the user verifies find a test center page$")
	public void the_user_verifies_find_a_test_center_page() throws Throwable {
	   String actualUrl = driver.getCurrentUrl();
	   String expectedUrl = getProperty("urlTestCenterPage");
	  if(actualUrl.equals(expectedUrl)) {
		  System.out.println("The user on the right page");
	  }  else
		  System.out.println("Error! Aimed page failed to open.");
	    
	}

	@When("^the user enters a zipcode$")
	public void the_user_enters_a_zipcode() throws Throwable {
		jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 300)");
		homePage.EnteraZipBox.sendKeys(getProperty("zip"));
	    
	    
	}

	@When("^the user selecets radius$")
	public void the_user_selecets_radius() throws Throwable {
		Select sel = new Select(homePage.SearchRadiusDropDownBox);
		int size = homePage.SearchRadiusDropDownBoxElements.size();
		for(int i=0; i<size; i++) {
			sel.selectByIndex(i);
			Thread.sleep(500);
		}
		for(int i=size-1; i>=0; i--) {
			sel.selectByIndex(i);
			Thread.sleep(500);
		}
	}

	@When("^the user clicks on the search button$")
	public void the_user_clicks_on_the_search_button() throws Throwable {
	    homePage.SearchButton.click();
	    
	}

	@When("^the user clicks on get direction link under nova alexandria$")
	public void the_user_clicks_on_get_direction_link_under_nova_alexandria() throws Throwable {
	//String text =  homePage.GetDirectionsLink.getText();
	//System.out.println(text);
	    
	}

	@When("^the user verifies the destination adress on the new tab$")
	public void the_user_verifies_the_destination_adress_on_the_new_tab() throws Throwable {
	    
	    
	}

	@When("^the user navigates back to the parent window$")
	public void the_user_navigates_back_to_the_parent_window() throws Throwable {
	    
	    
	}

	@When("^the user clicks on Visit Website link under nova alexanria$")
	public void the_user_clicks_on_Visit_Website_link_under_nova_alexanria() throws Throwable {
	    
	    
	}

	@When("^the user verifies the url$")
	public void the_user_verifies_the_url() throws Throwable {
	    
	    
	}

	@Then("^the user closes the browser$")
	public void the_user_closes_the_browser() throws Throwable {
	    
	    
	}

	
	

}
