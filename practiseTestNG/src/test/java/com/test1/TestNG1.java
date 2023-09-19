package com.test1;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import com.page1.*;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {
	WebDriver driver;
	 TextBox box;
	 GetDriver dri;
	
@BeforeTest
	public void setBaseURL() {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	 driver = new ChromeDriver();
	 box=new TextBox(driver);
	 dri=new GetDriver(driver);
	dri.drive("https://www.leafground.com/input.xhtml;jsessionid=node01wwotqysyzlj17n6pjvac7ucp176637.node0");
	
	}

@Test
	public void textBox() {
	box.name("Rithi");
	box.append(" + Edina MN");
	box.clear();
	String good=box.retreive();
	System.out.println(good);
	box.yourself(good);
}

@AfterTest
	public void closeSession() {	
	dri.close();
}

}
