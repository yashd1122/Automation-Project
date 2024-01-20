package ScaucedemoProject1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductAddPage {

	WebDriver driver = null;

	
	public ProductAddPage(WebDriver driver) {
		
		this.driver=driver;
		
	}

	
//locators
	
	By product1 =By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/button[1]");
	
	By product2 = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[3]/button[1]");
	
	By product3 = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/div[3]/button[1]");
	
	By product4 = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[4]/div[3]/button[1]");
	
	By product5 = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]/div[3]/button[1]");
	
	By product6 = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[6]/div[3]/button[1]");
	
	
	

	
	
	public void Productclick() {
		
	driver.findElement(product1).click();
		
		
	}	
	
	public void Productclick2() {
		
	driver.findElement(product2).click();
		
		
	}
	
	public void Productclick3() {
		
	driver.findElement(product3).click();
		
		
	}

		
	public void Productclick4() {
		
	driver.findElement(product4).click();
		
		
	}

	public void Productclick5() {
		
	driver.findElement(product5).click();
		
		
	}
	
	public void Productclick6() {
		
	driver.findElement(product6).click();
		
		
	}
	

	
	
	
	
	
	
}
