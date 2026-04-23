package universidade;

// import java.util.ArrayList;
// import java.util.List;

public class Aluno extends Pessoa {
    private String ra;
    private String curso;

    // private Materia materia;
    // private List<Materia> materias = new ArrayList<>();

    /* Construtores
    * O da linha 19 é um construtor vazio e o da linha 
    * 21 é com valores pré-definidos
    * Esta é outra possibilidade de sobrecarga
    */
    
    // public Aluno() {}

    public Aluno(String nome, String cpf, String ra, String curso) {
        super(nome, cpf);
        this.ra = ra;
        this.curso = curso;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Matricula em materia Obrigatoria com carga horaria padrao (60) passando apenas o nome
    public Materia matricularMateria(String nome) {
        Materia m = new Materia(nome, "Obrigatoria", 60, 1003);
		return m;
        
		// comando para atribuir a matéria ao aluno (retorno poderia ser void)
		// this.materia = m;

		// comando para adicionar a matéria na lista de matérias do aluno (retorno poderia ser void)
		// materias.add(m);
	}

    public Materia matricularMateria(String nome, int quantidadeHoras) {
    // Matricula em materia Optativa passando nome e quantidade de horas
        Materia m = new Materia(nome, "Optativa", quantidadeHoras, 1004);
		return m;
        
		// comando para atribuir a matéria ao aluno (retorno poderia ser void)
		// this.materia = m;

		// comando para adicionar a matéria na lista de matérias do aluno (retorno poderia ser void)
		// materias.add(m);
    }

    // Matricula para tipos variados (Extensão ou outro), com professor
    public Materia matricularMateria(String nome, String tipo, int quantidadeHoras, int idFuncionario) {
        Materia m = new Materia(nome, tipo, quantidadeHoras, idFuncionario);
        return m;
        
		// comando para atribuir a matéria ao aluno (retorno poderia ser void)
		// this.materia = m;

		// comando para adicionar a matéria na lista de matérias do aluno (retorno poderia ser void)
		// materias.add(m);
    }

	/* Inicio métodos para atributo matéria 
    public Materia getMateria() {
        return this.materia;
    }
    
    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    */ // Fim métodos para lista de matérias 


	/* Inicio métodos para lista de matérias 
    * public List<Materia> getMaterias() {
    *     return materias;
    * }
    * 
    * public void listarMaterias() {
    *     if (materias.isEmpty()) {
    *         System.out.println("Nenhuma materia matriculada para " + getNome());
    *         return;
    *     }
    *     System.out.println("Materias de " + getNome() + ":");
    *     for (Materia m : materias) {
    *         System.out.println(" - " + m);
    *     }
    * }
	* 
    */ // Fim métodos para lista de matérias 
}
