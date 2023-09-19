package com.seleniumautomation.JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyEventsTest2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		WebElement x=driver.findElement(By.id("twotabsearchtextbox"));
		x.sendKeys("aveeno");
		x.sendKeys(Keys.ENTER);
		//capture the dynamic text
		WebElement z=driver.findElement(By.xpath("//*[@cel_widget_id='MAIN-SEARCH_RESULTS-2']//span[@class='a-price']"));
		System.out.println(z.getText());


}
}
