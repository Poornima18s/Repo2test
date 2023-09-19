package com.leafGround;

import org.openqa.selenium.WebDriver;

public class Set {
	WebDriver driver;
	
	public Set(WebDriver driver) {
		this.driver=driver;
	}
	
	public void first(String Url) {
		driver.get(Url);
		driver.manage().window().maximize();
	}
	public void terminate() {
		driver.quit();
	}

}
