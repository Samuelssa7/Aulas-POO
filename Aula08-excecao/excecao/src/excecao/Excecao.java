
package excecao;

import java.util.Scanner;

public class Excecao {

	public static void main(String[] args) {
			int a = 5;
			int b = 0;
			double c = a/b;
			System.out.println("A divisao de "+a+" e "+b+" e igual a "+c);
		
		/*
		// Criar e imprimir vetor
		int[] numeros = {10, 180, 43, 0};
        System.out.println("Vetor de numeros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("[%d] = %s%n", i, numeros[i]);
        }
		
		// Coletar indices e exibir
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira o indice do dividendo:");
		int dividendo = scan.nextInt();
		System.out.println("Insira o indice do divisor:");
		int divisor = scan.nextInt();

		// ArrayIndexOutOfBounds
		String msg = "Os valores escolhidos sao: " + numeros[dividendo];
		msg += " e " + numeros[divisor];
		System.out.println(msg); 

		// ArithmeticException
		double result = numeros[dividendo] / numeros[divisor];
		System.out.println("O resultado: " + result); 
		*/

		
	}
}
