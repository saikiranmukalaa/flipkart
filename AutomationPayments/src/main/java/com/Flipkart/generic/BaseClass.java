package com.Flipkart.generic;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {

public static WebDriver driver;
	
	@BeforeTest
	public void openBrowser() throws InterruptedException, IOException {
		
		 ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-blink-features=AutomationControlled");
			options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			//  Open Flipkart
//			FileLibClass f = new FileLibClass();
//			String url = f.getPropertyData("url");
			driver.get("https://www.flipkart.com");
	}	
	
	
	@AfterTest
	public void closeBrowser() {
	Reporter.log("closeBrowser",true);	
	driver.quit();
	}	

	}
