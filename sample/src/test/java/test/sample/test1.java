package test.sample;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test1 {

	public static void main(String [] args) throws InterruptedException {
		
		 
		
//		ChromeOptions options = new ChromeOptions();
//        options.addExtensions(new File("C:\\Users\\HP\\eclipse-workspace\\sample1\\Extensions\\AdBlock — block ads across the web - Chrome Web Store 6.25.2.0.crx"));
//	        options.addArguments("--start-maximized");
//	        
		WebDriver driver = new ChromeDriver();
		
	  	  driver.get("https://magento.softwaretestingboard.com");
	  	    driver.manage().window().maximize();
	  	  driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click(); 
	  	   
	  	    }
	}

