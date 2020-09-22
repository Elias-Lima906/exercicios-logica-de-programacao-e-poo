package br.com.zup.exercicios.auladois;

import java.util.Scanner;

public class ExercicoQuatorze {

	public static void main(String[] args) {
		// Usando switch, escreva um programa que leia um inteiro entre
		// 1 e 7 e imprima o dia da semana correspondente a este numero.
		// Isto e, domingo se 1, segunda-feira se 2, e assim por diante.

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite Um Número de 1 a 7 e te direi a qual dia da semana ele corresponde:");
		int diaDaSemana = teclado.nextInt();

		switch (diaDaSemana) {
		case 1:
			System.out.println("Domingo");
			break;

		case 2:
			System.out.println("Segunda-Feira");
			break;
		case 3:
			System.out.println("Terça-Feira");
			break;
		case 4:
			System.out.println("Quarta-Feira");
			break;
		case 5:
			System.out.println("Quinta-Feira");
			break;
		case 6:
			System.out.println("Sexta-Feira");
			break;
		case 7:
			System.out.println("Sabádo");
			break;
		default:
			System.out.println("Opção Indisponível");
			break;
		}
		teclado.close();

	}

}
