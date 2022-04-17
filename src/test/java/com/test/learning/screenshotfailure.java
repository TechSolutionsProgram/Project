package com.test.learning;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshotfailure {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//WebDriver driver;
		
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver = new ChromeDriver();
			
			 //navigate to url
	        driver.get("https://demoqa.com");
	        
	       //Take the screenshot
	        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        
	        //Copy the file to a location and use try catch block to handle exception
	        try {
	            FileUtils.copyFile(screenshot, new File("C:\\personal\\QATraining\\ProgramPractise\\seleniumdemoproject\\homePageScreenshot.png"));
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
	        
	        //closing the webdriver
	        driver.close();
			
	}
		
	}

