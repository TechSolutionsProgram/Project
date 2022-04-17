package com.test.learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handledropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		WebElement drpcountryEle=driver.findElement(By.id("input-country"));
		
		Select drpCountry=new Select(drpcountryEle);
		//drpCountry.selectByVisibleText("India");
		
		//drpCountry.selectByValue("10");
		
		drpCountry.selectByIndex(7);
		
		
		//selecting option from dropdown without using methods
		//return all option in the webelements
		List<WebElement> alloptions=drpCountry.getOptions();
		for(WebElement options:alloptions)
		{
			System.out.println(options.getText());
			if(options.getText().equals("India"))
			{
				options.click();
			}
		}
		
		
		driver.close();
	}

}
