package br.com.zup.exercicios.auladois;

import java.util.Scanner;

public class ExercicioNove {

	public static void main(String[] args) {
		// Leia o salario de um trabalhador e o valor da presta��o de um empr�stimo.
		// Se a presta��o for maior que 20% do sal�rio imprima: "Empr�stimo n�o
		// concedido",
		// caso contrario imprima: "Empr�stimo concedido"

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite Abaixo O Valor Do Sal�rio E o Valor da Presta��o Do Empr�stimo");

		System.out.println("Digite o S�lario");
		float salario = teclado.nextFloat();

		System.out.println("Digite a Presta��o Do Empr�stimo");
		float prestacaoEmprestimo = teclado.nextFloat();

		if (prestacaoEmprestimo > salario * 0.2f) {

			System.out.println("Empr�stimo n�o concedido");

		} else {

			System.out.println("Empr�stimo Concedido");
		}

		teclado.close();
	}

}
