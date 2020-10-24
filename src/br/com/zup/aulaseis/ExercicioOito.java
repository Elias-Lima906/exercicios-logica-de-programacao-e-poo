package br.com.zup.aulaseis;

import java.util.Scanner;

public class ExercicioOito {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia um vetor de 8 posições e, em seguida, leia também
		 * dois valores X e Y quaisquer correspondentes a duas posiçoes no vetor. Ao
		 * final seu programa deverá escrever a soma dos valores encontrados nas
		 * respectivas posições X e Y.
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println(
				"Ola, Abaixo Digite 8 Números e Depois Duas Cordenadas de 1 a 8 e te Direi Qual Número Você Digitou Naquela Posição.");

		int[] coords = new int[8];
		int x = 0, y = 0;

		for (int i = 0; i < coords.length; i++) {
			System.out.printf("\nDigite Um Número (Cordenada %d): ", i);
			coords[i] = teclado.nextInt();
		}
		do {
			System.out.print("\nDigite a Primeira Cordenada: ");
			x = teclado.nextInt();

			System.out.print("\nDigite a Segunda Cordenada: ");
			y = teclado.nextInt();
			if (x < 0 || x > 7 || y < 0 || y > 7) {
				System.out.println("\n Opcão Invalida, Digite Uma Cordenada Entre 0 E 7.\n");
			}
		} while (x < 0 || x > 7 || y < 0 || y > 7);

		int somaDosIndices = coords[x] + coords[y];
		System.out.printf("\nA soma dos Valores Nas Respectivas Coordenadas %d e %d É: %d\n", x, y, somaDosIndices);

		teclado.close();

	}

}
