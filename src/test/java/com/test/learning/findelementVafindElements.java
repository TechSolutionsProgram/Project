package com.test.learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findelementVafindElements {
	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.nopcommerce.com/");
		
	//findElement  returns the single webElement
	WebElement searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
	searchbox.sendKeys("XYZ");
	
	WebElement ele=driver.findElement(By.xpath("//a[normalize-space()='Sitemap']"));
	System.out.println(ele.getText());
	
	WebElement searchButton=driver.findElement(By.xpath("//a[normalize-space()='Log in']"));
	
	//findElements()-->Returns multiple web elements
	
	List<WebElement> links=driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
	System.out.println("Number of element "+links.size());
	
	for(WebElement elem:links)
		System.out.println(elem.getText());
	
	List<WebElement> logo=driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));
	System.out.println(logo.size());
	
	List<WebElement> elements=driver.findElements(By.xpath("//img[contains(title,'Electronics')]"));
	System.out.println(elements.size());
	
	driver.close();
	

}
}
