package universidade;

public class Funcionario extends Pessoa {
    private int idFuncionario;
    private double salario;
    private double saldoContaBancaria;

    /* Construtores
    * O da linha 14 é um construtor vazio e o da linha 
    * 16 é com valores pré-definidos
    * Esta é outra possibilidade de sobrecarga
    */
    
    // public Funcionario() {}

    public Funcionario(String nome, String cpf, int idFuncionario, double salario, double saldoContaBancaria) {
        super(nome, cpf);
        this.idFuncionario = idFuncionario;
        this.salario = salario;
        this.saldoContaBancaria = saldoContaBancaria;
    }

	public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSaldoContaBancaria() {
        return saldoContaBancaria;
    }

    public void setSaldoContaBancaria(double saldoContaBancaria) {
        this.saldoContaBancaria = saldoContaBancaria;
    }

    public double receberSalario() {
        this.saldoContaBancaria += this.salario;
        return this.saldoContaBancaria;
    }
}
