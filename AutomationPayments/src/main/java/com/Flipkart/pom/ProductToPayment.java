package com.Flipkart.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 */
public class ProductToPayment {
	
	@FindBy(xpath = "(//button)[5]")
	private WebElement PlaceOrderBtn;
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement LoginTxt;
	
	@FindBy(xpath = "(//div)[22]")
	private WebElement ConBtn;
	
	
	@FindBy(xpath = "//button")
	private WebElement LoginBtn;
	
	@FindBy(xpath = "//button[text()='Deliver Here']")
	private WebElement DeliverHereBtn;
	
	@FindBy(xpath = "//button[text()='CONTINUE']")
	private WebElement ContOrderBtn;
	
	
	public ProductToPayment(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getPlaceOrderBtn() {
		return PlaceOrderBtn;
	}


	public WebElement getLoginTxt() {
		return LoginTxt;
	}


	public WebElement getConBtn() {
		return ConBtn;
	}


	public WebElement getLoginBtn() {
		return LoginBtn;
	}


	public WebElement getDeliverHereBtn() {
		return DeliverHereBtn;
	}


	public WebElement getContOrderBtn() {
		return ContOrderBtn;
	}	
}
