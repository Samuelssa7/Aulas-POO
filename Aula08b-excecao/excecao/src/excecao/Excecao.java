
package excecao;

import java.io.IOException;

public class Excecao {


	public static void main(String[] args) {
        String caminho = "C:\\Users\\clevi\\Documents\\GIT\\Aulas-POO\\Aula08b-excecao\\catalogo.csv";
        Biblioteca b = new Biblioteca();
		b.carregarCatalogo(caminho);

        System.out.println("Catálogo inicial:");
        for (Livro liv : b.getListaDeLivros()) {
            System.out.println(liv.exibirDados());
        }

        Aluno aluno = new Aluno("Joao", "2021001");
        String isbnDisponivel = "978-8533619111"; 
        String isbnIndisponivel = "978-8550801230";

        System.out.println("\nTentando emprestar ISBN disponível: " + isbnDisponivel);
        aluno.solicitarEmprestimo(b, isbnDisponivel);

        System.out.println("\nTentando emprestar ISBN indisponível: " + isbnIndisponivel);
        aluno.solicitarEmprestimo(b, isbnIndisponivel);

        System.out.println("\nCatálogo após tentativas:");
        for (Livro liv : b.getListaDeLivros()) {
            System.out.println(liv.exibirDados());
        }

        System.out.println("\nAluno devolve o livro: " + isbnDisponivel);
        aluno.devolverLivro(b, isbnDisponivel);

        System.out.println("\nCatálogo final:");
        for (Livro liv : b.getListaDeLivros()) {
            System.out.println(liv.exibirDados());
        }
	}
	
}
