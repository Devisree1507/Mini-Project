package com.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MiniProject {
	static WebDriver driver;
	@Test(priority=-3)
static void BrowserLaunch() {
		
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	System.out.println("Url Launched");
	}
	@DataProvider(name="value")
	private String[][] getValue(){
		String[][] val=new String[2][2];
		val[0][0]="Devi";
		val[0][1]="1324";
		val[1][0]="sree";
		val[1][1]="89880";
		return val;
		}
	@Test(priority = 2,dataProvider="value")
	static public void Login(String email,String pass) {
	 driver.findElement(By.name("email")).sendKeys(email);
	 driver.findElement(By.name("pass")).sendKeys(pass);
	 driver.findElement(By.name("login")).click();
	}
	@Test(priority=3)
	private void quit() {
		driver.quit();
	}

}

