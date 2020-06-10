package com.cg.seleniumTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintValue {
	public static void main(String args[]) throws InterruptedException {
		String baseURL = "http://34.221.243.81:9000/";
		System.setProperty("webdriver.chrome.driver", "C://Users/yashass/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseURL + "/petclinic-Dev/owners/find.html");
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
//		if(driver.findElement(By.xpath("//a[contains(text(),'Jack Spencer')]")) != null) {
//			System.out.println("owner found");
//			}else {
//			System.out.println("owner not found");
//		}

        }
	}
	
