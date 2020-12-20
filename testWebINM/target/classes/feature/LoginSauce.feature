Feature: Logar e fazer compras
     Como um cliente quero me logar para comprar roupas e outros utensílios

  Background: 
    Given Que estou na pagina de login

  Scenario: Realizar login com usuário incorreto.
    When Eu insiro dados errados
    Then Eu nao devo consegui acessar

  Scenario: validar que todos os usuários estão na página de home.
    Then Eu valido se todos os usuarios aparecem na pagina

  Scenario: Pegar na página de login todos os usuários.
    Then Eu capturo os nomes de todos os usuarios que aparecem na pagina
