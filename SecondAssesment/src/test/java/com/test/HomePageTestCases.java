package com.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.page.HomePage;

import base.TestBase;

public class HomePageTestCases extends TestBase {
	HomePage homePage;
	
	public HomePageTestCases() {
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initialization();
		homePage=new HomePage();
		
	}
	@Test(priority=1)  
public void clickOnSignUpButton() throws InterruptedException {
		homePage.clickSignUpButton();
		//homePage.clickSignUpCloseButton();
		homePage.clicksignupNameEnterText("test@12345678@");
		homePage.clicksignupPasswordEnterText("Password");
		homePage.clicksignupButton();
		//homePage.clickSignUpCloseButton();
		
		
		
	}
	@Test(priority=2)
	public void clickOnLoginButton() throws InterruptedException {
		homePage.clickLoginButton();
		homePage.clickLoginUsername("test@12345678@");
		homePage.clickLoginPassword("Password");
		homePage.clickLoginCreateButton();
		//homePage.clearUsername();
		//homePage.clearPassword();
		//homePage.clickLoginCloseButton();
	}
	@Test(enabled=false)
	public void clickOnContactButton() throws InterruptedException {
		homePage.clickContactButton();
		homePage.contactEmailEnterText("Testmail");
		homePage.contactNameEnterText("Testname");
		homePage.contactMessageEnterText("Testmessage");
		homePage.clickSendMessage();


} 
	
	String pTextData="Welcome test@12345678@";
	@Test(priority=3)
	public void showText() {
		System.out.println("Text is");
		Assert.assertEquals(pTextData, "test@123", "test failed");
	
}
}

