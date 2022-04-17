package com.test.learning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDorpDown_BingSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
		List<WebElement> list=driver.findElements(By.xpath("//li[@class='sa_sg']//span"));
		System.out.println("Size of autosuggestion "+list.size());
		
		for(WebElement listtest:list)
		{
			System.out.println(listtest.getText());
			//if(listtest.getText().equals("selenium"))
			if(listtest.getText().contains("download"))
			{
				listtest.click();
				break;
			}
		}
			
		
		
		driver.close();

	}

}
