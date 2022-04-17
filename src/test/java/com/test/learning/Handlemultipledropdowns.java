package com.test.learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlemultipledropdowns {
	
	 static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		//Approach1
		
		Select Countrydrp=new Select(driver.findElement(By.name("Country")));
		Countrydrp.selectByVisibleText("Aruba");
		
		//Approach2
		
		WebElement country=driver.findElement(By.name("Country"));
		selectOptionFromDropDown(country,"Ghana");
		
		driver.close();
	}
	
	public static void selectOptionFromDropDown(WebElement ele,String value) {
		Select drp=new Select(ele);
		
		List<WebElement> alloptions=drp.getOptions();
		for(WebElement option:alloptions)
		{
			if(option.getText().equals(value))
			{
				option.click();
				break;
			}
		}
	}

}
