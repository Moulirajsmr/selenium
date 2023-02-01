package com.website.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amaazon_Test2 {
	
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
		
		
	  
	  //Laptop buy
	  
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("laptop");
	  
	  Robot e = new Robot();
	  
	  e.keyPress(KeyEvent.VK_ENTER);
	  
	  e.keyRelease(KeyEvent.VK_ENTER);
	  
	  driver.findElement(By.xpath("//span[text()='Dell']")).click();
	  
	  driver.findElement(By.xpath("//span[text()='Ultrabook']")).click();
	  
	  driver.findElement(By.xpath("//span[text()='Intel Core i7']")).click();
	  
	  driver.findElement(By.xpath("(//span[contains(@class,'button')])[3]")).click();
	  
	  driver.findElement(By.xpath("(//a[contains(text(),'High')])[3]")).click();
	  
	  driver.findElement(By.xpath("//input[@id='high-price']")).sendKeys("85000");
	  
	  driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	  
	  driver.findElement(By.xpath("(//span[contains(@class,'size-medium')])[3]")).click();
	  
	  String dell_Id = driver.getWindowHandle();
		
		Set<String> lap_id = driver.getWindowHandles();
		
		for (String id : lap_id) {
			
			System.out.println("id"+ id);
			
			if (id.equals(dell_Id)) {
				continue;				
			}else {
				driver.switchTo().window(id);
				Thread.sleep(5000);				
			}					
		}
	Thread.sleep(10000);
	
	driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	
	Thread.sleep(15000);
	
	driver.close();
	
	driver.findElement(By.xpath("//div[@id='nav-cart-text-container']")).click();
	
	driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();

		
	}

}
