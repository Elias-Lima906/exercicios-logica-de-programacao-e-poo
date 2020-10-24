package br.com.zup.aulasete;

import java.util.Scanner;

public class ExercicioTres {

	public static float converteParaFarenheit(float celsius) {

		return (float) ((1.8 * celsius) + 32f);
	}

	public static void main(String[] args) {
		// Fa�a uma fun��o que receba uma temperatura em
		// graus Celsius e retorne-a convertida em graus Fahrenheit.

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ol� Us�aroio, Digite Abaixo Um Valor Em �C e Transformarei Para �F.");

		System.out.print("\nDigite A Temperatura Em �C: ");

		float celsiusLido = teclado.nextFloat();

		System.out.printf("\nA Temperatura Em �F �: %.1f�", converteParaFarenheit(celsiusLido));

		teclado.close();

	}

}
