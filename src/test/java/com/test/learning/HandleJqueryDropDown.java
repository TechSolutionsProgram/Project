package com.test.learning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleJqueryDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//implicit wait introduced after selenium 4
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		//selectChoiceValues(driver,"choice 1");
		//selectChoiceValues(driver,"choice1","choice2","choice3");
		selectChoiceValues(driver,"all");
		// in thi case java provide the option ... so it hold good for single and multiple value.Condition is all the values to be of same type
		driver.close();
	}

	public static void selectChoiceValues(WebDriver driver, String... value) {
		// TODO Auto-generated method stub
		List<WebElement> choiceList=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		System.out.println(choiceList.size());
		
		//first check it have multiple values to select
		if(!value[0].equalsIgnoreCase("all"))
		{
			for(WebElement item:choiceList)
			{
				String text=item.getText();
				for(String val:value)
				{
					if(text.equals(val))
					{
						item.click();
						break;
					}
				}
			}
		}
		else
		{
			try
			{
			for(WebElement item:choiceList)
			{
				item.click();
			}}
			catch(Exception e)
			{
				
			}
		}
		
		
	}

}
