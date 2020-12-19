package steps;



import org.testng.Assert;

import org.openqa.selenium.WebDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.LoginPage;
import pages.StorePage;
import suporte.AccesWeb;

public class StoreStep {
	
	WebDriver driver;	
	
	@Given("Que acesso a pagina de produtos")
	public void que_acesso_a_pagina_de_produtos() {
		
		driver = AccesWeb.create_chrome();	
		  new LoginPage(driver)
             .type_login("standard_user","secret_sauce")
             .btn_login();
	  
         Assert.assertEquals("Products", "Products");
	}
	

	@Then("Ordeno os itens do menor para o maior")
	public void ordeno_os_itens_do_menor_para_o_maior() throws InterruptedException {
		
		 new StorePage(driver)
		    .order_list();
		
		  Assert.assertEquals("Price (low to high)", "Price (low to high)");
		  Thread.sleep(1000);
		  driver.close();
 
	}
	
	
	 @Then("Ordeno os itens de A a Z")
	public void ordeno_os_itens_de_A_a_Z() throws InterruptedException {
		
		 new StorePage(driver)
		    .order_list_a_z();
		 
		  Assert.assertEquals("Name (A to Z)", "Name (A to Z)");
		  Thread.sleep(1000);		
		  driver.close();
		}

	@When("Adiciono um produto")
	public void adiciono_um_produto() {
		new StorePage(driver)
	     .add_cart2();
	     
	}

   @Then("Removo o produto")
	public void removo_o_produto() {
		new StorePage(driver)
	     .rmv_cart();
		
		Assert.assertEquals("ADD TO CART", "ADD TO CART");
		driver.close();
	}	
	
	
	
	@When("Eu escolho algumas roupas")
	public void eu_escolho_algumas_roupas() {
		
	    new StorePage(driver)
		  .add_cart()
		  .shop_cart();
	}	
	
	
	@Then("Vou para o carrinho e finalizo a compra")
	public void vou_para_o_carrinho_e_finalizo_a_compra() {
		
	    new StorePage(driver)
	         .btn_checkout()
	         .insert_information();
	    
	   Assert.assertEquals("SauceCard #31337", "SauceCard #31337");
	   Assert.assertEquals("$79.89", "$79.89");
	    
           new CartPage(driver)
                .btn_finish();           
           
       Assert.assertEquals("THANK YOU FOR YOUR ORDER", "THANK YOU FOR YOUR ORDER");  
       driver.close();

	}
	

}
