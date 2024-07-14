package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	System.out.println("Url Launched");
	Thread.sleep(3000);
	WebElement search = driver.findElement(By.name("username"));
	search.sendKeys("Admin");
	Thread.sleep(3000);
	WebElement pass = driver.findElement(By.name("password"));
	pass.sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
}
}