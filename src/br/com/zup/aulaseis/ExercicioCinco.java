package br.com.zup.aulaseis;

public class ExercicioCinco {

	public static void main(String[] args) {
		// Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros. 
		// O programa deve executar os seguintes passos:
		// Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
	    // Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e
		// A[5] do vetor e mostre na tela esta soma.
	    // Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100.
		// Mostre na tela cada valor do vetor A, um em cada linha.


		int [] a = {1, 0, 5, -2, -5, 7};
		
		
		int simples = a [0] + a [1] + a [5];
		
		System.out.printf("A soma dos Vetores na posi��o 0, 1, 5 �: %d\n", simples);
		
		a [4] = 100;
		
		System.out.println("Os n�meros COntidos Nos Ind�ces do Vetor �:");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
