# Exercício Prático: Sistema de Catálogo Streaming

## 1. O Cenário
Você foi contratado para desenvolver o "coração" de uma nova plataforma de streaming. O sistema precisa catalogar diferentes tipos de conteúdos (Filmes e Séries) e garantir que as restrições de idade sejam respeitadas antes de iniciar a reprodução.

## 2. Implementação

### Passo 1: O Contrato (Interface `Reproduzivel`)
Crie uma interface que define o comportamento padrão de qualquer mídia na plataforma.
* **Nome:** `Reproduzivel`
* **Método:** `void reproduzir(int idadeUsuario, String planoUsuario)`

### Passo 2: A Classe Abstrata `Conteudo` 
Crie uma classe abstrata chamada `Conteudo` que **implementa** a interface `Reproduzivel`.
* **Atributos (Privados):** `titulo` (String), `genero` (String), `classificacao` (int) e `plano` (String).
* **Métodos Especiais:**
    * O **Construtor** deve receber `titulo`, `genero` e o `plano` (ex: "Básico" ou "Plus").
    * No construtor, defina a `classificacao` como `0` (Livre) por padrão.
    * Crie **Getters e Setters** para todos os atributos.
* No `setClassificacao(int idade)`, garanta que o valor não seja negativo.

### Passo 3: As Sub-classes
Crie as duas subclasses que **estendem** `Conteudo`:
1.  **Classe `Filme`**: Adicione o atributo privado `duracaoMinutos` (int) e seu respectivo Getter/Setter.
2.  **Classe `Serie`**: Adicione o atributo privado `numeroTemporadas` (int) e seu respectivo Getter/Setter.

### Passo 4: Lógica de Reprodução (`Filme`)
Na classe `Filme`, sobrescreve o método `reproduzir`:
* O método deve comparar a `idadeUsuario` com a `classificacao` do objeto.
* **Se** a idade for maior ou igual à classificação: Exibir "Reproduzindo [Titulo]...".
* **Caso contrário**: Exibir "Acesso negado: Conteúdo não permitido para sua idade.".

### Passo 5: Lógica de Reprodução (`Serie`)
Na classe `Serie`, sobrescreve o método `reproduzir`:
* O método deve validar se `planoUsuario` é igual a `"Plus"` do objeto.
* **Se** o plano do usuário for `"Plus"`: Exibir "Reproduzindo [Titulo]...".
* **Caso contrário**: Exibir "Acesso negado: Conteúdo não permitido para seu plano.".

### Passo 6: Teste do Sistema
Crie uma classe `Principal` (ou `Main`) e execute os seguintes testes:
1.  Instancie um `Filme` (ex: "O Poderoso Chefão", 18 anos, "Básico").
2.  Instancie uma `Serie` (ex: "Bluey", Livre/0 anos, "Plus").
3.  Tente "reproduzir" o filme passando uma idade de 15 anos.
4.  Tente "reproduzir" a série passando um plano "Básico".
