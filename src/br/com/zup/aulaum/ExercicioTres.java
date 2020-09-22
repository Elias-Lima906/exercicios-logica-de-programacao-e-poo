package br.com.zup.exercicios.aulaum;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		// Peça ao usuario para digitar três valores inteiros e imprima a soma deles.

		System.out.println("Digite tes numeros");

		int valorUm;
		int valorDois;
		int valorTres;

		Scanner teclado = new Scanner(System.in);

		valorUm = teclado.nextInt();
		valorDois = teclado.nextInt();
		valorTres = teclado.nextInt();

		int soma = valorUm + valorDois + valorTres;

		System.out.printf("A soma dos numeros digitados foi %d", soma);

		teclado.close();
	}

}
