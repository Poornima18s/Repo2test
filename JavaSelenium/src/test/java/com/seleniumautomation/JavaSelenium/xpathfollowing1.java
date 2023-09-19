package com.seleniumautomation.JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathfollowing1 {
	static WebDriver driver=new ChromeDriver();
	
	public static void enter_textarea(String text,String value) {
		driver.findElement(By.xpath("//*[text()='" + text + "']//following::textarea[1]")).sendKeys(value);
	}

	public static void main(String[] args) {
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		
		enter_textarea("Type about yourself","Poornima");
		

	}

}
