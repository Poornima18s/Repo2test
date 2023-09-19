package com.seleniumautomation.JavaSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[text()='Find the URL without clicking me.']")).click();
		
		//explicit wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='New']")));
		
	    driver.findElement(By.xpath("//*[text()='New']")).click();
		
		//explicit wait
		WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("form:name")));
		
		driver.findElement(By.id("form:name")).sendKeys("Bracelet4");
		driver.findElement(By.id("form:description")).sendKeys("for Girls only");
		driver.findElement(By.xpath("//label[text()='Accessories']")).click();
		//finding OS name
		String OSNAME=System.getProperty("os.name");
		System.out.println(OSNAME);
		
		driver.findElement(By.id("form:price_input")).sendKeys(Keys.COMMAND,"a");
		driver.findElement(By.id("form:price_input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("form:price_input")).sendKeys("9.99");
		driver.findElement(By.xpath("//*[@class='ui-button-text']")).click();
		driver.findElement(By.xpath("//*[text()='Save']")).click();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
//		WebDriverWait wait3=new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Product Added']")));
				
		WebElement product=driver.findElement(By.xpath("//*[text()='Product Added']"));
		System.out.println(product.isDisplayed());
		if(product.isDisplayed()) {
			System.out.println("Pass");
		}
		else {
			System.err.println("Fail");
		}
		driver.findElement(By.id("form:dt-products:globalFilter")).sendKeys("Bracelet4");
		
		

	}

}
