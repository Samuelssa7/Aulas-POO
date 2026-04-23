package universidade;

public class Professor extends Funcionario {
    private double bonus;

    /* Construtores
    * O da linha 12 é um construtor vazio e o da linha 
    * 14 é com valores pré-definidos
    * Esta é outra possibilidade de sobrecarga
    */
    
    // public Professor() {}

    public Professor(String nome, String cpf, int idFuncionario, double salario, double saldoContaBancaria, double bonus) {
        super(nome, cpf, idFuncionario, salario, saldoContaBancaria);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double receberSalario() {
        double saldo = super.receberSalario();
        saldo += this.bonus;
        setSaldoContaBancaria(saldo);
        return saldo;

        /* Outra abordagem:
        * this.saldoContaBancaria += super.receberSalario() + this.bonus;
        * return this.saldoContaBancaria;
        */
    }
}
