package br.com.zup.exercicios.aulacinco;

import java.util.Scanner;

public class ExercicoUm {

	public static void main(String[] args) {
		// Faça um programa para imprimir:
		/*
		 * 1 
		 * 2 2 
		 * 3 3 3 ..... 
		 * n n n n n n ... n
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println("Olá, Digite Um número Inteiro: ");
		int numeroLido = teclado.nextInt();

		int i, j;
		for (i = 1; i <= numeroLido; i++) {
			for (j = 1; j <= i; j++) {
				if (i < 10) {
					System.out.printf("   %d", i);
				} else {
					System.out.printf("  %d", i);
				}
			}
			System.out.println();
		}
	}
}
