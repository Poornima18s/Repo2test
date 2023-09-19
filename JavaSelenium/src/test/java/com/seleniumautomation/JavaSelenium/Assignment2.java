package com.seleniumautomation.JavaSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.findElements(By.xpath("//span[@class='ui-button-text ui-c']")).get(2).click();
		driver.findElement(By.id("j_idt88:j_idt98")).click();
		//explicit wait
	    WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(60));
	    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Show'].get(3)")));
		 //Thread.sleep(2000);
         driver.findElements(By.xpath("//span[text()='Show']")).get(3).click();	
        Thread.sleep(2000);
       driver.findElement(By.xpath("//div[@id='j_idt88:j_idt101']//a[@aria-label='Close']")).click();
       driver.findElement(By.xpath("//*[text()='Delete']")).click();
       driver.findElement(By.xpath("//*[text()='Yes']")).click();
       driver.findElements(By.xpath(("//span[@class='ui-button-text ui-c']"))).get(7).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-minimize ui-corner-all']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-maximize ui-corner-all']")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//div[@id='j_idt88:j_idt112']//a[@aria-label='Close']")).click();

        

	}

}
