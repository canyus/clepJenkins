package com.collegeboard.step_defs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import com.collegeboard.utilities.Driver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

	  WebDriver driver = Driver.getInstance();

      @Before
      public void setUp(){

              driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            //  driver.manage().window().maximize();
      }

      @After
      public void tearDown(Scenario scenario) throws InterruptedException{

              if (scenario.isFailed()){
                     final byte [] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                      scenario.embed(screenshot, "image/png");
              }
              Thread.sleep(4000);

              Driver.closeDriver();
      }
   


}
