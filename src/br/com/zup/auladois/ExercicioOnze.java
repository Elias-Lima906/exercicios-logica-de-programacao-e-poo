package br.com.zup.exercicios.auladois;

import java.util.Scanner;

public class ExercicioOnze {

	public static void main(String[] args) {
		// Fa�a um Programa que leia tr�s n�meros e mostre o maior deles.

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite Dois N�meros e Te DIrei Qual � Maior ");

		System.out.println("Digite o 1� N�mero");
		int valorLidoUm = teclado.nextInt();

		System.out.println("Digite o 2� N�mero");
		int valorLidoDois = teclado.nextInt();

		System.out.println("Digite o 23 N�mero");
		int valorLidoTres = teclado.nextInt();

		if (valorLidoUm > valorLidoDois && valorLidoUm > valorLidoTres) {
			System.out.printf("O Maior N�mero Digitado Foi %d", valorLidoUm);

		} else if (valorLidoDois > valorLidoUm && valorLidoDois > valorLidoTres) {
			System.out.printf("O Maior N�mero Digitado Foi %d", valorLidoDois);

		} else {
			System.out.printf("O Maior N�mero Digitado Foi %d", valorLidoTres);

		}
		teclado.close();
	}
}