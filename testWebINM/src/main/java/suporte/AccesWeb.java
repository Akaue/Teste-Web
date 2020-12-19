package suporte;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AccesWeb {
	
	public static WebDriver create_chrome() {
		
		 System.setProperty("WebDriver.Chrome.Driver", "C:\\Tools\\chromedriver.exe");
		 
		 Dimension dimension = new Dimension(1200,800);
         WebDriver driver = new ChromeDriver();
         driver.manage().window().setSize(dimension);
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.get("https://www.saucedemo.com/index.html");	
         
         return driver;
		
	}

}
