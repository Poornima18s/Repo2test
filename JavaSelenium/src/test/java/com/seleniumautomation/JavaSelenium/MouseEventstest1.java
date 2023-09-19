package com.seleniumautomation.JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEventstest1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.amazon.com");
		Actions act=new Actions(driver);
		WebElement E=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		//below line prints HELLO
	    act.moveToElement(E).click().keyDown(Keys.SHIFT).sendKeys("Hello").build().perform();
		WebElement A=driver.findElement(By.linkText("Clinic"));
		//act.contextClick(A);
		//act.doubleClick(A);
		
	}

}
