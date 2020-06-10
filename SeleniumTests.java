package com.cg.seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTests {
public static void main(String args[]) {
	String baseURL = "http://34.221.243.81:9000/";
	System.setProperty("webdriver.chrome.driver", "C://Users/yashass/Downloads/chromedriver_win32/chromedriver.exe");
//	ChromeOptions chromeOptions = new ChromeOptions();
//	chromeOptions.addArguments("--headless");
//	chromeOptions.addArguments("--no-sandbox");
//	WebDriver driver = new ChromeDriver(chromeOptions);
	WebDriver driver = new ChromeDriver();
	driver.get(baseURL + "/petclinic-Dev/owners/find.html");
	driver.findElement(By.xpath("//a[@class='btn btn-default']")).click();
	driver.findElement(By.xpath("//input[@id='firstName']")).clear();
	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Jack");
	driver.findElement(By.xpath("//input[@id='lastName']")).clear();
	driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Spencer");
	driver.findElement(By.xpath("//input[@id='address']")).clear();
	driver.findElement(By.xpath("//input[@id='address']")).sendKeys("123 frankfurt");
	driver.findElement(By.xpath("//input[@id='city']")).clear();
	driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Germany");
	driver.findElement(By.xpath("//input[@id='telephone']")).clear();
	driver.findElement(By.xpath("//input[@id='telephone']")).sendKeys("9873452678");
	driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
	System.out.println("user addition successful !");
	
	
	driver.quit();
}

}
