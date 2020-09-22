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
		// Crie uma fun��o recursiva que receba um n�mero inteiro
		// positivo N e calcule o somat�rio dos numeros de 1 a N.

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite Um N�mero E Te Direi A Soma Dos Seus Antecessores De 1 At� N.\n");

		System.out.printf("Digite Um Numero: ");
		int numeroLido = teclado.nextInt();

		System.out.printf("\nA Soma Dos N�meros De 1 At� %d Foi: %d", numeroLido, somaRecursao(numeroLido));

		teclado.close();

	}

}
