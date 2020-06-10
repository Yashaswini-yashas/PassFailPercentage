package com.cg.seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Final {
public static void main(String args[]) {
String baseURL = "http://34.221.243.81:9000/";
System.setProperty("webdriver.chrome.driver", "C://Users/yashass/Downloads/chromedriver_win32/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get(baseURL + "/petclinic-Dev/owners/find.html");
driver.findElement(By.xpath("//a[@class='btn btn-default']")).click();
driver.findElement(By.xpath("//input[@id='firstName']")).clear();
driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Thomas");
driver.findElement(By.xpath("//input[@id='lastName']")).clear();
driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Jefferson");
driver.findElement(By.xpath("//input[@id='address']")).clear();
driver.findElement(By.xpath("//input[@id='address']")).sendKeys("456 Clark Street");
driver.findElement(By.xpath("//input[@id='city']")).clear();
driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Chicago");
driver.findElement(By.xpath("//input[@id='telephone']")).clear();
driver.findElement(By.xpath("//input[@id='telephone']")).sendKeys("3452987654");
driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
System.out.println("user addition successful !");

driver.navigate().to(baseURL + "/petclinic-Dev/owners/find.html");
driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
WebElement Owner = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]"));
String outputValue = Owner.getText();
if(outputValue.contains("Thomas Jefferson")) {
	System.out.println("Owner Found");
}else {
	System.out.println("Owner not found");
}
driver.quit();
}
}
