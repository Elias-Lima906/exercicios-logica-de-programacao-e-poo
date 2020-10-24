package br.com.zup.aulaseis;

import java.util.Scanner;

public class ExercicioSete {

	public static void main(String[] args) {

		/*
		 * Ler um conjunto de números reais, armazenando-o em vetor e calcular o
		 * quadrado das componentes deste vetor, armazenando o resultado em outro vetor.
		 * Os conjuntos tem 10 elementos cada. Imprimir todos os conjuntos.
		 */

		Scanner teclado = new Scanner(System.in);

		float[] numerosReais = new float[10];
		float[] conjuntoQuadrado = new float[10];

		for (int i = 0; i < numerosReais.length; i++) {

			System.out.printf("Digite o %d° número: ", i + 1);

			numerosReais[i] = teclado.nextFloat();

			conjuntoQuadrado[i] = numerosReais[i] * numerosReais[i];
		}

		System.out.println("O conjunto Dos Números Digitados É: ");
		for (float numerosLidos : numerosReais) {
			System.out.println(numerosLidos);
		}
		System.out.print("O Conjunto Dos Números Digitados ao Quadrado É: ");
		for (float quadrado : conjuntoQuadrado) {
			System.out.println(quadrado);

			teclado.close();
		}
	}
}
