package br.com.zup.exercicios.auladois;

import java.util.Scanner;

public class ExercicioSeis {
	public static void main(String[] args) {
		// Fa�a um programa que receba dois n�meros e mostre qual deles � o maior.

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite Dois N�meros e Te DIrei Qual � Maior ");

		System.out.println("Digite o 1� N�mero");
		int valorLidoUm = teclado.nextInt();

		System.out.println("Digite o 2� N�mero");
		int valorLidoDois = teclado.nextInt();

		if (valorLidoUm >= valorLidoDois) {
			System.out.printf("O Maior N�mero Digitado Foi %d", valorLidoUm);

		} else {
			System.out.printf("O Maior N�mero Digitado Foi %d", valorLidoDois);
		}
		teclado.close();
	}
}
