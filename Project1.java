package com.example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project1 {
	static WebDriver driver;
	public static void main(String[]args) throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.bigbasket.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement login = driver.findElement(By.xpath("(//input[@class='flex-1 w-full leading-md lg:text-sm xl:text-md placeholder-silverSurfer-700'])[1]"));
		login.click();
		
	}

}
