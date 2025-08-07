package utils;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class createAccountutils {
	WebDriver driver;

	public void launchBrowser() {
		 driver = new ChromeDriver();
		this.driver= driver;
		
	}
	public void openHomePage() {
		driver.get("https://magento.softwaretestingboard.com");
		driver.manage().window().maximize();
	}
	
	public void openCreateAnAccount(String accountCreation) {
		driver.findElement(By.xpath("//a[text()='" + accountCreation+ "']")).click();
	}
	
	public void closeAd() {
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
		
	}
	
	public void userDetails(String firstname, String lastname, String email, String password, String confirmpass ) {
		 driver.findElement(By.id("firstname")).sendKeys(firstname);
		    driver.findElement(By.id("lastname")).sendKeys(lastname);
		    driver.findElement(By.id("email_address")).sendKeys(email);
		    driver.findElement(By.id("password")).sendKeys(password);
		    driver.findElement(By.id("password-confirmation")).sendKeys(confirmpass);
		
	}
	 public void clickCreateButton(String accountCreation) {
		 
		 driver.findElement(By.xpath("//span[text()='" + accountCreation + "']")).click();
		   
	 }
	  public void closeBrowser() {
		  driver.close();
	  }
	 public void verifySuccessRegistration() {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
      WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(
              By.xpath("//div[text()='Thank you for registering with Main Website Store.']")));

      if (!successMessage.getText().contains("Thank you for registering")) {
          throw new AssertionError("Registration failed or success message not found.");
      }}
//		 WebElement actual =driver.findElement(By.xpath("//div[text()='Thank you for registering with Main Website Store.']"));
//		    Assert.assertEquals(actual.getText(), "Thank you for registering with Main Website Store.");
//		
//		    
//	 }
//	 
	 
	 public void clickSignin() throws InterruptedException {
		 Thread.sleep(5000);
			driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
		}
	 
		public void loginCredentials(String email, String password) {
			driver.findElement(By.id("email")).sendKeys(email);
			driver.findElement(By.id("pass")).sendKeys(password);
		}
		
		public void clickLogin() {
			driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		}
		
}
