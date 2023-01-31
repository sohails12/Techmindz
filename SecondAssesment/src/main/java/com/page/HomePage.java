package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.wrapper.Wrapper;


import base.TestBase;

public class HomePage extends TestBase {
	Wrapper objWrapper=new Wrapper();
	@FindBy(id="signin2")
	WebElement pSignUpButton;
	
	@FindBy(id="login2")
	WebElement pLoginButton;
	
	@FindBy(xpath="//*[text()='Contact']")
	WebElement pContactButton;
	
	
	
	@FindBy(xpath="(//button[@class='btn btn-secondary'])[3]")
	WebElement pLoginCloseButton;
	
	@FindBy(xpath="(//button[@class='btn btn-secondary'])[2]")
	WebElement pSignUpCloseButton;
	@FindBy(xpath="//input[@id='recipient-email']")
	WebElement pContactEmail;
	
	@FindBy(xpath="//input[@id='recipient-name']")
	WebElement pContactName;
	

	@FindBy(id="message-text")
	WebElement pContactMessage;
	@FindBy(xpath="//*[text()='Send message']")
	WebElement pSendMessage;
	
	@FindBy(xpath="//*[text()='Send message']")
	WebElement pAlertMessage;
	@FindBy(id="sign-username")
	WebElement pSignupName;
	@FindBy(id="sign-password")
	WebElement pSignupPassword;
	
	@FindBy(xpath="(//button[@class='btn btn-primary'])[2]")
	WebElement pSignupButtonCreate;
	@FindBy(id="loginusername")
	WebElement pLoginName;
	@FindBy(id="loginpassword")
	WebElement pLoginPassword;
	@FindBy(xpath="(//button[@class='btn btn-primary'])[3]")
	WebElement pLogInCreate;
	
	
	
	
	
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public void clickSignUpButton(){
		pSignUpButton.click();
	}
	public void clickLoginButton() throws InterruptedException {
		Thread.sleep(2000);
		pLoginButton.click();
	}
	public void clickContactButton() {
		pContactButton.click();
	}
	
	public void clickLoginCloseButton() {
		objWrapper.waitForElement(driver, pLoginCloseButton);
		
		pLoginCloseButton.click();
	}
	public void clickSignUpCloseButton() throws InterruptedException {
		objWrapper.waitForElement(driver, pSignUpCloseButton);
		
		pSignUpCloseButton.click();
		Thread.sleep(2000);
}
	public void contactEmailEnterText(String pValue) {
		objWrapper.enterText(pValue, pContactEmail, driver);
	}
	public void contactNameEnterText(String pValue) {
		objWrapper.enterText(pValue, pContactName, driver);
	
}
	public void contactMessageEnterText(String pValue) {
		objWrapper.enterText(pValue, pContactMessage, driver);
}
	public void clickSendMessage() throws InterruptedException {
		pSendMessage.click();
		Thread.sleep(2000);
		objWrapper.alert(driver);
		
		
	}
	public void clicksignupNameEnterText(String pValue) {
		objWrapper.enterText(pValue,pSignupName , driver);
	}
	public void clicksignupPasswordEnterText(String pValue) {
		objWrapper.enterText(pValue,pSignupPassword , driver);
}
	public void clicksignupButton() throws InterruptedException  {
		pSignupButtonCreate.click();
		Thread.sleep(2000);
		
		objWrapper.alert(driver);
		
	}
	public void clickLoginUsername(String pValue) {
		objWrapper.enterText(pValue, pLoginName, driver);
	}
	
	public void clickLoginPassword(String pValue) {
		objWrapper.enterText(pValue,pLoginPassword , driver);
	}
	public void clickLoginCreateButton() throws InterruptedException {
		pLogInCreate.click();
		Thread.sleep(2000);
		
		objWrapper.alert(driver);
		
		
		
	}
	public void clearUsername() {
		objWrapper.clearText(pLoginName, driver);
	}
	public void clearPassword() {
		objWrapper.clearText(pLoginPassword, driver);
	}
	
		
	}

