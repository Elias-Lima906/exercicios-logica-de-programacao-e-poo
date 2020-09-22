package br.com.zup.exercicios.aulaum;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		// Leia um numero real e imprima a quinta parte deste número.

		float numeroLido;
		float resultado;

		System.out.println("Digite Um Numero E te Direi a Quinta Parte Dele");

		Scanner teclado = new Scanner(System.in);

		numeroLido = teclado.nextFloat();

		resultado = numeroLido / 5;

		System.out.printf("A quinta Parte do numero digitado é %f", resultado);

		teclado.close();
	}

}
