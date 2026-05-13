package excecao;

public class Aluno {
    private String nome;
    private String matricula;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() { return nome; }
    public String getMatricula() { return matricula; }

    public void solicitarEmprestimo(Biblioteca biblioteca, String isbn) {
        boolean ok = biblioteca.emprestarLivro(isbn);
        if (ok) {
            System.out.println("Aluno " + nome + " emprestou o livro com ISBN " + isbn);
        } else {
            System.out.println("Aluno " + nome + " não conseguiu emprestar o livro com ISBN " + isbn);
        }
    }

    public void devolverLivro(Biblioteca biblioteca, String isbn) {
        boolean ok = biblioteca.devolverLivro(isbn);
        if (ok) {
            System.out.println("Aluno " + nome + " devolveu o livro com ISBN " + isbn);
        } else {
            System.out.println("Aluno " + nome + " não conseguiu devolver o livro com ISBN " + isbn);
        }
    }
}
