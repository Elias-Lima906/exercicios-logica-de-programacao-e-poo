package br.com.zup.exercicios.aulaoito;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExercicioUm {

	// Leia do usuário seu nome, peso e altura e escreva isto em um arquivo de texto
	// de nome "dadosPessoais.txt" com cada uma dessas informações em uma linha.

	public static void main(String[] args) throws IOException {

		Scanner teclado = new Scanner(System.in);

		FileWriter escrita = new FileWriter("dadosPessoais.txt");

		String nome;
		float peso;
		float altura;

		System.out.print("\nDigite Seu Nome: ");
		nome = teclado.nextLine();

		System.out.print("\nDIgite Seu Peso: ");
		peso = teclado.nextFloat();

		System.out.print("\nDigite Sua Altura: ");
		altura = teclado.nextFloat();

		escrita.write(String.format("Nome: %s", nome));

		escrita.write(String.format("\nPeso: %.2f", peso));

		escrita.write(String.format("\nAltura: %.2f", altura));

		escrita.close();
		teclado.close();
	}
}
