package br.com.zup.aulatres;

import java.util.Scanner;

public class EercicoOito {
	public static void main(String[] args) {
		// Fa�a um programa que pe�a um n�mero inteiro e determine
		// se ele � ou n�o um n�mero primo Um n�mero primo � aquele
		// que � divis�vel somente por ele mesmo e por 1.

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite Um N�mero E te Direi Se Ele � Ou N�o Um N�mero Primo.");

		int numeroLido = teclado.nextInt();
		int contador = 0;
		for (int i = 2; i < numeroLido; i++) {

			if (numeroLido % i == 0) {
				contador += 1;
			}
		}

		if (contador == 0) {
			System.out.println("O N�mero Digitado � Um N�mero Primo");

		} else {
			System.out.println("O N�mero Digitado N�o � Um N�mero Primo");
		}
		teclado.close();

	}
}
