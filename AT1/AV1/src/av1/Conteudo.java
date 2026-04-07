
package av1;

public abstract class Conteudo implements Reproduzivel {
    private String titulo;
    private String genero;
    private int classificacao;
    private String plano;

    // Construtor
    public Conteudo(String titulo, String genero, String plano) {
        this.titulo = titulo;
        this.genero = genero;
        this.plano = plano;
        this.classificacao = 0;
    }

    // Getters e Setters com Encapsulamento
    public String getTitulo() { return titulo; }
    
    public int getClassificacao() { return classificacao; }
    
	public void setClassificacao(int classificacao) {
        // Validação: Garante que o valor esteja no intervalo permitido
        if (classificacao >= 0 && classificacao <= 18) {
            this.classificacao = classificacao;
        } else {
            System.out.println("Erro: Classificação inválida. Use valores entre 0 e 18.");
        }
    }

    public String getPlano() { return plano; }
	
    public void setPlano(String plano) { this.plano = plano; }

    public String getGenero() { return genero; }
	
    public void setGenero(String genero) { this.genero = genero; }
}
