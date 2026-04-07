
package av1;

public class AV1 {

	public static void main(String[] args) {
        // 1. Instanciando Filme
        Filme filme1 = new Filme("O Poderoso Chefão", "Drama", "Básico", 180);
        filme1.setClassificacao(18);

        // 2. Instanciando Série
        Serie serie1 = new Serie("Bluey", "Infantil", "Plus", 2);
        // Classificação já é 0 por padrão no construtor de Conteudo

        System.out.println(" Teste de Filme (Idade 15) ");
        filme1.reproduzir(15, "Básico"); // Esperado: Negado por idade

        System.out.println(" Teste de Serie (Plano Basico) ");
        serie1.reproduzir(10, "Básico"); // Esperado: Negado por plano

        System.out.println(" Teste de Serie (Plano Plus) ");
        serie1.reproduzir(10, "Plus");   // Esperado: Autorizado
	}
	
}
