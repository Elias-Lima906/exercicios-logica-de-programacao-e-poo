package br.com.zup.aulatres;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		// Fa�a um programa que leia um n�mero inteiro positivo
		// n e calcule a soma dos n primeiros n�meros naturais.
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite Um N�mero e te Direi a Soma Dos N�meros At� Ele.");
		int numeroLido = teclado.nextInt();
		int soma = 0;
		for (int i = 0; i <= numeroLido; i++) {
			soma += i;

		}
		System.out.printf("A soma dos %d primeiros N�meros naturais foi %d.", numeroLido, soma);
		teclado.close();
	}

}
