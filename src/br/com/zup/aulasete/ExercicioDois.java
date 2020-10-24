package br.com.zup.aulasete;

import java.util.Scanner;

public class ExercicioDois {

	public static int converteParaSegundo(int horas, int minutos, int segundos) {
		return (horas * 3600) + (minutos * 60) + segundos;

	}

	public static void main(String[] args) {
		// Faça uma função que receba 3 números inteiros como parâmetro,
		// representando horas, minutos e segundos, e os converta em segundos

		Scanner teclado = new Scanner(System.in);

		int [] numeroLido = new int [3];
		int soma = 0;
		
		System.out.println(
				"Digite Abaixo Três Valores o 1° em Hrs, o 2° em Min, e o 3° em Seg e te Mostrarei a Soma de Todos Eles Em Segundos.");
		
		for (int i = 0; i < numeroLido.length; i++) {
			
			System.out.printf("\nDigite o %d° Valor: ", i + 1);
			
			numeroLido[i] = teclado.nextInt();
			
			soma = converteParaSegundo(numeroLido[0], numeroLido[1], numeroLido[2]);
		}
		
		System.out.printf("\nA Soma Em Segundos É: %d", soma);
		
		teclado.close();
		
	}

}
