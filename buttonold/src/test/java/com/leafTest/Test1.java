package com.leafTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.leafGround.Set;
import com.leafGround.WebElements;

public class Test1 {
	WebDriver driver;
	Set info;
	WebElements elements;
	@Test
	public void setBase() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver();
		info=new Set(driver);
		elements=new WebElements(driver);
		info.first("https://www.leafground.com/select.xhtml");
		
	}
	@Test
	public void action() {
		elements.tool(1);
		elements.country(3);
		elements.langauge(2);
	
}
	
}
