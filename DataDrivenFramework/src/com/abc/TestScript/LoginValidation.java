package com.abc.TestScript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginValidation {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new 	FileInputStream("C:\\Users\\mohiuddin\\Selenium_projects\\DataDrivenFramework\\src\\com\\abc\\utilities\\DataDriven.properties");
		Properties p=new Properties();
		p.load(fis);
		String urldata=p.getProperty("url");
		String userdata=p.getProperty("username");
		String passdata=p.getProperty("password");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(urldata);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.id("email")).sendKeys(userdata);
		driver.findElement(By.id("pass")).sendKeys(passdata);
		driver.findElement(By.id("send2")).click();
		driver.findElement(By.linkText("Log Out")).click();
	}

}
