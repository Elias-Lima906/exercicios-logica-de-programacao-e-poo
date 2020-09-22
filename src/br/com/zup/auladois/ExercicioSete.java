package br.com.zup.exercicios.auladois;

import java.util.Scanner;

public class ExercicioSete {

	public static void main(String[] args) {
		// Faça um Programa que peça um valor e mostre na tela
		// se o valor é positivo ou negativo.
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um número e te direi se ele é positivo ou negativo");

		int valorLido = teclado.nextInt();

		if (valorLido >= 0) {
			System.out.println("O número digitado é Positívo");

		} else
			System.out.println("O número digitado é Negatívo");
		teclado.close();
	}
}
