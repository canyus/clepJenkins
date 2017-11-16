package com.collegeboard.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.collegeboard.utilities.Config;
import com.collegeboard.utilities.Driver;

public class SearchInstitutionPoliciesPage {
	
	public SearchInstitutionPoliciesPage() {
		PageFactory.initElements(Driver.getInstance(), this);
	}
	
	@FindBy(xpath=".//*[@id='block-cb-feature-page-feature-page-hero-anchor-menu']/div/div/div/div/div/div/h1")
	public WebElement title;
	
	@FindBy(xpath=".//*[@id='lv-form-country']")
	public WebElement SelectaCountryDrowDownList;
	
	@FindBy(xpath=".//*[@id='lv-form-state']")
	public WebElement SelectaStateDropDownList;
	
	@FindBy(xpath=".//*[@id='lv-form-college-search']")
	public WebElement EnteraCollegeNameBox;
	
	@FindBy(xpath=".//*[@id='suggestionListCont']/li")
	public List<WebElement> options;
	
	@FindBy(xpath=".//*[@id='suggestionListCont']/li[2]")
	public WebElement GeorgeMasonLink;
	
	
	
	
	public void open() {
		Driver.getInstance().get(Config.getProperty("urlSearchInstitutionPoliciesPage"));
	}
	
}
