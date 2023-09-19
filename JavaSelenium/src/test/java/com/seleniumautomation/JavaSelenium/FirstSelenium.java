package com.seleniumautomation.JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.amazon.com");
//		driver.findElement(By.linkText("Best Sellers")).click();
//		driver.findElement(By.linkText("Books")).click();
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("camera");
//		driver.findElement(By.id("nav-search-submit-button")).click();
		 driver.get("https://www.leafground.com");
		 driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
         driver.findElement(By.xpath("//span[@normalize-space()='Button']")).click();
	}

}