package com.seleniumautomation.JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTableTest1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/accessing-nested-table.html");
		String x=driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/table/tbody/tr/td")).getText();
		System.out.println(x);
		driver.quit();

	}

}
