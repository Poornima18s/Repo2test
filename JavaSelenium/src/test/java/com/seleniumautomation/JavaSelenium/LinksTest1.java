package com.seleniumautomation.JavaSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTest1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[text()='How many links in this page?']")).click();
		List<WebElement> Links=driver.findElements(By.tagName("a"));
		System.out.println("number of Links: " +Links.size());
		driver.quit();

	}

}
