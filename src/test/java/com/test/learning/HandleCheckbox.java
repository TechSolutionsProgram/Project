package com.test.learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		//select the specific checkbox
		//driver.findElement(By.xpath("//input[@id='monday']")).click();
		/*driver.findElement(By.xpath("//input[@id='monday']")).click();
		driver.findElement(By.xpath("//input[@id='tuesday']")).click();
		driver.findElement(By.xpath("//input[@id='wednesday']")).click();
		driver.findElement(By.xpath("//input[@id='thursday']")).click();*/
		
		//select all the checkboxes
		List<WebElement> dayCheckbox=driver.findElements(By.xpath("//input[(@type='checkbox') and contains(@id,'day')]"));

		System.out.println("Total no of checkbox:"+dayCheckbox.size());
		/*for(int i=0;i<dayCheckbox.size();i++)
		{
			dayCheckbox.get(i).click();
		}*/
		//using for each loop
		
		/*for(WebElement day:dayCheckbox)
		{
			System.out.println(day.getText());
			day.click();
		}*/
		
		//select multiple checkboxes by choice
		//select monday and sunday
		/*for(WebElement day:dayCheckbox)
		{
			
			String checkname=day.getAttribute("id");
			System.out.println(checkname);
			if(checkname.equals("monday")|| checkname.equals("sunday"))
			{
				day.click();
			}
		}*/
		
		//Select last 2 checkboxes
		//total number of checkboxes=no of checkboxes want to select 7-2= 5 so it start from 5th elemenet
		int totalcheckboxes=dayCheckbox.size();
		/*for(int i=totalcheckboxes-2;i<totalcheckboxes;i++)
		{
			dayCheckbox.get(i).click();
		}*/
		//how to select first 2 checkboxes
		for(int i=0;i< totalcheckboxes;i++)
		{
			if(i<2) {
				dayCheckbox.get(i).click();
			}
			Thread.sleep(2000);
		}
		
		
		driver.close();
	}
	

}
