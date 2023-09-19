package com.seleniumautomation.JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.leafground.com/file.xhtml;jsessionid=node0kmxvh2jz88xt263py299qnst161184.node0");
		driver.findElement(By.id("j_idt88:j_idt89_input")).sendKeys("/Users/Sarva/Documents/Poornima");
		//Thread.sleep(5000);
		
		
	

	}

}
