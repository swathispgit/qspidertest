package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	public FileLib f= new FileLib();
	
	@BeforeClass
		public void openBrowser() throws IOException
		
		{
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  String url=f.readDataFromProperty("url");
		  driver.get(url);
		}
	
	@BeforeMethod
		
		public void Login()
		{
			String un= f.readDataFromProperty("username");
			String pwd=f.readDataFromProperty("password");
			LoginPage l =new LoginPage(driver);
			l.setLogin(un,pwd);
		}
	
	@AfterMethod
		
		public void Logout()
		{
			HomePage h= new Homepage(driver);
			h.setlogout();
		}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	
	}
	
		
	
}

	

