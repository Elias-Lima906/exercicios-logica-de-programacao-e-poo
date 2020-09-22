package br.com.zup.exercicios.aulatres;

import java.util.Scanner;

public class ExercicioSete {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Fa�a um programa que some os numeros �mpares contidos em um intervalo
		// definido pelo usu�rio. O usu�rio define o valor inicial do intervalo
		// e o valor final deste intervalo e o programa deve somar todos os numeros
		// �mpares contidos neste intervalo. Caso o usu�rio digite um
		// intervalo inv�lido (come�ando por um valor maior que o valor final)
		// deve ser escrito uma mensagem de erro na tela,
		// �Intervalo de valores inv�lido� e o programa termina.

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite Abaixo 2 Valores e eu te direi qual a soma dos N�meros nesse intervalo.");
		System.out.println("Digite o primeiro n�mero");
		int valorLidoUm = teclado.nextInt();
		System.out.println("Digite o segundo n�mero");
		int valorLidoDois = teclado.nextInt();
		int soma = 0;

		if (valorLidoUm > valorLidoDois) {
			System.out.println("Intervalo de valores inv�lido.");
			return;
		}

		for (int i = valorLidoUm; i <= valorLidoDois; i++) {

			if (i % 2 != 0) {
				soma += i;
			}
		}
		System.out.printf("A soma dos N�meros �mpares no inter valo de %d at� %d foi %d", valorLidoUm, valorLidoDois,
				soma);
		teclado.close();
	}

}
