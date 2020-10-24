package br.com.zup.aulatres;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		// Escreva um programa que leia 10 n�meros e escreva o
		// menor valor lido e o maior valor lido.

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ol�, Digite 10 N�meros");
		
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite o %d� N�mero: ", i + 1);
			int numeroLido = teclado.nextInt();

			if (numeroLido < menor) {
				menor = numeroLido;
			}
			if (numeroLido > maior) {
				maior = numeroLido;
			}
		}
		
		System.out.printf("O menor numero digitado foi %d e o maior foi %d", menor, maior);
		
		teclado.close();
	}

}
