package com.page1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBox {
	 
	WebDriver driver;
	
 public TextBox(WebDriver driver) {
		this.driver=driver;
	}
	By type_Name=By.id("j_idt88:name");
	By append_Country=By.id("j_idt88:j_idt91");
	By clear_Text=By.id("j_idt88:j_idt95");
	By retrieve_Text=By.id("j_idt88:j_idt97");
	By type_Yourself=By.id("j_idt88:j_idt101");
	
	public void name(String typeName) {
		
		try {
			driver.findElement(type_Name).sendKeys(typeName);
		}
		catch(Exception e){
			System.out.println(e);
			
		}
	}
	public void append(String countryName) {
		driver.findElement(append_Country).sendKeys(countryName);
	}
	public void clear() {
		driver.findElement(clear_Text).clear();
	}
	public String retreive() {
		String text=driver.findElement(retrieve_Text).getAttribute("value");
		return text;
	}
	public void yourself(String typeYourself) {
		driver.findElement(type_Yourself).sendKeys(typeYourself);
	}

}
