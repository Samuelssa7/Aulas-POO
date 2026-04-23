package universidade;

public class Materia {
    private String nome;
    private String tipo; // Valores: Obrigatoria, Optativa ou Extensao
    private int quantidadeHoras;
    private int idFuncionario; // professor responsável

    /* Construtores
    * O da linha 15 é um construtor vazio e o da linha 
    * 17 é com valores pré-definidos
    * Esta é outra possibilidade de sobrecarga
    */
    
    // public Materia() {}

    public Materia(String nome, String tipo, int quantidadeHoras, int idFuncionario) {
        this.nome = nome;
        this.tipo = tipo;
        this.quantidadeHoras = quantidadeHoras;
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(int quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String exibirDados() {
        return "Materia \r\nnome = " + nome + ", tipo = " + tipo + ", horas = " + quantidadeHoras + ", idProf = " + idFuncionario + "]";
    }
}
