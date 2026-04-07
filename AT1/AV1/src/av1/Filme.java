
package av1;


public class Filme extends Conteudo {
    private int duracaoMinutos;

    public Filme(String titulo, String genero, String plano, int duracaoMinutos) {
        super(titulo, genero, plano);
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public void reproduzir(int idadeUsuario, String planoUsuario) {
        if (idadeUsuario >= this.getClassificacao()) {
            System.out.println("Reproduzindo Filme: " + getTitulo() + "...");
        } else {
            System.out.println("Acesso negado: Conteudo nao permitido para sua idade.");
        }
    }

    public int getDuracaoMinutos() { return duracaoMinutos; }
    public void setDuracaoMinutos(int duracao) { this.duracaoMinutos = duracao; }
}
