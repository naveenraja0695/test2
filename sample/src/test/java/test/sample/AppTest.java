package test.sample;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AppTest {
	public static void main(String [] args) throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-popup-blocking");
//        options.addArguments("--disable-notifications");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://magento.softwaretestingboard.com");
	    driver.manage().window().maximize();
	    
	   
	    driver.findElement(By.xpath("//a[text()='Create an Account']")).click();
	    Thread.sleep(5000);
	    try {
			List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
			for(WebElement frame: iframes ) {
				driver.switchTo().frame(frame);
				List<WebElement> closeBtn  =driver.findElements(By.id("dismiss-button"));
				if(!closeBtn.isEmpty()) {
					closeBtn.get(0).click();
					System.out.println("Ad is closed");
					break;
				}
				driver.switchTo().defaultContent();			
			}
			}catch (Exception e) {
				System.out.println("No ads present");
			}finally {
				driver.switchTo().defaultContent();
			}
	    
	    driver.findElement(By.id("firstname")).sendKeys("firstname");
		   
			
    driver.findElement(By.id("lastname")).sendKeys("lastname");
	    driver.findElement(By.id("email_address")).sendKeys("email159@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("passworD@123");
	    driver.findElement(By.id("password-confirmation")).sendKeys("passworD@123");
	    driver.findElement(By.xpath("//span[text()='Create an Account']")).click();
	    WebElement actual =driver.findElement(By.xpath("//div[text()='Thank you for registering with Main Website Store.']"));
	    Assert.assertEquals(actual.getText(), "Thank you for registering with Main Website Store.");
	   
	    driver.quit();
	    
	} 
    
}
