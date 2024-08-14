package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Project1Test {
	static WebDriver driver;
  @Test(priority=2)
  static void browser_launchTest() throws InterruptedException {
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(3000);
  }

  @Test(priority=5)
   static  void checkoutTest() throws InterruptedException {
	    WebElement cart = driver.findElement(By.xpath("//div[@class='xl:px-4.5 lg:px-1.5 xl:w-15 lg:w-9cursor-pointer rounded-2xs py-1.5  bg-rossoCorsa-50 relative']"));
		cart.click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Checkout']")).click();
		Thread.sleep(2000);
  }

  @Test(priority=4)
  static void loginTest() throws InterruptedException {
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

  @Test(priority=1)
  public static void main(String[]args) throws Throwable {
	  browser_launchTest();
	  checkoutTest();
	  loginTest();
	  paymentTest();
	  searchTest();
  }

  @Test(priority=6)
   static void paymentTest() throws InterruptedException {
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

  @Test(priority=3)
  static void searchTest() throws InterruptedException {
	    driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();
        Thread.sleep(3000);

		WebElement search = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		search.sendKeys("Monster Truck");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='View all search results']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//button[@color='rossoCorsa'])[3]")).click();
		Thread.sleep(3000);
    
  }
}
