package com.selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {
	
public static void main(String[] args) {
	 
	 System.setProperty("webdriver.chrome.driver",
			 "C:\\Users\\DR\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
	 
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://letcode.in/table");
	 
	List<WebElement> cel = driver.findElements(By.xpath("(//table[contains(@class,'fullwidth')])[2]/tr/td[2]"));
	System.out.println("Calories");
	 
	 for (WebElement all:cel) {
		System.out.println(all.getText());
	}
}
	
	

}
