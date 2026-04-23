package universidade;

public class Pessoa {
    protected String nome;
    protected String cpf;

    /* Construtores
    * O da linha 13 é um construtor vazio e o da linha 
    * 15 é com valores pré-definidos
    * Esta é outra possibilidade de sobrecarga
    */
    
    // public Pessoa() {}

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String exibirDados() {
        return "Nome: " + this.nome + " | CPF: " + this.cpf;
    }
}
