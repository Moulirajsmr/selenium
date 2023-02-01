package com.website.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Trivago_Test1 {
	
	public static void main(String[] args) throws InterruptedException, AWTException  {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DR\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		
		driver.get("https://www.trivago.in/");
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("chennai");
						
		Robot e = new Robot();
		
		e.keyPress(KeyEvent.VK_ENTER);
		
		e.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
		
		driver.findElement(By.xpath("(//span[text()='12'])[1]")).click();
		
		driver.findElement(By.xpath("(//span[text()='17'])[1]")).click();
		
		Actions a = new Actions(driver);
		
		WebElement checkin = driver.findElement(By.xpath("(//button[@type='button'])[5]"));
				
		a.moveToElement(checkin).click().build().perform();	
		
		//WebElement datein = driver.findElement(By.xpath("(//span[text()='12'])[1]"));
		
		//a.moveToElement(datein).click().build().perform();
		
		

		
	}

}
