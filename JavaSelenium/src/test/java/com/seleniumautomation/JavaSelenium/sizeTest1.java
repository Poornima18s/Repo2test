package com.seleniumautomation.JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sizeTest1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//*[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[2]")).click();
		int x=driver.findElements(By.xpath("(//*[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])")).size();
		System.out.println(x);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("poornima18s@gmail.com");
		driver.findElement(By.id("message")).sendKeys("Weekly Assignments Remainder");
		driver.findElement(By.xpath("//span[normalize-space()='Send']")).click();
		driver.quit();
				
		
	}

}
