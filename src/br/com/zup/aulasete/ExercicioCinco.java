package br.com.zup.exercicios.aulasete;

import java.util.Scanner;

public class ExercicioCinco {

	public static int fatorialSemRecursao(int numeroFatorial) {
		int fat = 1;

		for (int i = numeroFatorial; i > 1; i--) {

			fat = fat * i;
		}
		return fat;
	}

	public static int fatorialRecursao(int numeroFatorial) {
		if (numeroFatorial == 1) {
			return numeroFatorial;
		}
		return numeroFatorial * fatorialRecursao(numeroFatorial - 1);
	}

	public static void main(String[] args) {
		// Faça um algoritmo que receba um numero inteiro positivo n
		// e calcule o seu fatorial, depois refaça de forma recursiva.

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite Um Numero Abaixo e Te Direi O Fatorial:");

		System.out.print("\nDigite Um Número: ");
		int fatorialLaco = teclado.nextInt();

		System.out.printf("\nO Fatorial de %d é: %d", fatorialLaco, fatorialSemRecursao(fatorialLaco));

		System.out.print("\n\nDigite Mais Um Número: ");
		int fatorialRecursao = teclado.nextInt();

		System.out.printf("\nO Fatorial de %d é: %d", fatorialRecursao, fatorialRecursao(fatorialRecursao));

		teclado.close();
	}

}
