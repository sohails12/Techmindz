package com.page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wrapper.Wrapper;

import base.TestBase;

public class HomePage2 extends TestBase{
	Wrapper objWrapper=new Wrapper();
	@FindBy(xpath="(//h6[@class='ng-tns-c8-3'])[1]")
	WebElement pFromSelect;
	@FindBy(xpath="//li[@id='BOM']")
	WebElement pFromPlace;
	
	@FindBy(xpath="//li[@id='DXB']")
	WebElement pToPlace;
	@FindBy(xpath="(//button[@class='ng-tns-c8-3 mat-flat-button mat-primary'])[1]")
	WebElement pSearchFlight;
	
	public HomePage2() {
		PageFactory.initElements(driver, this);
		
	}
	public void clickFrom() {
		 WebDriverWait waitList=new WebDriverWait(driver, Duration.ofSeconds(20));
		 waitList.until(ExpectedConditions.elementToBeClickable(By.xpath("(//h6[@class='ng-tns-c8-3'])[1]")));
		pFromSelect.click();
	}
	public void clickFromPlace() {
		pFromPlace.click();
	}
	
	public void clickToPlace() throws InterruptedException{
		WebDriverWait waitList=new WebDriverWait(driver, Duration.ofSeconds(20));
		 waitList.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id='DXB']")));
		
		
		pToPlace.click();
		Thread.sleep(2000);
	}
	public void clickToSearch() {
		 WebDriverWait waitList=new WebDriverWait(driver, Duration.ofSeconds(20));
		 waitList.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='ng-tns-c8-3 mat-flat-button mat-primary'])[1]")));

		
		 pSearchFlight.click();
	}
	
}
