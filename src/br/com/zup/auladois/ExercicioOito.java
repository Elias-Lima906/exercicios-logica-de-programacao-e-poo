package br.com.zup.auladois;
import java.util.Scanner;

public class ExercicioOito {

	public static void main(String[] args) {
		// Escreva um programa que, dados dois números inteiros,
		// mostre na tela o maior deles, assim como a diferença existente entre ambos.

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite DOis Numeros e te direi o maior e a diferença entre eles");

		int valorLidoUm = teclado.nextInt();

		int valorLidoDois = teclado.nextInt();

		int diferencaEntreEles = valorLidoUm - valorLidoDois;

		int diferencaEntreElesDois = valorLidoDois - valorLidoUm;

		if (valorLidoUm >= valorLidoDois) {
			System.out.printf("O maior número digitado foi %d e a Difereça entre eles é %d", valorLidoUm,
					diferencaEntreEles);

		} else {
			System.out.printf("O maior número digitado foi %d e a Difereça entre eles é %d", valorLidoDois,
					diferencaEntreElesDois);

		}
		teclado.close();
	}

}
