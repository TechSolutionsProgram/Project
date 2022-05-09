package com.test.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigatebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Navigate the browser page 
		/* navigate.back()
		 * navigate.forward()
		 * navigate.refresh()
		 * navigate.to()*/
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com");
		//driver.get("http://www.amazon.com");
		
		driver.navigate().to("http://www.amazon.com");
		
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.navigate().refresh();
		

	}

}
