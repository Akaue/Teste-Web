

Feature: Comprar produtos
    Como um cliente da loja quero comprar produtos online     
  
  Background:    
     Given Que acesso a pagina de produtos

 
 Scenario: Ordenar peças do menor para o maior.
   Then  Ordeno os itens do menor para o maior     
    
    
 Scenario: Ordenar peças por odem alfabetica
   Then  Ordeno os itens de A a Z
      
    
 Scenario: Adicionar ao carrinho e remover
   When Adiciono um produto
   Then Removo o produto
   

 Scenario:  Realizar compra de 3 peças de roupa.
   When  Eu escolho algumas roupas
   Then  Vou para o carrinho e finalizo a compra
 
      
      
      
 