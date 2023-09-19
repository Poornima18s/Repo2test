package com.test1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.page1.*;

public class RunTest {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		
		GetDriver get=new GetDriver(driver);
		get.drive("https://www.leafground.com/input.xhtml;jsessionid=node0133genlidx2l31q1fiic7wbptk174508.node0");
		TextBox text1=new TextBox(driver);
		text1.name("Poornima Athmaraman");
		text1.append(" + India");
		text1.clear();
	    String x=text1.retreive();
	    System.out.println(x);
		text1.yourself(x);
		


	}

}
