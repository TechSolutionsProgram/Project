package com.test.learning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDorpDown_GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.get("https://www.google.com/");
				driver.manage().window().maximize();
				
				driver.findElement(By.name("q")).sendKeys("java tutorials");
				List<WebElement> list=driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//div[1]/span"));
				System.out.println("Size of autosuggestion "+list.size());
				
				for(WebElement listtest:list)
				{
					System.out.println(listtest.getText());
					//if(listtest.getText().equals("selenium"))
					if(listtest.getText().contains("beginners"))
					{
						listtest.click();
						break;
					}
				}
					
		driver.close();
	}

}
