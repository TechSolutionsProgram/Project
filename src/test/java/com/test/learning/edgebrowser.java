package com.test.learning;


import org.openqa.selenium.edge.EdgeDriver;

public class edgebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//msedgedriver
		System.setProperty("webdriver.edge.driver","src\\test\\resources\\tools\\msedgedriver.exe");
        EdgeDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.close();


	}

}
