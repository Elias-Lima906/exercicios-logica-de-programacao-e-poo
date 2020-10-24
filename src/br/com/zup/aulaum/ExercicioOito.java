package br.com.zup.aulaum;

import java.util.Scanner;

public class ExercicioOito {

	public static void main(String[] args) {
		// Leia Um número inteiro e imprima a soma do sucessor se seu triplo com o
		// antecessor de seu dobro.

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite Um Número E te Direi o Sucessor de Seu Triplo e o Antecessor de Seu Dobro");
		int numeroLido = teclado.nextInt();

		int soma = ((numeroLido * 3) + 1) + ((numeroLido * 2) - 1);

		System.out.printf("A Soma Do Sucessor do Triplo De %d E o Antecessor Do Dobro de %d É: %d ", numeroLido,
				numeroLido, soma);

		teclado.close();
	}
}
