package ScaucedemoProjectTestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ScaucedemoProject1.CustomerDetailsPage;
import ScaucedemoProject1.LoginPage;
import ScaucedemoProject1.ProductAddPage;

public class CustomerTest2 {

	WebDriver driver = null;
	
	
	
	//verify adding customer details  with capital letters firstname :- MICKY lastname :- MOUSE zip/pncode - 556677
	
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
		
	   CustomerDpage.firstname("MICKY");
	   
	   CustomerDpage.Lastname("MOUSE");
	   
	   CustomerDpage.PostalCode("556677");
	   
	   
	 Thread.sleep(2000);
	 
	 
	 driver.findElement(By.cssSelector("[class*='cart_button']")).click();
		
		
	}
	
	
	@AfterMethod
	public void quit() {
		
		driver.quit();
	}
	
	
	
}
