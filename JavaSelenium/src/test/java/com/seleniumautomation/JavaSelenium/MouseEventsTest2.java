package com.seleniumautomation.JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEventsTest2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		WebElement from=driver.findElement(By.xpath("//div[@id='form:drag_content']"));
		WebElement to=driver.findElement(By.xpath("//span[text()='Droppable Target']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(from, to).build().perform();
		
	

	}

}
