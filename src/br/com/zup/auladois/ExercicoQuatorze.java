package br.com.zup.exercicios.auladois;

import java.util.Scanner;

public class ExercicoQuatorze {

	public static void main(String[] args) {
		// Usando switch, escreva um programa que leia um inteiro entre
		// 1 e 7 e imprima o dia da semana correspondente a este numero.
		// Isto e, domingo se 1, segunda-feira se 2, e assim por diante.

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite Um N�mero de 1 a 7 e te direi a qual dia da semana ele corresponde:");
		int diaDaSemana = teclado.nextInt();

		switch (diaDaSemana) {
		case 1:
			System.out.println("Domingo");
			break;

		case 2:
			System.out.println("Segunda-Feira");
			break;
		case 3:
			System.out.println("Ter�a-Feira");
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
			System.out.println("Sab�do");
			break;
		default:
			System.out.println("Op��o Indispon�vel");
			break;
		}
		teclado.close();

	}

}
