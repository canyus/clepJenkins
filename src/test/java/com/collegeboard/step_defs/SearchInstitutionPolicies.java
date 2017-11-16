package com.collegeboard.step_defs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.collegeboard.pages.SearchInstitutionPoliciesPage;
import com.collegeboard.utilities.Config;
import com.collegeboard.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SearchInstitutionPolicies {

	SearchInstitutionPoliciesPage homePage = new SearchInstitutionPoliciesPage();
	WebDriver driver = Driver.getInstance();
	JavascriptExecutor jse;
	
	public String getProperty(String keyName) {
		return Config.getProperty(keyName);
	}
	
	
	
	
	
	@Given("^the user on the SearchInstitutionPolicies page$")
	public void the_user_on_the_SearchInstitutionPolicies_page() throws Throwable {
	  homePage.open();
	    
	    
	}

	@When("^the user verifies the Search Institution Policies text$")
	public void the_user_verifies_the_Search_Institution_Policies_text() throws Throwable {
	    String actualTitle = homePage.title.getText();
	    String expectedTitle="Search Institution Policies";
	    Assert.assertEquals(expectedTitle, actualTitle);
	    
	    
	}

	@When("^the user verifies that United States has seleceted on Select a Country dropdown list$")
	public void the_user_verifies_that_United_States_has_seleceted_on_Select_a_Country_dropdown_list() throws Throwable {
	    Select sel = new Select(homePage.SelectaCountryDrowDownList);
	    String selectedOption= sel.getFirstSelectedOption().getText();
	    String expectedSelectedOption="United States";
	    if(selectedOption.equals(expectedSelectedOption)) {
	    	System.out.println("SUCCESS! Expected seleceted option was " + expectedSelectedOption + " and selected option is " + selectedOption );
	    	}else
	    		System.out.println("FAIL! Expected seleceted option was " + expectedSelectedOption + " but selected option is " + selectedOption );
	    		
	    
	}

	@When("^the user selects a state$")
	public void the_user_selects_a_state() throws Throwable {
		 Select sel = new Select(homePage.SelectaStateDropDownList);
		 sel.selectByValue("VA");
	    
	}

	@When("^the user enters a keyword on Enter a College or University Name box$")
	public void the_user_enters_a_keyword_on_Enter_a_College_or_University_Name_box() throws Throwable {
	    homePage.EnteraCollegeNameBox.sendKeys(getProperty("collegeKeyword"));
	    
	}

	@When("^the user checks the options displayed$")
	public void the_user_checks_the_options_displayed() throws Throwable {
	    Thread.sleep(1000);
		int size = homePage.options.size();
	   System.out.println("---------------");
		System.out.println("Size of the options under search 'George': " + size);
		System.out.println("Items displayed under the search 'George':");
	    
	    for (int i=0; i<size; i++) {
	    		System.out.println("*"+homePage.options.get(i).getText());
	    }
	    
	}

	@When("^the user selects a university from options displayed$")
	public void the_user_selects_a_university_from_options_displayed() throws Throwable {
		Thread.sleep(2000);
		homePage.GeorgeMasonLink.click();
	    
	}

	@When("^the user clicks on search button$")
	public void the_user_clicks_on_search_button() throws Throwable {
		//Web page doesn't require to click search button after choosing a university(automatically moves to the next step)
	    
	    
	}

	@When("^the user prints the Score and Credit Information by Exam list provided$")
	public void the_user_prints_the_Score_and_Credit_Information_by_Exam_list_provided() throws Throwable {
		jse=(JavascriptExecutor)driver;
		int counter = 0;
		System.out.println("---------------");
		System.out.println("Items displayed on the list:");
		Thread.sleep(1000);
		System.out.println("-Businees:");
		for (int i=3; i<8; i++) {
			System.out.println(driver.findElement(By.xpath(".//*[@id='clep_policy_search']/div/div/div/div/div/div/div/table/tbody/tr["+i+"]/td/a")).getText());
			counter++;
		}
		
		 jse.executeScript("window.scrollBy(0, 570)");
		 Thread.sleep(1000);
		 System.out.println("");
		 System.out.println("-Composition and Literature");
		 for (int i=9; i<15; i++) {
				System.out.println(driver.findElement(By.xpath(".//*[@id='clep_policy_search']/div/div/div/div/div/div/div/table/tbody/tr["+i+"]/td/a")).getText());
				counter++;
		 	}
		 System.out.println("");
		 System.out.println("-Foreign Languages");
		 for (int i=16; i<22; i++) {
				System.out.println(driver.findElement(By.xpath(".//*[@id='clep_policy_search']/div/div/div/div/div/div/div/table/tbody/tr["+i+"]/td/a")).getText());
				counter++;
		 	}
		 jse.executeScript("window.scrollBy(0, 400)");
		 System.out.println("");
		 System.out.println("-History and Social Sciences");
		 for (int i=23; i<35; i++) {
				System.out.println(driver.findElement(By.xpath(".//*[@id='clep_policy_search']/div/div/div/div/div/div/div/table/tbody/tr["+i+"]/td/a")).getText());
				counter++;
		 	}
		 jse.executeScript("window.scrollBy(0, 300)");
		 System.out.println("");
		 System.out.println("-Science and Mathematics");
		 for (int i=36; i<43; i++) {
				System.out.println(driver.findElement(By.xpath(".//*[@id='clep_policy_search']/div/div/div/div/div/div/div/table/tbody/tr["+i+"]/td/a")).getText());
				counter++;
		 }
		 System.out.println("");
		 System.out.println("Total elements on the list: " + counter);
		
	}

	@Then("^the user prints only the exams with the score of fifty$")
	public void the_user_prints_only_the_exams_with_the_score_of_fifty() throws Throwable {
		jse=(JavascriptExecutor)driver;
		int counter=0;
		System.out.println("---------------");
		System.out.println("Exams with score of 50:");
		
		for (int i=36; i<43; i++) {
			String text = driver.findElement(By.xpath(".//*[@id='clep_policy_search']/div/div/div/div/div/div/div/table/tbody/tr["+i+"]/td[2]")).getText();
			if(text.equals("50")) {
				System.out.println(driver.findElement(By.xpath(".//*[@id='clep_policy_search']/div/div/div/div/div/div/div/table/tbody/tr["+i+"]/td/a")).getText());
				counter++;
			}
		}
		jse.executeScript("window.scrollBy(0, -300)");
		for (int i=23; i<35; i++) {
			String text = driver.findElement(By.xpath(".//*[@id='clep_policy_search']/div/div/div/div/div/div/div/table/tbody/tr["+i+"]/td[2]")).getText();
			if(text.equals("50")) {
				System.out.println(driver.findElement(By.xpath(".//*[@id='clep_policy_search']/div/div/div/div/div/div/div/table/tbody/tr["+i+"]/td/a")).getText());
				counter++;
			}
		}
		jse.executeScript("window.scrollBy(0, -400)");
		for (int i=16; i<22; i++) {
			String text = driver.findElement(By.xpath(".//*[@id='clep_policy_search']/div/div/div/div/div/div/div/table/tbody/tr["+i+"]/td[2]")).getText();
			if(text.equals("50")) {
				System.out.println(driver.findElement(By.xpath(".//*[@id='clep_policy_search']/div/div/div/div/div/div/div/table/tbody/tr["+i+"]/td/a")).getText());
				counter++;
			}
		}
		for (int i=9; i<15; i++) {
			String text = driver.findElement(By.xpath(".//*[@id='clep_policy_search']/div/div/div/div/div/div/div/table/tbody/tr["+i+"]/td[2]")).getText();
			if(text.equals("50")) {
				System.out.println(driver.findElement(By.xpath(".//*[@id='clep_policy_search']/div/div/div/div/div/div/div/table/tbody/tr["+i+"]/td/a")).getText());
				counter++;
			}
		}
		jse.executeScript("window.scrollBy(0, -400)");
		for (int i=3; i<8; i++) {
			String text = driver.findElement(By.xpath(".//*[@id='clep_policy_search']/div/div/div/div/div/div/div/table/tbody/tr["+i+"]/td[2]")).getText();
			if(text.equals("50")) {
				System.out.println(driver.findElement(By.xpath(".//*[@id='clep_policy_search']/div/div/div/div/div/div/div/table/tbody/tr["+i+"]/td/a")).getText());
				counter++;
			}
		}
		System.out.println("");
		System.out.println("Total items with score of '50': " + counter);
	}
}
