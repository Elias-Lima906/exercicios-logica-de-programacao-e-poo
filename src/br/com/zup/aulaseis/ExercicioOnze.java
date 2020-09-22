package br.com.zup.exercicios.aulaseis;

import java.util.Scanner;

public class ExercicioOnze {

	public static void main(String[] args) {
		// Escreva um programa que leia 10 numeros inteiros e os armazene em um vetor.
		// Imprima o vetor, o maior elemento e a posi��o que ele se encontra.

		Scanner teclado = new Scanner(System.in);

		int[] numeroLido = new int[10];
		int maiorValor = Integer.MIN_VALUE;
		int posicaoIndice = 0;

		System.out.println("Digite Um N�mero Abaixo e Veja a M�gica:\n");

		for (int i = 0; i < numeroLido.length; i++) {

			System.out.printf("Digite Um N�mero (�ndice %d): ", i);

			numeroLido[i] = teclado.nextInt();

			if (numeroLido[i] > maiorValor) {
				maiorValor = numeroLido[i];
				posicaoIndice = i;
			}
		}

		System.out.println("\nOs N�meros DIgitados Foram: ");
		for (int indice : numeroLido) {
			System.out.printf("%d, ", indice);

		}

		System.out.printf("\n\nO Maior N�mero Digitado Foi: %d", maiorValor);

		System.out.printf("\nO Maior N�mero Se Encontra No �ndice %d Do Vetor.", posicaoIndice);

		teclado.close();
	}
}
