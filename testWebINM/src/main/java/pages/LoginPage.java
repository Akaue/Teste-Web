package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub		
	}
	
	
	public LoginPage type_login(String username, String password) {
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);	
				
		return this;			
	}
	
	
	public LoginPage capture_users() {
		
	  String captura_usuarios = driver.findElement(By.id("login_credentials")).getText();	
	  
	  System.out.println(captura_usuarios);	  
		
	   return this;
	}		
	
		
	public StorePage btn_login() {		
		driver.findElement(By.id("login-button")).click();
		
		
	  return new StorePage(driver);
	}		

}
