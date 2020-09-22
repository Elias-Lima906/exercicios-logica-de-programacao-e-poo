package br.com.zup.exercicios.aulatres;

import java.util.Scanner;

public class ExercicioSete {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Faça um programa que some os numeros ímpares contidos em um intervalo
		// definido pelo usuário. O usuário define o valor inicial do intervalo
		// e o valor final deste intervalo e o programa deve somar todos os numeros
		// ímpares contidos neste intervalo. Caso o usuário digite um
		// intervalo inválido (começando por um valor maior que o valor final)
		// deve ser escrito uma mensagem de erro na tela,
		// “Intervalo de valores inválido” e o programa termina.

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite Abaixo 2 Valores e eu te direi qual a soma dos Números nesse intervalo.");
		System.out.println("Digite o primeiro número");
		int valorLidoUm = teclado.nextInt();
		System.out.println("Digite o segundo número");
		int valorLidoDois = teclado.nextInt();
		int soma = 0;

		if (valorLidoUm > valorLidoDois) {
			System.out.println("Intervalo de valores inválido.");
			return;
		}

		for (int i = valorLidoUm; i <= valorLidoDois; i++) {

			if (i % 2 != 0) {
				soma += i;
			}
		}
		System.out.printf("A soma dos Números ímpares no inter valo de %d até %d foi %d", valorLidoUm, valorLidoDois,
				soma);
		teclado.close();
	}

}
