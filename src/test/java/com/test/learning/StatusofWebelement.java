package com.test.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusofWebelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		 driver.manage().window().maximize();
	     driver.get("https://demo.nopcommerce.com/register");
	     
	     //isDisplayed() isEnabled()
	     WebElement searchStore=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
	     
	     System.out.println("Display status:"+searchStore.isDisplayed());
	     System.out.println("Display status:"+searchStore.isEnabled());

	     //isSelected() check whether radio button is selected or not
	     
	     WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
	     WebElement female=driver.findElement(By.xpath("//input[@id='gender-female']"));
	     
	     System.out.println("Male status:"+male.isSelected());
	     System.out.println("Female status:"+female.isSelected());
	     
	     //Select one of the radio button
	     
	     male.click();
	     System.out.println("Male status:"+male.isSelected());
	     System.out.println("Female status:"+female.isSelected());
	     
	     female.click();
	     System.out.println("Male status:"+male.isSelected());
	     System.out.println("Female status:"+female.isSelected());
	    
	     
	     driver.close();
	}

}
