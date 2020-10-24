package br.com.zup.auladois;
import java.util.Scanner;

public class ExercicioDoze {

	public static void main(String[] args) {
		// Faça um programa que pergunte o preço de três produtos e
		// informe qual produto você deve comprar, sabendo que a decisão é
		// sempre pelo mais barato.

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite Dois Números e Te DIrei Qual É Maior ");

		System.out.println("Digite o Valor do 1° Produto");
		int produtoUm = teclado.nextInt();

		System.out.println("Digite o Valor do 2° Produto");
		int produtoDois = teclado.nextInt();

		System.out.println("Digite o Valor do 3° Produto");
		int produtoTres = teclado.nextInt();

		if (produtoUm < produtoDois && produtoUm < produtoTres) {
			System.out.printf("Compre o 1° Produto Tá Mais em conta");

		} else if (produtoDois < produtoUm && produtoDois < produtoTres) {
			System.out.printf("Compre o 2° Produto Tá Mais em conta");

		} else {
			System.out.printf("Compre o 3° Produto Tá Mais em conta");

		}
		teclado.close();
	}

}
