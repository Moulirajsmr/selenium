package com.website.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parabank_Test1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DR\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		
		username.sendKeys("Mouliraj07");
		
		//WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		
		//pwd.sendKeys("RAJmouli@21");
		
		//WebElement login_btn = driver.findElement(By.xpath("//input[@type='submit']"));
		
		//login_btn.click();
	}

}
