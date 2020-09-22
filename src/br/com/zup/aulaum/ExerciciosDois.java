package br.com.zup.exercicios.aulaum;

import java.util.Scanner;

//	Faça um programa que leia um numero real e o imprima.

public class ExerciciosDois {

	public static void main(String[] args) {

		float decimal;

		System.out.println("Digite Um Numero");

		Scanner teclado = new Scanner(System.in);

		decimal = teclado.nextFloat();

		System.out.printf("O numero Digitado foi %f", decimal);

		teclado.close();
	}
}
