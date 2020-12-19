package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StorePage extends BasePage {

	public StorePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public StorePage order_list() {
		
		driver.findElement(By.className("product_sort_container")).click();
		driver.findElement(By.xpath("//div[@id=\"inventory_filter_container\"]/select/option[3]")).click();		
		
		return this;		
	}
	
	public StorePage order_list_a_z() {
		
		driver.findElement(By.className("product_sort_container")).click();
		driver.findElement(By.xpath("//div[@id=\"inventory_filter_container\"]/select/option[1]")).click();		
		
		return this;		
	}	
	
	
	public StorePage add_cart() {
		
		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[4]/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[5]/div[3]/button")).click();	
		
		return this;		
	}
	
	public StorePage add_cart2() {
		
		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
		driver.findElement(By.id("item_4_title_link")).click();
				
		return this;		
	}
	
	public StorePage rmv_cart() {
		
		driver.findElement(By.xpath("//*[@class=\"btn_secondary btn_inventory\"]")).click();
						
		return this;		
	}
	
	
	
		
	
	public StorePage shop_cart() {
		
		driver.findElement(By.id("shopping_cart_container")).click();
		
		return this;
	}
	
	
	public CartPage btn_checkout() {
		
		driver.findElement(By.xpath("//a[contains(text(),'CHECKOUT')]")).click();		
		
		return new CartPage(driver);
	}

}
