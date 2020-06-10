package com.cg.seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OwnersList {
public static void main(String args[]) throws InterruptedException {
String baseURL = "http://34.221.243.81:9000/";
System.setProperty("webdriver.chrome.driver", "C://Users/yashass/Downloads/chromedriver_win32/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get(baseURL + "/petclinic-Dev/owners/find.html");
//driver.navigate();
driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
//Thread.sleep(1000);
WebElement Owner = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]"));
String outputValue = Owner.getText();
System.out.println(outputValue);
if(outputValue.contains("Monica Spencer")) {
	System.out.println("Owner Found");
}else {
	System.out.println("Owner not found");
}














//if(outputValue.contentEquals("Jack Spencer")) {
//	System.out.println("Test Passed!");
//}else {
//	 System.out.println("Test Failed");
//}
driver.quit();
	}
}