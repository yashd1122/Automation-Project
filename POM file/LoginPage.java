package ScaucedemoProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver = null;
	
	public LoginPage(WebDriver driver){
	
		this.driver = driver;
		}

     //Locator
	
	By username = By.cssSelector("#user-name");
	
	By password = By.cssSelector("#password");
	
	By click = By.cssSelector("#login-button");

	
	
	//Action
	
	public void setUserName (String name) {
		
		driver.findElement(username).sendKeys(name);
		
	
	}


	public void setPassword (String pass) {
		
		driver.findElement(password).sendKeys(pass);
		
	
	}

	public void clickLogin () {
		
		driver.findElement(click).click();
		
	
	}


}



