package com.selenium.test;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Driver_Methods {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DR\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
		
		//driver.get("https://www.zomato.com/");
		
		String title = driver.getTitle();
		System.out.println("Title: "+ title);		
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL: " +currentUrl);
		
		//String pageSource = driver.getPageSource();
		//System.out.println(pageSource);
		
		//driver.close();
		
		driver.navigate().to("https://www.zomato.com/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.manage().window().fullscreen();
		
		Dimension size = driver.manage().window().getSize();
		System.out.println("width & heightof the website: " +size);
		
		Dimension m = new Dimension(450,360);
		driver.manage().window().setSize(m);
		
		driver.manage().deleteAllCookies();
		
	}

}
