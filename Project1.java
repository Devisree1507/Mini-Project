package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.util.ThreadDeathWatcher;

public class Project1 {
	static WebDriver driver;
	public static void browser_launch() throws InterruptedException

	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(3000);
	}
	public static void search() throws InterruptedException
	{
		
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();
        Thread.sleep(3000);

		WebElement search = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		search.sendKeys("Monster Truck");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='View all search results']")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("")).click();
		Thread.sleep(3000);
	}
	public static void login() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//button[text()='Login/ Sign Up']")).click();
		Thread.sleep(3000);
		
		WebElement phoneno = driver.findElement(By.id("multiform"));
		phoneno.sendKeys("7550266878");
		Thread.sleep(2000);
		
		WebElement continuebutton = driver.findElement(By.xpath("//button[@type='submit']"));
		continuebutton.click();
		Thread.sleep(30000);
		
		WebElement verify = driver.findElement(By.xpath("//button[text()='Verify & Continue']"));
		verify.click();
		
		Thread.sleep(2000);
	}
	public static void checkout() throws InterruptedException
	{
		
		WebElement cart = driver.findElement(By.xpath("//div[@class='xl:px-4.5 lg:px-1.5 xl:w-15 lg:w-9cursor-pointer rounded-2xs py-1.5  bg-rossoCorsa-50 relative']"));
		cart.click();
		Thread.sleep(10000);
		
		WebElement checkout = driver.findElement(By.xpath("//button[text()='Checkout']"));
		checkout.click();
		Thread.sleep(2000);
	}
	public static void payment() throws InterruptedException
	{
		
		WebElement location = driver.findElement(By.xpath("//button[@color='silverSurfer']"));
		location.click();
		Thread.sleep(5000);
		
		WebElement address1 = driver.findElement(By.name("address_1"));
		address1.sendKeys("no 3");
		Thread.sleep(2000);
		
		WebElement address2 = driver.findElement(By.name("address_2"));
		address2.sendKeys("mugalivakkam");
		
		Thread.sleep(10000);
		
		WebElement addlocation = driver.findElement(By.xpath("//button[@class='bg-rossoCorsa-500 text-white py-2 xl:py-2.5 border-none w-49 xl:w-61.5 font-semibold rounded-2xs leading-sm']"));
		addlocation.click();
		 
		Thread.sleep(10000);
		
		WebElement payment = driver.findElement(By.xpath("//button[@pattern='filled']"));
		payment.click();
	}
	
	public static void main(String[]args) 
	{}
	
}
