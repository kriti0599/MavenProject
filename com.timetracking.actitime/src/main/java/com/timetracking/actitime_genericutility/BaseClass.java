package com.timetracking.actitime_genericutility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	@BeforeSuite
	public void bsConfig() {
		System.out.println("Database connection has been established");
	}
	
	@BeforeClass
	public void bcConfig() {
		System.out.println("The Browser has been launched");
		System.out.println("The URL has been navigated");
	}
	
	@BeforeMethod
	public void bmConfig() {
		System.out.println("The Login was successful");
		
	}
	@AfterMethod
	public void amConfig() {
		System.out.println("The Logout was successful");
		
	}
	@AfterClass
	public void acCofig() {
		System.out.println("The Browser has been closes");
	}
	
	@AfterSuite
	public void asCofig() {
		System.out.println("Database connection has been closed");
	}
}

