## Atividade: Biblioteca — Exceções e Pilares da POO

Implemente uma aplicação Java para gerenciar um catálogo de livros. O projeto consiste em fazer um tratamento de exceção eficiente no sistema.

### Objetivo

Implemente e teste tratamentos de exceção (try/catch) nos pontos críticos do sistema de biblioteca. O arquivo já contém dois pontos iniciais de atenção; abaixo adicionamos mais dois lugares onde exceções podem ser provocadas e tratadas.

---

### TODO 1 — Tratar erro de conversão de ano

Fazer tratamento de `NumberFormatException` ao converter o campo `ano` do CSV para `int` (ex.: quando existir uma letra no campo). Use `try { Integer.parseInt(...) } catch (NumberFormatException e) { ... }`.

### TODO 2 — Tratar falha de carregamento do arquivo

Fazer tratamento de `IOException` / falha ao abrir o arquivo quando o caminho estiver incorreto. Use `try` ao abrir `FileReader` / `BufferedReader` e capture `IOException` para informar e abortar com segurança.

### TODO 3 — Tratar `NullPointerException` ao acessar catálogo não carregado

Provoque/prepare um teste onde `Biblioteca.getListaDeLivros()` retorne `null` (catálogo não carregado) e trate o possível `NullPointerException` ao iterar sobre o array. Exemplo de tratamento:

```
if (b.getListaDeLivros() == null) {
	System.out.println("Catálogo vazio");
} else {
	for (Livro l : b.getListaDeLivros()) { ... }
}
```

---

### Observações

- Considere verificações (null / tamanho) vs `try/catch` quando possível; use exceções para situações excepcionais.
- Ao demonstrar em `Excecao.main`, crie pequenos blocos de teste que forçam cada situação e mostram a mensagem tratada.




