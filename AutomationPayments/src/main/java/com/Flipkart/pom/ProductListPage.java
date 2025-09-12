package com.Flipkart.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListPage {

	@FindBy(xpath = "(//div[@class='wvIX4U'])[2]")
		private WebElement product;
	
	@FindBy(xpath = "//button[contains(text(),'✕')]")
	private WebElement popUp;
	
	public ProductListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getProductListPage() {
		return product;	
	}
	
	public void setPopup() {
		try {
			popUp.click();
		} catch (Exception e) {
			System.out.println("Login popup not shown");
		}
	}
	
	
}
