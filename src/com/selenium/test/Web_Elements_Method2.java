package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Elements_Method2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DR\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("mouliraj@gmail.com");
		
		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys("805636");
		
		boolean maild = mail.isDisplayed();
		System.out.println("Mail is displayed :" +maild);
		
		boolean pawd = pwd.isEnabled();
		System.out.println("password is enabled :" +pawd);
		
		String g_mail = mail.getTagName();
		System.out.println("Mail tag-name :" +g_mail);
		
		Point location = pwd.getLocation();
		System.out.println("Password location :" +location);
		
		Dimension size = mail.getSize();
		System.out.println("size of mail box :" +size);
		
		String cssValue = pwd.getCssValue(g_mail);
		System.out.println("cssValue is :" +cssValue );
		
		Rectangle rect = mail.getRect();
		System.out.println("Rectangle : " +rect);
	}

}
