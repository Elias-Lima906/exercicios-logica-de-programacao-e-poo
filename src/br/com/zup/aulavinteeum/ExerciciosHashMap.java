package br.com.zup.aulavinteeum;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExerciciosHashMap {

	static final int QTD_PESSOAS = 2;

	public static void main(String[] args) {
		/*
		 * Escreva um programa para criar um HashMap onde a chave é o CPF e o valor o
		 * Nome. Leia do usuário 10 conjuntos de valores e armazene em seu Hashmap
		 * Mostre na tela os 10 valores de nomes armazenados Peça ao usuário um CPF e
		 * remova do seu hashMap a entrada referente à esse valor Mostre na tela os
		 * valores restantes em seu hashMap
		 */

		Map<String, String> cadastro = new HashMap<String, String>();
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < QTD_PESSOAS; i++) {
			System.out.printf("\n\tDigite o %s CPF: ", i + 1);
			String cpf = teclado.next();
			System.out.printf("\n\tDigite o %s Nome: ", i + 1);
			String nome = teclado.next();
			cadastro.put(cpf, nome);
		}

		System.out.println("\n\tOs Nomes Digitados Foram: ");
		for (String nomes : cadastro.values()) {
			System.out.printf("\n\tNome: %s\n", nomes);
		}

		for (String cpf : cadastro.keySet()) {
			System.out.printf("\n\tCPF: %s\n", cpf);
		}

		System.out.print("\n\tDigite Um CPF a Ser Removido: ");
		String cpfRemovido = teclado.next();
		cadastro.remove(cpfRemovido);

		System.out.println("\n\tOs Nomes Digitados Foram: ");
		for (String nomes : cadastro.values()) {
			System.out.printf("\n\tNome: %s\n", nomes);
		}

		for (String cpf : cadastro.keySet()) {
			System.out.printf("\n\tCPF: %s\n", cpf);
		}

		teclado.close();
	}
}