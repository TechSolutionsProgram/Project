package com.test.learning;

import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\tools\\geckodriver.exe");
		 FirefoxDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
	     driver.get("https://www.google.com");
	     driver.close();

	}

}
