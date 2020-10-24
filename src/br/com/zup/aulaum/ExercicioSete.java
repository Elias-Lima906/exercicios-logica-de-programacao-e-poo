package br.com.zup.aulaum;

import java.util.Scanner;

public class ExercicioSete {

	public static void main(String[] args) {
		// leia um número inteiro e imprima o seu sucessor e o seu antecessor.

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite Um Número e te Direi Qual é Seu Sucessor e Seu Antecessor.");
		int numeroLido = teclado.nextInt();

		int sucessor = numeroLido + 1;
		int antecessor = numeroLido - 1;

		System.out.printf("O Número Digitado Foi %d O Seu Antecessor é %d E Seu Sucessor é %d", numeroLido, antecessor,
				sucessor);

		teclado.close();
	}

}
