package br.com.zup.aulaum;

import java.util.Scanner;

public class ExercicioSete {

	public static void main(String[] args) {
		// leia um n�mero inteiro e imprima o seu sucessor e o seu antecessor.

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite Um N�mero e te Direi Qual � Seu Sucessor e Seu Antecessor.");
		int numeroLido = teclado.nextInt();

		int sucessor = numeroLido + 1;
		int antecessor = numeroLido - 1;

		System.out.printf("O N�mero Digitado Foi %d O Seu Antecessor � %d E Seu Sucessor � %d", numeroLido, antecessor,
				sucessor);

		teclado.close();
	}

}
