package br.com.zup.aulaum;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		// 4. Leia um numero real e imprima o resultado do quadrado desse número.

		float quadrado;
		float numeroLido;

		System.out.println("Digite um Numero");

		Scanner teclado = new Scanner(System.in);

		numeroLido = teclado.nextFloat();

		quadrado = numeroLido * numeroLido;

		System.out.printf("o quadrado do numero digitado é %f", quadrado);

		teclado.close();
	}

}
