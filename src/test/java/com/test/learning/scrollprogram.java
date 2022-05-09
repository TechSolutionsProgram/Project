package com.test.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrollprogram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch flipkart
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 
		 //Scenario 1: To scroll down the web page by pixel.

	        // Launch the application		
	        driver.get("http://demo.guru99.com/test/guru99home/");

	        //To maximize the window. This code may not work with Selenium 3 jars. If script fails you can remove the line below		
	        driver.manage().window().maximize();

	        // This  will scroll down the page by  1000 pixel vertical		
	        js.executeScript("window.scrollBy(0,1000)");
	        
	      //Scenario 2: To scroll down the web page by the visibility of the element.
	        driver = new ChromeDriver();
	        JavascriptExecutor js3 = (JavascriptExecutor) driver;

	        //Launch the application		
	        driver.get("http://demo.guru99.com/test/guru99home/");

	        //Find element by link text and store in variable "Element"        		
	        WebElement Element = driver.findElement(By.linkText("Linux"));

	        //This will scroll the page till the element is found		
	        js3.executeScript("arguments[0].scrollIntoView();", Element);
	        
	        //Scenario 3: To scroll down the web page at the bottom of the page.
	        driver = new ChromeDriver();
	        JavascriptExecutor js2 = (JavascriptExecutor) driver;

	        // Launch the application		
	        driver.get("http://demo.guru99.com/test/guru99home/");

	        //This will scroll the web page till end.		
	        js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	        
	        //Scenario 4: Horizontal scroll on the web page.
	        driver = new ChromeDriver();

	        JavascriptExecutor js1 = (JavascriptExecutor) driver;

	        // Launch the application		
	        driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");

	        WebElement Element1 = driver.findElement(By.linkText("VBScript"));

	        //This will scroll the page Horizontally till the element is found		
	        js1.executeScript("arguments[0].scrollIntoView();", Element1);
	}

}
