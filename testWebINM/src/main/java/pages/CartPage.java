package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

	public CartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public CartPage insert_information() {
		
		driver.findElement(By.id("first-name")).sendKeys("Akauê");	
		driver.findElement(By.id("last-name")).sendKeys("Lima");	
		driver.findElement(By.id("postal-code")).sendKeys("06852470");
		driver.findElement(By.xpath("//input[@class=\"btn_primary cart_button\"]")).click();
		
		return this;		
	}
	
	
	public CartPage btn_finish() {	
		
	    driver.findElement(By.xpath("//a[@class=\"btn_action cart_button\"]")).click();	
		
		return this;
	}	

}
