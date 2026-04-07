package av1;

public class Serie extends Conteudo {
    private int numeroTemporadas;

    public Serie(String titulo, String genero, String plano, int numeroTemporadas) {
        super(titulo, genero, plano);
        this.numeroTemporadas = numeroTemporadas;
    }

    @Override
    public void reproduzir(int idadeUsuario, String planoUsuario) {
        if (planoUsuario.equalsIgnoreCase("Plus")) {
            System.out.println("Reproduzindo Serie: " + getTitulo() + "...");
        } else {
            System.out.println("Acesso negado: Conteudo nao permitido para seu plano.");
        }
    }

    public int getNumeroTemporadas() { return numeroTemporadas; }
	
    public void setNumeroTemporadas(int n) { this.numeroTemporadas = n; }
}
