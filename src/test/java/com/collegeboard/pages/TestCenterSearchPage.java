package com.collegeboard.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.collegeboard.utilities.Config;
import com.collegeboard.utilities.Driver;

public class TestCenterSearchPage {
	
	public TestCenterSearchPage() {
		PageFactory.initElements(Driver.getInstance(), this);
	}
	
	@FindBy(xpath=".//*[@id='lv-form-zip']")
	public WebElement EnteraZipBox;
	
	@FindBy(xpath=".//*[@id='lv-form-radius']/option")
	public List<WebElement> SearchRadiusDropDownBoxElements;
	
	@FindBy(xpath=".//*[@id='lv-form-radius']")
	public WebElement SearchRadiusDropDownBox;
	
	@FindBy(xpath=".//*[@id='clep_test_center_search']/div/form/div[7]/div/span/button")
	public WebElement SearchButton;
	
	@FindBy(xpath=".//*[@id='clep_test_center_search']/div/div/div/div/div/div[1]/ul/li[4]/div/div[1]/ul/li[2]/div[1]/a")
	public WebElement GetDirectionsLink;
	
	@FindBy(xpath=".//*[@id='sb_ifc51']/input")
	public WebElement destinationBox;
	
	@FindBy(xpath=".//*[@id='clep_test_center_search']/div/div/div/div/div/div[1]/ul/li[6]/div/div[2]/ul/li[3]/a/span[1]")
	public WebElement visitWebSiteLink;
	
	
	
	
	public void open() {
		Driver.getInstance().get(Config.getProperty("urlTestCenterPage"));
	}

}
