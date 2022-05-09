package com.test.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getTextVsgetattributevalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		WebElement emailinpubox=driver.findElement(By.id("Email"));
		
		//emailinpubox.clear();
		//emailinpubox.sendKeys("admin123@gmail.com");
		
		//capture the text from the inputbox
		
		System.out.println("Attribute value:"+emailinpubox.getAttribute("value"));
		System.out.println("Attribute value:"+emailinpubox.getText());
		
		//Login button
		
		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
		System.out.println(button.getAttribute("type"));
		System.out.println(button.getText());
		
		String title=driver.findElement(By.xpath("//h1[normalize-space()='Admin area demo']")).getText();
		System.out.println(title);
		
		driver.close();
		
		

	}

}
