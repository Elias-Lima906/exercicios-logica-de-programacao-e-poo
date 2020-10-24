package br.com.zup.auladois;

import java.util.Scanner;

public class ExercicioQuinze {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Faça um programa que mostre ao usuário um menu com 4
		// opcões de operacões matemáticas (as básicas, por exemplo).
		// O usuário escolhe uma das opcções e o seu programa entao pede dois
		// valores numéricos e realiza a operação, mostrando o resultado e saindo.

		Scanner teclado = new Scanner(System.in);
		int operacao;
		int opcao;
		do {
			System.out.println("1 - Soma");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicaçao");
			System.out.println("4 - Divisão");
			System.out.println("5 - Potenciação");
			System.out.println("6 - Sair da Calculadora");
			operacao = teclado.nextInt();

			if (operacao < 0 || operacao > 6) {
				System.out.println("Opção Inválida, Tente Novamente!");
				System.out.println("\n");
				continue;

			} else {

				if (operacao == 6) {
					System.out.println("Muito Obrigado, e Até Logo!");
					return;
				}

				System.out.println("Digite o 1° Número");
				double valorLidoUm = teclado.nextFloat();

				System.out.println("Digite o 2° Número");
				double valorLidoDois = teclado.nextFloat();

				double resultado = 0;

				switch (operacao) {
				case 1:
					resultado = valorLidoUm + valorLidoDois;
					System.out.printf("O resultado é %.0f", resultado);
					System.out.println("\n");
					break;

				case 2:
					System.out.println("Digite 1 Se Quer Que O 1° Número Seja O Minuendo.");
					System.out.println("Digite 2 Se Quer Que O 2° Número Seja O Minuendo.");
					opcao = teclado.nextInt();

					switch (opcao) {
					case 1:
						resultado = valorLidoUm - valorLidoDois;
						System.out.printf("O resultado é %.0f \n", resultado);
						System.out.println("\n");
						break;
					case 2:
						resultado = valorLidoDois - valorLidoUm;
						System.out.printf("O resultado é %.0f \n", resultado);
						System.out.println("\n");
						break;
					}
					break;

				case 3:
					resultado = valorLidoUm * valorLidoDois;
					System.out.printf("O resultado é %.0f \n", resultado);
					System.out.println("\n");
					break;

				case 4:
					System.out.println("Digite 1 Se Quer Que O 1° Número Seja O Divisor.");
					System.out.println("Digite 2 Se Quer Que O 2° Número Seja O Divisor.");
					opcao = teclado.nextInt();

					switch (opcao) {
					case 1:

						if (valorLidoUm == 0 || valorLidoDois == 0) {
							System.out.println("Não é Possível dividir por 0");
						} else {
							resultado = valorLidoUm / valorLidoDois;
							System.out.printf("O resultado é %.1f \n", resultado);
							System.out.println("\n");
							break;
						}

					case 2:

						if (valorLidoUm == 0 || valorLidoDois == 0) {
							System.out.println("Não é Possível dividir por 0");
						} else {
							resultado = valorLidoDois / valorLidoUm;
							System.out.printf("O resultado é %.1f \n", resultado);
							System.out.println("\n");
							break;
						}

					}
					break;

				case 5:
					resultado = Math.pow(valorLidoUm, valorLidoDois);
					System.out.printf("O resultado é %.0f \n", resultado);
					System.out.println("\n");
					break;
				}
			}
		} while (operacao != 6);
		teclado.close();
	}

}
