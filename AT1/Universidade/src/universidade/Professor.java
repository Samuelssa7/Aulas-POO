package universidade;

public class Professor extends Funcionario {
	private double bonus;
	
	@Override
	public double receberSalario() {
		double rs = super.receberSalario() + this.bonus;
		return rs;
	}
}
