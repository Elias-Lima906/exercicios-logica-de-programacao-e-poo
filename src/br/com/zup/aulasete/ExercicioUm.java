package br.com.zup.exercicios.aulasete;

import java.util.Scanner;

public class ExercicioUm {

	public static int retornaDobro(int dobro) {

		return dobro * 2;
	}

	public static void main(String[] args) {
		// Crie uma fun��o que recebe como par�metro um n�mero inteiro e devolve o seu
		// dobro.

		Scanner teclado = new Scanner(System.in);
		System.out.println("Ol� Usu�rio : )");

		System.out.println("Digite Um N�mero");
		int numeroLido = teclado.nextInt();

		System.out.printf("\nO dobro do n�mero digitado �: %d", retornaDobro(numeroLido));
		
		teclado.close();
	}

}
