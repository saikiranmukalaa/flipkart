package com.Flipkart.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(name = "q")
	private WebElement searchBox;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setsearchBox() {
		searchBox.sendKeys("puma shoes for men");
		searchBox.submit();
	}
}