package com.seleniumautomation.JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest1 {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@class='ui-menuitem-submenu'][3]")).click();
		driver.findElement(By.xpath("//*[text()='Dropdown']//preceding::i[1]")).click();
		Select drpdown=new Select(driver.findElement(By.xpath("//select[@class='ui-selectonemenu']")));
		drpdown.selectByVisibleText("Cypress");
		//drpdown.selectByValue("Puppeteer");//not working
		//drpdown.selectByIndex(2);
		
		
		driver.findElement(By.xpath("//label[text()='Select Country']")).click();
		driver.findElement(By.xpath("//li[@data-label='Germany']")).click();
		
		

				
		
	}
	}

