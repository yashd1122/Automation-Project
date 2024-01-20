package ScaucedemoProjectTestCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ScaucedemoProject1.LoginPage;


public class LoginTest4 {

	WebDriver driver = null;
	
	
	@BeforeMethod
	public void LaunchBrowser() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		driver.get("https://www.saucedemo.com/v1/index.html");
	
		Thread.sleep(2000);
		
		}

	
	// Verify that the Login won't work with the " valid user " and " invalid password "
	
	@Test
	public void login() throws InterruptedException {
		
		LoginPage page = new LoginPage(driver);
		
		page.setUserName("problem_user");
		
		page.setPassword("secretmachine");
		
		page.clickLogin();
		
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void quit() {
		
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
