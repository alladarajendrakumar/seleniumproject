package com.narendra.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleClass {
	
	public SampleClass() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
		
	}

	public void myGoogleSearch(String strText) {
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://google.com");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wd.findElement(By.name("q")).sendKeys(strText);
		wd.findElement(By.name("q")).submit();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String res = wd.findElement(By.id("resultStats")).getText();
		System.out.println(strText + ": " + res);
		
		
		
		wd.close();
		wd.quit();

	}

}
