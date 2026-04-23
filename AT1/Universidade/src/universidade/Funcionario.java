package universidade;

public class Funcionario extends Pessoa {
	public int idFuncionario;
	private double salario;
	private double saldoContaBancaria;

	//public Funcionario() {
	//}
	
	public Funcionario(int idFuncionario, double salario, double saldoContaBancaria) {
		this.idFuncionario = idFuncionario;
		this.salario = salario;
		this.saldoContaBancaria = saldoContaBancaria;
	}
	
	public double receberSalario() {
		double rs = this.saldoContaBancaria = this.saldoContaBancaria + this.salario;
		return rs;
	}
	
}
