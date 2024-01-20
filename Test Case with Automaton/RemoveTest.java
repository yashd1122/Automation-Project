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
import ScaucedemoProject1.RemovePage;

public class RemoveTest {

	
WebDriver driver = null;

	
	//verify add to cart function by adding multiple product to the cart
	
	
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
	public void RemoveCart() throws InterruptedException {
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		ProductAddPage Adproduct = new ProductAddPage(driver);
		
		Adproduct.Productclick();
		
		Adproduct.Productclick2();
	
		Adproduct.Productclick5();
	
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("[class^='svg']")).click();
		
		
		RemovePage removeproduct = new RemovePage(driver);
		
		removeproduct.Removeclick();
		
		removeproduct.Removeclick2();
		
		
		
		
		
		
		Thread.sleep(10000);
		
		
	}
	
	@AfterMethod
	public void quit() {
		
		driver.quit();
	}
	

}
