package br.com.zup.exercicios.auladois;

import java.util.Scanner;

public class ExercicioOnze {

	public static void main(String[] args) {
		// Faça um Programa que leia três números e mostre o maior deles.

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite Dois Números e Te DIrei Qual É Maior ");

		System.out.println("Digite o 1° Número");
		int valorLidoUm = teclado.nextInt();

		System.out.println("Digite o 2° Número");
		int valorLidoDois = teclado.nextInt();

		System.out.println("Digite o 23 Número");
		int valorLidoTres = teclado.nextInt();

		if (valorLidoUm > valorLidoDois && valorLidoUm > valorLidoTres) {
			System.out.printf("O Maior Número Digitado Foi %d", valorLidoUm);

		} else if (valorLidoDois > valorLidoUm && valorLidoDois > valorLidoTres) {
			System.out.printf("O Maior Número Digitado Foi %d", valorLidoDois);

		} else {
			System.out.printf("O Maior Número Digitado Foi %d", valorLidoTres);

		}
		teclado.close();
	}
}
