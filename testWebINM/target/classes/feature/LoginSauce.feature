Feature: Logar e fazer compras
     Como um cliente quero me logar para comprar roupas e outros utens�lios

  Background: 
    Given Que estou na pagina de login

  Scenario: Realizar login com usu�rio incorreto.
    When Eu insiro dados errados
    Then Eu nao devo consegui acessar

  Scenario: validar que todos os usu�rios est�o na p�gina de home.
    Then Eu valido se todos os usuarios aparecem na pagina

  Scenario: Pegar na p�gina de login todos os usu�rios.
    Then Eu capturo os nomes de todos os usuarios que aparecem na pagina
