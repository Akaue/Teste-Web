package pages;

import org.openqa.selenium.WebDriver;

public class BasePage {
	
	protected WebDriver driver;
	
	//instancia webdriver
	public BasePage(WebDriver driver) {
		
		this.driver = driver;
	}
	
}
