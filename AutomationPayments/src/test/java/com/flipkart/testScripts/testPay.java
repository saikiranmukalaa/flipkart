package com.flipkart.testScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Flipkart.generic.BaseClass;
import com.Flipkart.pom.HomePage;
import com.Flipkart.pom.ProductListPage;


public class testPay  extends BaseClass{

	@Test
public void payment() throws InterruptedException {
		
		HomePage h = new HomePage(driver);
		h.setsearchBox();
		
		ProductListPage p = new ProductListPage(driver);
		p.getProductListPage().click();
		Thread.sleep(1000);
		
		// Switch to new tab (product page)
				for (String handle : driver.getWindowHandles()) {
					driver.switchTo().window(handle);
				}
				
				p.setPopup();
				
			        //  Click "Add to Cart"
				try {
					WebElement addToCart = driver.findElement(By.xpath("(//button)[2]"));
					addToCart.click();
					System.out.println("Product added to cart!");
				} catch (Exception e) {
					System.out.println("Add to Cart button not found (maybe product is out of stock).");
				}
				Thread.sleep(1000);

				// Click "Buy Now"
				try {
					WebElement buyNowBtn = driver.findElement(By.xpath("//button[text()='Buy Now']"));
					buyNowBtn.click();
					System.out.println(" Clicked on Buy Now!");
				} catch (Exception e) {
					System.out.println("Buy Now button not found.");
				}
				Thread.sleep(1000);
				
				p.setPopup();
				
				driver.findElement(By.xpath("(//button)[5]")).click();// place order button
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9019371699");//login
				driver.findElement(By.xpath("(//div)[22]")).click();// clicking on contiue button

			

				Thread.sleep(40000);// waiting for OTP
				driver.findElement(By.xpath("//button")).click(); // loginbutton clicking
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[text()='Deliver Here']")).click();// for clicking on deliver button 
				Thread.sleep(1000);		
				driver.findElement(By.xpath("//button[text()='CONTINUE']")).click();// order summary contiune buttton
				Thread.sleep(1000);
	
				
				try {
					WebElement pop = driver.findElement(By.xpath("//button[text()='Accept & Continue']"));
					pop.click();
				} catch (Exception e) {
					System.out.println("rest Assured popup not shown");
				}
				
				Actions a = new Actions(driver);
				WebElement upi = driver.findElement(By.xpath("//div/span[text()='UPI']"));
				
				a.doubleClick(upi).perform();
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@placeholder='Enter your UPI ID']")).sendKeys("skiran2951@ybl"); // entering UPI ID
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[text()='Verify']")).click(); //clicking on verfiy
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//button[contains(text(), 'Pay')]")).click();
	}
		
}
