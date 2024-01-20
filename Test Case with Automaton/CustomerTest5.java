package ScaucedemoProjectTestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ScaucedemoProject1.CustomerDetailsPage;
import ScaucedemoProject1.LoginPage;
import ScaucedemoProject1.ProductAddPage;

public class CustomerTest5 {

	WebDriver driver = null;
	
	
	
//	verify if the site continue toward finish page without adding any customer detail
	
	
	
	@BeforeMethod
	public void launchBrowser() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://www.saucedemo.com/v1/index.html");
	//	driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// login
		
		LoginPage page = new LoginPage(driver);
		page.setUserName("problem_user");
		page.setPassword("secret_sauce");
		page.clickLogin();
		Thread.sleep(2000);
		
		
		//Add product
		
		ProductAddPage Adproduct = new ProductAddPage(driver);
		Thread.sleep(2000);
		Adproduct.Productclick();
		Thread.sleep(2000);
		
		// checkout page
		
		driver.findElement(By.cssSelector("[class^='svg']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class*='checkout']")).click();
		Thread.sleep(2000);
		
	}
	
	@Test
	public void addcustomerdetail() throws InterruptedException {
		
		CustomerDetailsPage CustomerDpage = new CustomerDetailsPage(driver);
		
	   CustomerDpage.firstname("");
	   
	   CustomerDpage.Lastname("");
	   
	   CustomerDpage.PostalCode("");
	   
	   
	 Thread.sleep(2000);
	 
	 
	 driver.findElement(By.cssSelector("[class*='cart_button']")).click();
	 
	 String k = driver.findElement(By.xpath("//h3[normalize-space()='Error: First Name is required']")).getText();
	 
	 Assert.assertEquals("Error: First Name is required", k);
		
	 Thread.sleep(2000);

		
	}
	
	
	@AfterMethod
	public void quit() {
		
		driver.quit();
	}
	
	
	
}
