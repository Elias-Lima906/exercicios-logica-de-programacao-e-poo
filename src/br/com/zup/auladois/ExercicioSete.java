package br.com.zup.exercicios.auladois;

import java.util.Scanner;

public class ExercicioSete {

	public static void main(String[] args) {
		// Fa�a um Programa que pe�a um valor e mostre na tela
		// se o valor � positivo ou negativo.
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um n�mero e te direi se ele � positivo ou negativo");

		int valorLido = teclado.nextInt();

		if (valorLido >= 0) {
			System.out.println("O n�mero digitado � Posit�vo");

		} else
			System.out.println("O n�mero digitado � Negat�vo");
		teclado.close();
	}
}
