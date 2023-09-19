package com.seleniumautomation.JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathfollowing2 {
	static WebDriver driver=new ChromeDriver();
	
	
	public static void enter_textField(String text,String value) {
		
		driver.findElement(By.xpath("//*[text()='" + text +"']//following::input[1]")).sendKeys(value);
		
	}
	
	public static void clear_textBox(String text) {
		
		driver.findElement(By.xpath("//*[text()='" + text +"']//following::input[1]")).clear();
		
	}

	public static void main(String[] args) {
		
		driver.get("https://www.leafground.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='ui-menuitem-submenu'][3]")).click();
		driver.findElement(By.xpath("//*[text()='Text Box']")).click();
		
		enter_textField("Type your name","Poornima Athmaraman");
		clear_textBox("Append Country to this City.");
		enter_textField("Append Country to this City.","Fortmill+USA");
		
	
		

	}

}