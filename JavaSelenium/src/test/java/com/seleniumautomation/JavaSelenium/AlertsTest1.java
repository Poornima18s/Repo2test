package com.seleniumautomation.JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsTest1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		WebElement x=driver.findElements(By.xpath("//*[@class='ui-button-text ui-c']")).get(1);
		x.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
	}

}
