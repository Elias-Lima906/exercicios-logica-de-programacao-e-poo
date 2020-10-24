package br.com.zup.aulaum;

import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		// leia o tamanho do lado de um quadrado e imprima como
		// resultado a sua área.

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o tamanho de um dos lados do quadrado:");

		float ladoDoQuadrado = teclado.nextFloat();

		float area = ladoDoQuadrado * ladoDoQuadrado;

		System.out.printf("A Área Equivalente ao Tamanho Do lado Digitado É %.2f.", area);

		teclado.close();
	}

}
