package br.com.zup.exercicios.aulatres;

public class ExercicioUm {

	public static void main(String[] args) {
		// Escreva um programa que escreva na tela, de 1 até 100,
		// de 1 em 1, 3 vezes. A primeira vez com
		// "for", a segunda com "while" e a terceira com "do while".
		System.out.println("Impessão com While");
		int j = 1;
		while (j <= 100) {

			System.out.println(j);
			j++;
		}
		System.out.println("Impessão com For");
		for (int i = 1; i < 101; i++) {

			System.out.println(i);
		}

		System.out.println("Impressão com Do While");
		int k = 1;
		do {
			System.out.println(k);
			k++;
		} while (k <= 100);

	}
}