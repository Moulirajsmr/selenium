package com.website.testing;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Test1 {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DR\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement login = driver.findElement(By.xpath("//a[@id= 'nav-link-accountList']"));
		
		WebElement sign_in = driver.findElement(By.xpath("//span[text() = 'Sign in']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(login).build().perform();
		
		a.click(sign_in).build().perform();
		
		WebElement mail = driver.findElement(By.xpath("//input[@type='email']"));
		
		mail.sendKeys("+918056367469");
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		
		pwd.sendKeys("mouliSMR@07");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(50000);
		
		//Mobile phone buy
		
		WebElement mp = driver.findElement(By.xpath("//a[contains(@href,'mobile-phones')]"));
		
		mp.click();
		
		WebElement sp = driver.findElement(By.xpath("//span[text()='Smartphones & Basic Mobiles']"));
		
		sp.click();
		
		driver.findElement(By.xpath("//span[text()='iOS']")).click();
		
		driver.findElement(By.xpath("//span[text()='Apple']")).click();
		
		driver.findElement(By.xpath("//span[contains(@class,'button')]")).click();
		
		driver.findElement(By.xpath("(//a[contains(text(),'Price')])[2]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//img[@class='s-image'])[3]")).click();
				
		String parent_Id = driver.getWindowHandle();
		
		Set<String> all_id = driver.getWindowHandles();
		
		for (String id : all_id) {
			
			System.out.println("id"+ id);
			
			if (id.equals(parent_Id)) {
				continue;				
			}else {
				driver.switchTo().window(id);
				Thread.sleep(5000);				
			}
			
		}
		
		//System.out.println("all"+all_id);
		
		//System.out.println("parent"+ parent_Id);	
		
				
	  driver.findElement(By.xpath("(//input[contains(@id,'cart')])[2]")).click();
	  
	  Thread.sleep(20000);
		
	  driver.findElement(By.xpath("(//input[@type='submit'])[32]")).click();  

	}
}
