package br.com.zup.aulaseis;

import java.util.Scanner;

public class ExercicioDez {

	public static void main(String[] args) {
		// Faça um programa que receba do usuario um vetor com 10 posições.
		// Em seguida deverá ser impresso o maior e o menor elemento do vetor.

		Scanner teclado = new Scanner(System.in);

		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int[] valorLido = new int[10];

		System.out.println("Digite Abaixo 10 Números E Te Direi O Maior e o Menor:\n");

		for (int i = 0; i < valorLido.length; i++) {

			System.out.printf("\nDigite o %d° Número: ", i + 1);
			valorLido[i] = teclado.nextInt();

			if (valorLido[i] > maior) {
				maior = valorLido[i];
			}
			if (valorLido[i] < menor) {
				menor = valorLido[i];
			}
		}

		System.out.printf("\nO Menor Número Digitado Foi %d: ", menor);

		System.out.printf("\nO Maior Número Digitado Foi %d: ", maior);

		teclado.close();
	}
}
