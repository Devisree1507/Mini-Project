package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.beust.jcommander.Parameter;

public class Parameters_Testing {
	static WebDriver driver;

static void BrowserLaunch() {
		
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	System.out.println("Url Launched");
	}

}


