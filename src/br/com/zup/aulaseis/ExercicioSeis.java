package br.com.zup.aulaseis;

import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		// Crie um programa que lê 6 valores inteiros e, em seguida, mostre na tela os
		// valores lidos.

		Scanner teclado = new Scanner(System.in);

		int[] valoresLidos = new int[6];

		for (int i = 0; i < valoresLidos.length; i++) {

			System.out.printf("Digite o %d° numero: ", i + 1);

			valoresLidos[i] = teclado.nextInt();
		}

		for (int numero : valoresLidos) {
			System.out.println(numero);
		}

		teclado.close();

	}

}
