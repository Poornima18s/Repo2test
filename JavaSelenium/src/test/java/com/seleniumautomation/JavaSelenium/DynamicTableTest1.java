package com.seleniumautomation.JavaSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableTest1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa?");
		driver.manage().window().maximize();
		List<WebElement> col=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thread/tr/th[1]"));
		System.out.println("no.of.columns : "+col.size());
		List<WebElement> row=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thread/tr/td"));
		System.out.println("no.of.rows : "+row.size());
		//not working
		
		
		
	}

}
