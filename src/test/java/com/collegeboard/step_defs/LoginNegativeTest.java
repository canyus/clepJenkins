package com.collegeboard.step_defs;



import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.collegeboard.pages.LoginPage;
import com.collegeboard.utilities.Config;
import com.collegeboard.utilities.Driver;

import cucumber.api.java.en.Given;

public class LoginNegativeTest {
	
	LoginPage homePage = new LoginPage();
	WebDriver driver=Driver.getInstance();
	boolean display = false;
	
	
	public String getProperty(String keyName) {
     	return Config.getProperty(keyName);
	}
	
	@Given("^the user enters a \"([^\"]*)\" and a \"([^\"]*)\"$")
	public void the_user_enters_a_and_a(String username, String password) throws Throwable {
		driver.get("https://account.collegeboard.org/login/login?destinationpage=https://cbaccount.collegeboard.org/iamweb/secure/smartCollect");
		homePage.login(username, password);
		homePage.SignInButton.click();
		//homePage.LoginErrorLink.isDisplayed();
		
		String fileName = getRandomString(10) + ".png";
		String directory = "//Users/sefacanagirbasli/Desktop/ab";
		
		display = homePage.LoginErrorLink.isDisplayed();
		if(display) {
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(directory + fileName));
		}
			
		
	
	
		
		//assertequal ekle
		}
	
	public static String getRandomString(int length) {
		StringBuilder sb = new StringBuilder();
		String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		for(int i =0; i<length; i++) {
			int index = (int)(Math.random() * characters.length());
			sb.append(characters.charAt(index));
		}
		
		return sb.toString();
	}
	

	
}
