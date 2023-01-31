package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.page.HomePage2;

import base.TestBase;

public class HomePageTestCase2 extends TestBase {
	HomePage2 homePage2;
	
	public HomePageTestCase2() {
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initialization();
		homePage2=new HomePage2();
		
	}
	@Test(priority=1)
	public void clickOnFrom() {
		homePage2.clickFrom();
		homePage2.clickFromPlace();
		 
		
	}
	@Test(priority=2)
	public void clickOnTo() throws InterruptedException{
		
		homePage2.clickToPlace();
		
	}
	@Test(priority=3)
	public void clickSearchFlights() {
		homePage2.clickToSearch();
	}
	

}
