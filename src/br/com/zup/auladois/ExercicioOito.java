package br.com.zup.auladois;
import java.util.Scanner;

public class ExercicioOito {

	public static void main(String[] args) {
		// Escreva um programa que, dados dois n�meros inteiros,
		// mostre na tela o maior deles, assim como a diferen�a existente entre ambos.

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite DOis Numeros e te direi o maior e a diferen�a entre eles");

		int valorLidoUm = teclado.nextInt();

		int valorLidoDois = teclado.nextInt();

		int diferencaEntreEles = valorLidoUm - valorLidoDois;

		int diferencaEntreElesDois = valorLidoDois - valorLidoUm;

		if (valorLidoUm >= valorLidoDois) {
			System.out.printf("O maior n�mero digitado foi %d e a Difere�a entre eles � %d", valorLidoUm,
					diferencaEntreEles);

		} else {
			System.out.printf("O maior n�mero digitado foi %d e a Difere�a entre eles � %d", valorLidoDois,
					diferencaEntreElesDois);

		}
		teclado.close();
	}

}
