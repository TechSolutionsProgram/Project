package com.test.learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bootstrapdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://hdfcbank.com");
		driver.findElement(By.xpath("//img[@class='closeSummer']")).click();
		driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
		List<WebElement> productTypes=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		System.out.println("List of product"+productTypes.size());

		for(WebElement ptype:productTypes)
		{
			if(ptype.getText().equals("Accounts"))
			{
				ptype.click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();
		List<WebElement> product=driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
		System.out.println("List of product"+product.size());

		for(WebElement ptype:product)
		{
			if(ptype.getText().equals("Accounts"))
			{
				ptype.click();
				break;
			}
		}
		selectOptionFromDropDown(product,"Accounts");
		
		driver.close();
	}

	public static void selectOptionFromDropDown(List<WebElement> options,String value)
	{
		for(WebElement option:options)
		{
			if(option.getText().equals("Accounts"))
			{
				option.click();
				break;
			}
		}
	}
	
	
}
