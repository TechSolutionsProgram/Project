package com.test.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckDropDownSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		
		//get the dropdown list
		WebElement drpElement=driver.findElement(By.name("category_id"));
		Select drpselect=new Select(drpElement);
		
		List<WebElement> options=drpselect.getOptions();
		
		//create original and temp list using Arraylist
		
		ArrayList originallist=new ArrayList();
		ArrayList templist=new ArrayList();
		
		for(WebElement option:options)
		{
			originallist.add(option.getText());
			templist.add(option.getText());
		}
		
		System.out.println("Original list:"+originallist);
		System.out.println("Temp list:"+templist);
		//now both the list are same..retain original list and sort only templist
		Collections.sort(templist);
		
		//after sorting
		
		System.out.println("Original list:"+originallist);
		System.out.println("Temp list:"+templist);
		
		//Now compare original and temp list
		
		if(originallist.equals(templist))
		{
			System.out.println("Dropdown sorted");
		}
		else
		{
			System.out.println("Dropdown unsorted");
		}
		
		driver.close();
		
		
	}

}
