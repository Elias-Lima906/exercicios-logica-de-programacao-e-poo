package br.com.zup.exercicios.auladois;

import java.util.Scanner;

public class ExercicioNove {

	public static void main(String[] args) {
		// Leia o salario de um trabalhador e o valor da prestação de um empréstimo.
		// Se a prestação for maior que 20% do salário imprima: "Empréstimo não
		// concedido",
		// caso contrario imprima: "Empréstimo concedido"

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite Abaixo O Valor Do Salário E o Valor da Prestação Do Empréstimo");

		System.out.println("Digite o Sálario");
		float salario = teclado.nextFloat();

		System.out.println("Digite a Prestação Do Empréstimo");
		float prestacaoEmprestimo = teclado.nextFloat();

		if (prestacaoEmprestimo > salario * 0.2f) {

			System.out.println("Empréstimo não concedido");

		} else {

			System.out.println("Empréstimo Concedido");
		}

		teclado.close();
	}

}
