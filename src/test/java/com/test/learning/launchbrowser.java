package com.test.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		 driver.manage().window().maximize();
	        driver.get("https://www.google.com");
	        
	        System.out.println("Title page:"+driver.getTitle());
	        System.out.println("Current URL: "+driver.getCurrentUrl());
	        
	        System.out.println("Page Source:"+driver.getPageSource());
	        driver.close();


	}

}
