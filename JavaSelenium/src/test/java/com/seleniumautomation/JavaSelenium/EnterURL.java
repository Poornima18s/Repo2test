package com.seleniumautomation.JavaSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnterURL {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		String uname="admin";
		String password="testleaf";
		driver.get("http:" + uname + ":" + password +"@leafground.com:8090/login");
		driver.manage().window().maximize();
	}

}
