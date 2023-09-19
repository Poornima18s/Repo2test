package com.seleniumautomation.JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyTest1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com");
		driver.manage().window().maximize();
		WebElement s=driver.findElements(By.xpath("//*[text()='Features']")).get(0);
		System.out.println(s.isSelected());
		System.out.println(s.isEnabled());

	}

}
