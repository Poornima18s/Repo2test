package com.seleniumautomation.JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement type=driver.findElement(By.id("twotabsearchtextbox"));
		type.sendKeys("umbrella");
		type.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[text()='Kids Clear Bubble Umbrella']")).click();

	}

}
