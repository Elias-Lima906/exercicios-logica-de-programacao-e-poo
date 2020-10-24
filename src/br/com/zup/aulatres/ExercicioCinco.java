package br.com.zup.aulatres;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		// Faça um programa que leia um número inteiro positivo
		// n e calcule a soma dos n primeiros números naturais.
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite Um Número e te Direi a Soma Dos Números Até Ele.");
		int numeroLido = teclado.nextInt();
		int soma = 0;
		for (int i = 0; i <= numeroLido; i++) {
			soma += i;

		}
		System.out.printf("A soma dos %d primeiros Números naturais foi %d.", numeroLido, soma);
		teclado.close();
	}

}
