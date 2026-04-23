package universidade;

public class Main {
    public static void main(String[] args) {
        Professor prof = new Professor("Maria Silva", "111.222.333-44", 1001, 5000.0, 50.0, 1000.0);
        Funcionario func = new Funcionario("Joao Souza", "222.333.444-55", 1002, 2500.0, 60.0);

        System.out.println(prof.exibirDados());
        System.out.println("Saldo antes (prof): " + prof.getSaldoContaBancaria());
        prof.receberSalario();
        System.out.println("Saldo depois (prof): " + prof.getSaldoContaBancaria());

        System.out.println(func.exibirDados());
        System.out.println("Saldo antes (func): " + func.getSaldoContaBancaria());
        func.receberSalario();
        System.out.println("Saldo depois (func): " + func.getSaldoContaBancaria());

        Aluno aluno = new Aluno("Carlos Pereira", "333.444.555-66", "2026001", "Psicologia");
        Materia mat;
		mat = aluno.matricularMateria("Matematica");
		System.out.println(mat.exibirDados() );

		mat = aluno.matricularMateria("Fotografia", 30);
		System.out.println(mat.exibirDados() );

		mat = aluno.matricularMateria("Empreendedorismo", "Extensao", 40, prof.getIdFuncionario());
		System.out.println(mat.exibirDados() );

        // aluno.getMateria();

        // aluno.listarMaterias();
    }
}
