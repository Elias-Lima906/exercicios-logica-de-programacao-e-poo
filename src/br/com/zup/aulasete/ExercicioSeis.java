package br.com.zup.exercicios.aulasete;

import java.util.Scanner;

public class ExercicioSeis {

	public static int somaRecursao(int soma) {
		if (soma == 1) {
			return soma;
		}

		return soma + somaRecursao(soma - 1);
	}

	public static void main(String[] args) {
		// Crie uma função recursiva que receba um número inteiro
		// positivo N e calcule o somatório dos numeros de 1 a N.

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite Um Número E Te Direi A Soma Dos Seus Antecessores De 1 Até N.\n");

		System.out.printf("Digite Um Numero: ");
		int numeroLido = teclado.nextInt();

		System.out.printf("\nA Soma Dos Números De 1 Até %d Foi: %d", numeroLido, somaRecursao(numeroLido));

		teclado.close();

	}

}
