package br.com.zup.aulatres;

import java.util.Scanner;

public class ExercicoDois {

	public static void main(String[] args) {
		// Fa�a um programa que leia n inteiros e imprima sua m�dia.
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ol� Usu�rio.");
		System.out.println("Digite a quantidade de notas que deseja tirar a media.");
		int numeroLido = teclado.nextInt();
		float soma = 0;
		for (int i = 0; i < numeroLido; i++) {
			System.out.printf("Digite a %d� Nota: ", i + 1);
			float nota = teclado.nextFloat();
			soma += nota;
		}
		float resultado = soma / (float) numeroLido;
		System.out.printf("A m�dia do aluno � %.2f", resultado);
		teclado.close();
	}

}
