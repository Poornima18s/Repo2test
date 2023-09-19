package com.page1;

import org.openqa.selenium.WebDriver;

public class GetDriver {
	WebDriver driver;
	
	public GetDriver(WebDriver driver) {
		this.driver=driver;
	}
	
	public void drive(String URL) {
		driver.get(URL);
		driver.manage().window().maximize();
	}
	
	public void close() {
		driver.quit();
	}
}
	