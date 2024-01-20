package ScaucedemoProjectTestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ScaucedemoProject1.LoginPage;
import ScaucedemoProject1.ProductAddPage;

public class ProductTest1 {

	
	WebDriver driver = null;

	//verify add to cart function by adding just one product to the cart 
	
	
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
	
		Adproduct.Productclick();
	

		
		
		
		Thread.sleep(2000);
		
		String s = driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']")).getText();
		System.out.println(s);
	}
	
	@AfterMethod
	public void quit() {
		
		
		
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
