package ScaucedemoProjectTestCase;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.fail;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ScaucedemoProject1.LoginPage;
import ScaucedemoProject1.ProductAddPage;

public class ProductTest4 {

	
	WebDriver driver = null;

	//verify if user didn't add any product still the site moves to checkout(information) page without giving error on your cart page
	
	
	@BeforeMethod
	public void LaunchBrowser() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://www.saucedemo.com/v1/index.html");
		Thread.sleep(2000);
		
		LoginPage page = new LoginPage(driver);
		page.setUserName("problem_user");
		page.setPassword("secret_sauce");
		page.clickLogin();
		
		Thread.sleep(2000);
		
		
		
	}
	
	
	@Test
	public void AddtoCart() throws InterruptedException {
		
		ProductAddPage Adproduct = new ProductAddPage(driver);
	
	//	Adproduct.Productclick();
	

		driver.findElement(By.cssSelector("[class^='svg']")).click();
		
		driver.findElement(By.cssSelector("[class*='checkout']")).click();
		
		String m = driver.findElement(By.xpath(" //div[@class='subheader']")).getText();
		
		System.out.println(m);
		
		Assert.fail(m);
		
		Thread.sleep(2000);

	}
	
	@AfterMethod
	public void quit() {
		
		
		
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
