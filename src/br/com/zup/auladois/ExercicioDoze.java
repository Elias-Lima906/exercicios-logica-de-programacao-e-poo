package br.com.zup.auladois;
import java.util.Scanner;

public class ExercicioDoze {

	public static void main(String[] args) {
		// Fa�a um programa que pergunte o pre�o de tr�s produtos e
		// informe qual produto voc� deve comprar, sabendo que a decis�o �
		// sempre pelo mais barato.

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite Dois N�meros e Te DIrei Qual � Maior ");

		System.out.println("Digite o Valor do 1� Produto");
		int produtoUm = teclado.nextInt();

		System.out.println("Digite o Valor do 2� Produto");
		int produtoDois = teclado.nextInt();

		System.out.println("Digite o Valor do 3� Produto");
		int produtoTres = teclado.nextInt();

		if (produtoUm < produtoDois && produtoUm < produtoTres) {
			System.out.printf("Compre o 1� Produto T� Mais em conta");

		} else if (produtoDois < produtoUm && produtoDois < produtoTres) {
			System.out.printf("Compre o 2� Produto T� Mais em conta");

		} else {
			System.out.printf("Compre o 3� Produto T� Mais em conta");

		}
		teclado.close();
	}

}
