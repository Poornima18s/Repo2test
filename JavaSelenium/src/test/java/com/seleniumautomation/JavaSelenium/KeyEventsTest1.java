package com.seleniumautomation.JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyEventsTest1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		WebElement x=driver.findElement(By.id("twotabsearchtextbox"));
		x.sendKeys("Toys");
		x.sendKeys(Keys.ENTER);
		System.out.println(driver.findElement(By.xpath("//*[@data-asin='B09Z2JWYPF']//span[@class='a-price']")).getText());

	}

}
