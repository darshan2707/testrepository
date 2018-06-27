package com.test.stepdef;

import java.awt.Frame;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFrame {


	@Test
	public void frameex() {
		
		String path=System.getProperty("user.dir")+"/src/main/resources/drivers/chromedriver.exe";
		System.out.println(System.getProperty("user.dir")+"/src/main/resources/drivers/chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver",path);
			WebDriver wd = new ChromeDriver();
		
			
			
		String parentWindow = wd.getWindowHandle();
		
		try {
		wd.switchTo().window(parentWindow);
		}catch(NoSuchWindowException e) {
			e.printStackTrace();
		}
		
		
		Set<String> windows = wd.getWindowHandles();
		
		Iterator<String> itr = windows.iterator();
		
		while(itr.hasNext()) {
			String a = itr.next();
			
		}
		
		
		
		try {
		wd.switchTo().frame(1);
		}catch(NoSuchFrameException e) {
			e.printStackTrace();
		}
		wd.switchTo().frame("string");
		wd.switchTo().frame("WebElement");
		
		
		wd.navigate().back();
		wd.navigate().forward();
		wd.navigate().refresh();
		
		Navigation nav = wd.navigate(); //return type navigation
		nav.back();
		wd.get("url"); // return type void 
		
		
		wd.findElement(By.tagName("")).isDisplayed();
	
		File srcF= ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcF,new File("D:/errorShot/1.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Object ob = new Object();
		ob.getClass();
		ob.toString();
		ob.equals(ob);
		ob.hashCode();
		ob.notify();
		ob.notifyAll();
		
		try {
			ob.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String[] arr = {"a","b","c","d","e"};
		int siz=arr.length;
	
		
		String var = "abcde";
		var.length();
		
		
		ArrayList<String> al = new ArrayList<>();
		al.size();
		
		
		
		
		
	}
	
	
}
