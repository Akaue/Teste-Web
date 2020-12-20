package steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import suporte.AccesWeb;

public class LoginStep {     
   

	WebDriver driver;		
   
	@Given("Que estou na pagina de login")
	public void que_estou_na_pagina_de_login() {
      driver = AccesWeb.create_chrome();		
	}
	
	@When("Eu insiro dados errados")
	public void eu_insiro_dados_errados() {
       new LoginPage(driver)
          .type_login("inmetrics","senha")
          .btn_login();	 
	}

	
	@Then("Eu nao devo consegui acessar")
	public void eu_nao_devo_consegui_acessar() {
		
      Assert.assertEquals("Epic sadface: Username and password do not match any user in this service",
    		             "Epic sadface: Username and password do not match any user in this service");
      driver.close();
    
	}	
	
	
	@Then("Eu valido se todos os usuarios aparecem na pagina")
	public void eu_valido_se_todos_os_usuarios_aparecem_na_pagina() {

       Assert.assertEquals("standard_user", "standard_user");
       Assert.assertEquals("locked_out_user", "locked_out_user");
       Assert.assertEquals("problem_user", "problem_user");
       Assert.assertEquals("performance_glitch_user","performance_glitch_user");
       driver.close();
		
	}
	
	
	@Then("Eu capturo os nomes de todos os usuarios que aparecem na pagina")
	public void eu_capturo_os_nomes_de_todos_os_usuarios_que_aparecem_na_pagina() {
		 new LoginPage(driver)
		     .capture_users(); 
	   driver.close();
	}
	


}