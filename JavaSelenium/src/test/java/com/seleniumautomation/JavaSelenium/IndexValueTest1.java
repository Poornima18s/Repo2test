package com.seleniumautomation.JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndexValueTest1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com");
		//driver.findElements(By.xpath("//*[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).get(2).click();
		int x=driver.findElements(By.xpath("//*[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).size();
		System.out.println(x);
		
		for(int i=0; i<=x; i++) {
			System.out.println(i);
			driver.findElements(By.xpath("//*[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).get(0).click();
			
			
		}

	}

}
