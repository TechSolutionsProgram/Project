package com.test.learning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertautomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch sampleSiteForSelenium
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 // Alert Message handling
		
        driver.get("http://demo.guru99.com/test/delete_customer.php");			
                            		
     	      	
        driver.findElement(By.name("cusid")).sendKeys("53920");					
        driver.findElement(By.name("submit")).submit();			
        		
        // Switching to Alert        
        Alert alert = driver.switchTo().alert();		
        		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        Thread.sleep(2000);
        		
        // Accepting alert		
        alert.accept();	
        driver.close();
	}

}
