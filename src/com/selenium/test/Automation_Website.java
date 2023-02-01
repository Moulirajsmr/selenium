package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automation_Website {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DR\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://automationpractice.com/index.php");

		driver.findElement(By.xpath("//a[@class='login']")).click();

		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("mouli12@gmail.com");

		WebElement pwd = driver.findElement(By.xpath("//input[@id='passwd']"));
		pwd.sendKeys("mou123");

		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();

		WebElement dre = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		WebElement cas = driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[1]"));
		Actions mouse = new Actions(driver);
		mouse.moveToElement(dre).build().perform();
		//mouse.click(cas).build().perform();
		
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		
		js.executeScript("arguments[0].click()", cas);
		
		//driver.findElement(By.xpath("(//a[@title='Dresses'])[2]")).click();		

		

		driver.findElement(By.xpath("//img[@title='Printed Dress']")).click();

		//driver.findElement(By.xpath("(//img[@itemprop='image'])[1]")).click();

	}

}
