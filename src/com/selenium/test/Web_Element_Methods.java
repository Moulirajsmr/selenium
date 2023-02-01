package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Element_Methods {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DR\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		driver.manage().window().maximize();
		
		WebElement name = driver.findElement(By.name("firstname"));
		name.sendKeys("Mouli");
		
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("Raj");
		
		WebElement mail = driver.findElement(By.name("reg_email__"));
		mail.sendKeys("mouliraj@gmail.com");
		
		WebElement pass = driver.findElement(By.id("password_step_input"));
		pass.sendKeys("805636");
		
		
		
		
		
		
		
	}

}
