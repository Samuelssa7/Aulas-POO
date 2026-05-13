package excecao;

public class Livro {
    private String isbn;
    private String titulo;
    private String autor;
    private int ano;
    private boolean disponivel;

    public Livro(String isbn, String titulo, String autor, int ano, boolean disponivel) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.disponivel = disponivel;
    }

    public String getIsbn() { return isbn; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAno() { return ano; }
    public boolean isDisponivel() { return disponivel; }

    public void setDisponivel(boolean disponivel) { this.disponivel = disponivel; }

    public String exibirDados() {
        return "Livro {" +
                "isbn =" + isbn + 
                " || titulo='" + titulo + '\'' +
                " || autor='" + autor + '\'' +
                " || ano=" + ano +
                " || disponivel=" + disponivel +
                '}';
    }
}
