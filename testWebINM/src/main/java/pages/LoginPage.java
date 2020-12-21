package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
			
	}
	
	 //insere o login e a senha
	public LoginPage type_login(String username, String password) {
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);	
				
		return this;			
	}
	
	//imprime no console os usuários da pagina
	public LoginPage capture_users() {
		
	  String captura_usuarios = driver.findElement(By.id("login_credentials")).getText();	
	  
	  System.out.println(captura_usuarios);	  
		
	   return this;
	}		
	
	  //botão para realizar login	
	public StorePage btn_login() {		
		driver.findElement(By.id("login-button")).click();
		
		
	  return new StorePage(driver);
	}		

}
