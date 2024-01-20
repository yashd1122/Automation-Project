package ScaucedemoProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerDetailsPage {

	
	WebDriver driver = null;
	
	public CustomerDetailsPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	By f1st = By.cssSelector("#first-name");
	
	By Last = By.cssSelector("#last-name");
	
	By postal = By.cssSelector("#postal-code");
	
	
	public void firstname(String name){
		
		driver.findElement(f1st).sendKeys(name);
	}
	
	public void Lastname(String lastnm) {
		
		driver.findElement(Last).sendKeys(lastnm);
		
	}
	
	public void PostalCode(String pcode) {
		
		driver.findElement(postal).sendKeys(pcode);
	}
	
	
	
	
}
