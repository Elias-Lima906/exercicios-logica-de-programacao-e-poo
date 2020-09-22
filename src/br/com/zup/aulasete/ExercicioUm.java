package br.com.zup.exercicios.aulasete;

import java.util.Scanner;

public class ExercicioUm {

	public static int retornaDobro(int dobro) {

		return dobro * 2;
	}

	public static void main(String[] args) {
		// Crie uma função que recebe como parâmetro um número inteiro e devolve o seu
		// dobro.

		Scanner teclado = new Scanner(System.in);
		System.out.println("Olá Usuário : )");

		System.out.println("Digite Um Número");
		int numeroLido = teclado.nextInt();

		System.out.printf("\nO dobro do número digitado é: %d", retornaDobro(numeroLido));
		
		teclado.close();
	}

}
