package br.com.zup.exercicios.aulaseis;

import java.util.Scanner;

public class ExercicioNove {

	public static void main(String[] args) {
		// Leia um vetor de 10 posi�oes. Contar e escrever quantos valores pares ele
		// possui.

		Scanner teclado = new Scanner(System.in);

		int[] valorLidoPar = new int[10];
		int contador = 0;

		System.out.println("Ol�, Digite Abaixo 10 N�meros  te Mostrarei S� Os N�meros Pares Digitados:\n");

		for (int i = 0; i < valorLidoPar.length; i++) {

			System.out.printf("\nDigite O %d� N�mero: ", i + 1);

			valorLidoPar[i] = teclado.nextInt();
		}

		System.out.println("\nOs Numeros Pares Digitados Foram:");

		for (int indice : valorLidoPar) {
			if (indice % 2 == 0) {
				contador += 1;
				System.out.printf("%d, ", indice);

			}
		}

		System.out.printf("\n\nA Quantidade De Pares Foi : %d", contador);
		teclado.close();
	}

}
