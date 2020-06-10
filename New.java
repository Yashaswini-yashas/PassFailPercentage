package com.cg.seleniumTests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {
	public static void main(String args[]) throws IOException {
		String baseURL = "http://34.221.243.81:9000/";
		System.setProperty("webdriver.chrome.driver", "C://Users/yashass/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String FirstName;
		String LastName;
		String Address;
		String City;
		String Telephone;
		 System.out.println(" Enter your First Name :: ");
		 FirstName = br.readLine();
		 System.out.println(" Enter your Last Name :: ");
		 LastName = br.readLine();
		 System.out.println(" Enter your Address ::");
		 Address = br.readLine();
		 System.out.println(" Enter your City ::");
		 City =  br.readLine();
		 System.out.println(" Enter your Telephone number ::");
		 Telephone = br.readLine();
		 driver.get(baseURL + "/petclinic-Dev/owners/find.html");
		 driver.findElement(By.xpath("//a[@class='btn btn-default']")).click();
		 driver.findElement(By.xpath("//input[@id='firstName']")).clear();
		 driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(FirstName);
		 driver.findElement(By.xpath("//input[@id='lastName']")).clear();
		 driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(LastName);
		 driver.findElement(By.xpath("//input[@id='address']")).clear();
		 driver.findElement(By.xpath("//input[@id='address']")).sendKeys(Address);
		 driver.findElement(By.xpath("//input[@id='city']")).clear();
		 driver.findElement(By.xpath("//input[@id='city']")).sendKeys(City);
		 driver.findElement(By.xpath("//input[@id='telephone']")).clear();
		 driver.findElement(By.xpath("//input[@id='telephone']")).sendKeys(Telephone);
		 driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		 System.out.println("user addition successful !");
		 
		 driver.quit();
}
}
