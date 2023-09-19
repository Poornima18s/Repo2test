package com.leafGround;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElements {
	
	WebDriver driver;
	public WebElements(WebDriver driver) {
		this.driver=driver;
	}
	
	By select_tool=By.xpath("//select[@class='ui-selectonemenu']");
	By select_Country=By.id("j_idt87:country_label");
	By select_langauge=By.id("j_idt87:lang_label");
	
	public void tool(int Z) {
		Select UI1=new Select(driver.findElement(select_tool));
		UI1.selectByIndex(Z);
	}
	
	public void country(int Y) {
		Select UI2=new Select(driver.findElement(select_Country));
		UI2.selectByIndex(Y);
		
	}
	public void langauge(int X) {
		Select UI3=new Select(driver.findElement(select_langauge));
		UI3.selectByIndex(X);
		
		
		
		


    }
}
