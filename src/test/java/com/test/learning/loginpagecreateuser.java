package com.test.learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginpagecreateuser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get(" https://accounts.uat.env.acquire.io/login?endpoint=account&return=&account =lo4h4a");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='usernameOrEmail']")).sendKeys("virijukix@givmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Hereisanew1!");
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		clicksetting(driver);
		driver.close();
	}

	private static void clicksetting(WebDriver driver) {
		// TODO Auto-generated method stub
		
	//	List<WebElement> settingicon=driver.findElements(By.)
		
	}

}
