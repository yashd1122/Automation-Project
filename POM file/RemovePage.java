package ScaucedemoProject1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemovePage {

	WebDriver driver = null;

	
	public RemovePage(WebDriver driver) {
		
		this.driver=driver;
		
	}

	
//locators
	
	By remove1 =By.xpath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[3]/div[2]/div[2]/button[1]");
	
	By remove2 = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[4]/div[2]/div[2]/button[1]");
	
	By remove3 = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[5]/div[2]/div[2]/button[1]");
	
	By remove4 = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[6]/div[2]/div[2]/button[1]");
	
	By remove5 = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[7]/div[2]/div[2]/button[1]");
	
	By remove6 = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[8]/div[2]/div[2]/button[1]");
	
	
	
	
	public void Removeclick() {
		
	driver.findElement(remove1).click();
		
		
	}	
	
	public void Removeclick2() {
		
	driver.findElement(remove2).click();
		
		
	}
	
	public void Removeclick3() {
		
	driver.findElement(remove3).click();
		
		
	}

		
	public void Removeclick4() {
		
	driver.findElement(remove4).click();
		
		
	}

	public void Removeclick5() {
		
	driver.findElement(remove5).click();
		
		
	}
	
	public void Removeclick6() {
		
	driver.findElement(remove6).click();
		
		
	}
	

	
	
	
	
	
	
}
