package com.test.stepdef;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.test.locators.ObjectsLoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login {

 
	 com.test.locators.ObjectsLoginPage i = new ObjectsLoginPage(Hooks.driver);
	@Given("^Application Url$")
	public void application_Url() throws Exception {
	  
//		WebElement ele =Hooks.driver.findElement(By.id("lst-ib"));//.sendKeys("selenium java");
//		System.out.println(ele);
//		
//		Hooks.wdmethods.sendKeys(ele, "sdfsfds");
//		Thread.sleep(5000);
		System.out.println("Cucumber first Script");
		//System.out.println(System.getProperty("user.dir"));
		
	   // Hooks.wdmethods.sendKeys(Hooks.login.searchBar, "Seleniumtest");
		
		//ObjectsLoginPage.searchBar.sendKeys("Seleniumtest");
	
		Hooks.driver.get("https://google.co.in");
	    i.sendkeys("JAVA BY Reference");
	    //PageObjects.hook.driver.get("https://google.co.in");
	    //PageObjects.objLogin.sendkeys("JAVA BY Reference");
		Thread.sleep(5000);
		
		
		
	}

	@Then("^I Click on Gmail Link$")
	public void i_Click_on_Gmail_Link1() throws Exception {
	    //PageObjects.objLogin.linkGmail.click();
		
	    //System.out.println(PageObjects.objLogin.linkGmail);
		//i.linkGmail.click();
	    //System.out.println(i.linkGmail);
	    
	    Properties pr = new Properties();
	    File file = new File("D:/java/pro");
	    
	    File[] files = file.listFiles();
	    
	    for(File f:files) {
	    	
	    	 pr.load(new FileInputStream(f));
	    	
	    }
	     
	     System.out.println(pr.getProperty("city"));
	    
	     
	     Integer ir = new Integer(100);
	     int ii= ir.intValue();
	     
	     Integer irr = ii;
	     
	     int iii= ir;
	    
	 
	}
	
	
}


