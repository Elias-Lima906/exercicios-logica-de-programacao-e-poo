package br.com.zup.aulatres;

import java.util.Scanner;

public class EercicoOito {
	public static void main(String[] args) {
		// Faça um programa que peça um número inteiro e determine
		// se ele é ou não um número primo Um número primo é aquele
		// que é divisível somente por ele mesmo e por 1.

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite Um Número E te Direi Se Ele é Ou Não Um Número Primo.");

		int numeroLido = teclado.nextInt();
		int contador = 0;
		for (int i = 2; i < numeroLido; i++) {

			if (numeroLido % i == 0) {
				contador += 1;
			}
		}

		if (contador == 0) {
			System.out.println("O Número Digitado é Um Número Primo");

		} else {
			System.out.println("O Número Digitado Não é Um Número Primo");
		}
		teclado.close();

	}
}
