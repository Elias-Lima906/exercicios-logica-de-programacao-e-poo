package br.com.zup.exercicios.auladois;

import java.util.Scanner;

public class ExercicioSeis {
	public static void main(String[] args) {
		// Faça um programa que receba dois números e mostre qual deles é o maior.

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite Dois Números e Te DIrei Qual É Maior ");

		System.out.println("Digite o 1° Número");
		int valorLidoUm = teclado.nextInt();

		System.out.println("Digite o 2° Número");
		int valorLidoDois = teclado.nextInt();

		if (valorLidoUm >= valorLidoDois) {
			System.out.printf("O Maior Número Digitado Foi %d", valorLidoUm);

		} else {
			System.out.printf("O Maior Número Digitado Foi %d", valorLidoDois);
		}
		teclado.close();
	}
}
