package com.collegeboard.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Driver {
	
	public static WebDriver driver;
	
	public static WebDriver getInstance() {
		
		if(driver ==null || ((RemoteWebDriver) driver).getSessionId()==null) {
			
			switch(Config.getProperty("browser")) {
			
			case "chrome":
				System.setProperty("webdriver.chrome.driver", Config.getProperty("chrome"));
				driver = new ChromeDriver();
				break;
			default :
				System.setProperty("wendriver.geko.driver", Config.getProperty("firefox"));
				driver = new FirefoxDriver();
				break;
			case "firefox" :
				System.setProperty("wendriver.geko.driver", Config.getProperty("firefox"));
				driver = new FirefoxDriver();
				break;
				
			
			
			
			}
			
		}
		
		return driver;
		
		
	}
	public static void closeDriver() {
		if(driver!=null) 
			driver.quit();
	}

}
