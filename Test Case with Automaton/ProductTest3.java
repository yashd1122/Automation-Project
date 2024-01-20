package ScaucedemoProjectTestCase;

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

public class ProductTest3 {

	
	WebDriver driver = null;

	
	//verify add to cart function by adding all product to the cart 
	
	
	@BeforeMethod
	public void LaunchBrowser() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://www.saucedemo.com/v1/index.html");
		driver.manage().window().maximize();
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
		
		Adproduct.Productclick2();
	
		Adproduct.Productclick3();		
		
		Adproduct.Productclick4();	
		
		Adproduct.Productclick5();	
		
		Adproduct.Productclick6();	
		
		
		
		Thread.sleep(10000);
		
		
		
	 String s  = driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']")).getText();
		
		int i = Integer.parseInt(s);

		//The total number of product is 6 ....
		
		if(i==6) {
			
		
			
		
		}else Assert.fail("failed because cart doesn't had total number of product");
		
		
		
		
		
	}
	
	@AfterMethod
	public void quit() {
		
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
