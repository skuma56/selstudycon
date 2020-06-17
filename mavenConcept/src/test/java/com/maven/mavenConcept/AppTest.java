package com.maven.mavenConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Test;


public class AppTest {
	
	public static void main (String[] args) {
		
		System.out.println("This is Maven RUN Project");
		
	}
	
	@org.junit.Test
	public void testLogin() {
		System.setProperty("webdriver.gecko.driver","C:\\SelfStud\\SelSelfStudy\\seltest\\DriverFolders\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.quit();
		
		
	}
    

}
