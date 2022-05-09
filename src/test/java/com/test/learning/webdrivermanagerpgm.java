package com.test.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webdrivermanagerpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Using the Webdriver manager.This will allows not downloading the driver
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		 driver.manage().window().maximize();
	        driver.get("https://www.google.com");
	        driver.close();
	        
	        WebDriverManager.edgedriver().setup();
		      WebDriver drivere=new EdgeDriver();
		      
		      drivere.get("https://www.google.com");
		      drivere.close();
	        
	      WebDriverManager.firefoxdriver().setup();
	      WebDriver driverf=new FirefoxDriver();
	      
	      driverf.get("https://www.google.com");
	      driverf.close();
	      
	      
	      
	      

	}

}
