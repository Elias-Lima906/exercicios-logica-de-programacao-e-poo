package br.com.zup.auladois;

import java.util.Scanner;

public class ExercicioQuinze {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Fa�a um programa que mostre ao usu�rio um menu com 4
		// opc�es de operac�es matem�ticas (as b�sicas, por exemplo).
		// O usu�rio escolhe uma das opc��es e o seu programa entao pede dois
		// valores num�ricos e realiza a opera��o, mostrando o resultado e saindo.

		Scanner teclado = new Scanner(System.in);
		int operacao;
		int opcao;
		do {
			System.out.println("1 - Soma");
			System.out.println("2 - Subtra��o");
			System.out.println("3 - Multiplica�ao");
			System.out.println("4 - Divis�o");
			System.out.println("5 - Potencia��o");
			System.out.println("6 - Sair da Calculadora");
			operacao = teclado.nextInt();

			if (operacao < 0 || operacao > 6) {
				System.out.println("Op��o Inv�lida, Tente Novamente!");
				System.out.println("\n");
				continue;

			} else {

				if (operacao == 6) {
					System.out.println("Muito Obrigado, e At� Logo!");
					return;
				}

				System.out.println("Digite o 1� N�mero");
				double valorLidoUm = teclado.nextFloat();

				System.out.println("Digite o 2� N�mero");
				double valorLidoDois = teclado.nextFloat();

				double resultado = 0;

				switch (operacao) {
				case 1:
					resultado = valorLidoUm + valorLidoDois;
					System.out.printf("O resultado � %.0f", resultado);
					System.out.println("\n");
					break;

				case 2:
					System.out.println("Digite 1 Se Quer Que O 1� N�mero Seja O Minuendo.");
					System.out.println("Digite 2 Se Quer Que O 2� N�mero Seja O Minuendo.");
					opcao = teclado.nextInt();

					switch (opcao) {
					case 1:
						resultado = valorLidoUm - valorLidoDois;
						System.out.printf("O resultado � %.0f \n", resultado);
						System.out.println("\n");
						break;
					case 2:
						resultado = valorLidoDois - valorLidoUm;
						System.out.printf("O resultado � %.0f \n", resultado);
						System.out.println("\n");
						break;
					}
					break;

				case 3:
					resultado = valorLidoUm * valorLidoDois;
					System.out.printf("O resultado � %.0f \n", resultado);
					System.out.println("\n");
					break;

				case 4:
					System.out.println("Digite 1 Se Quer Que O 1� N�mero Seja O Divisor.");
					System.out.println("Digite 2 Se Quer Que O 2� N�mero Seja O Divisor.");
					opcao = teclado.nextInt();

					switch (opcao) {
					case 1:

						if (valorLidoUm == 0 || valorLidoDois == 0) {
							System.out.println("N�o � Poss�vel dividir por 0");
						} else {
							resultado = valorLidoUm / valorLidoDois;
							System.out.printf("O resultado � %.1f \n", resultado);
							System.out.println("\n");
							break;
						}

					case 2:

						if (valorLidoUm == 0 || valorLidoDois == 0) {
							System.out.println("N�o � Poss�vel dividir por 0");
						} else {
							resultado = valorLidoDois / valorLidoUm;
							System.out.printf("O resultado � %.1f \n", resultado);
							System.out.println("\n");
							break;
						}

					}
					break;

				case 5:
					resultado = Math.pow(valorLidoUm, valorLidoDois);
					System.out.printf("O resultado � %.0f \n", resultado);
					System.out.println("\n");
					break;
				}
			}
		} while (operacao != 6);
		teclado.close();
	}

}
