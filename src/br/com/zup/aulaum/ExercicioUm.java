package br.com.zup.aulaum;

import java.util.Scanner;

// Faça um programa que leia um numero inteiro e o imprima

public class ExercicioUm {

	public static void main(String[] args) {

		int numeroLido;

		System.out.println("Digite um numero\n");

		Scanner teclado = new Scanner(System.in);

		numeroLido = teclado.nextInt();

		System.out.printf("O numero digitado foi %d", numeroLido);

		teclado.close();
	}

}
