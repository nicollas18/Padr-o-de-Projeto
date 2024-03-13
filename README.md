# Padrão de Projeto Strategy

1. Introdução:

Definição Geral do Padrão de Projeto Strategy:

  O padrão Strategy pertence à categoria de padrões comportamentais, que se concentram nas responsabilidades de objetos e      suas   interações.
  Ele permite que um algoritmo seja selecionado dinamicamente durante o tempo de execução.
  Ajuda a definir uma família de algoritmos, encapsulá-los e torná-los intercambiáveis.


2. Características Principais do Padrão Strategy:

Estrutura:

  Contexto: Mantém uma referência a uma estratégia.
  Estratégia: Interface comum para todos os algoritmos específicos.
  Estratégias Concretas: Implementam as diferentes variantes de um algoritmo.
  Flexibilidade:
  
  Permite que os clientes escolham dinamicamente entre diferentes algoritmos.
  Facilita a adição de novos algoritmos sem alterar o código cliente.


3. Aplicação do Padrão no Código:

Objetivos do Projeto:

  Breve descrição dos objetivos do seu sistema de adoção de animais.
  Explicação da Estrutura do Código:
  
  Destaque para o menu de opções que anteriormente usava um grande switch-case para diferentes funcionalidades.
  Implementação do Padrão Strategy:
  
  Introdução das estratégias específicas para cada funcionalidade (Estrategia1, Estrategia2, ..., Estrategia10).
  Vantagens Obtidas:
  
  Redução da complexidade do código.
  Facilidade de adicionar novas funcionalidades sem alterar o código existente.
  Maior flexibilidade e manutenibilidade.
  Exemplificação de Uso:
  
  Mostrar trechos de código onde a estratégia é escolhida e executada no contexto do menu de opções.

