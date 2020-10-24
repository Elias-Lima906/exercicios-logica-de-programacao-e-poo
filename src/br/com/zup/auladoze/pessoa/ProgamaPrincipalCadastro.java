package br.com.zup.auladoze.pessoa;

import java.util.Scanner;

public class ProgamaPrincipalCadastro {

	public static void main(String[] args) {

		String nome;
		int anoNascimento;
		double altura;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Olá Quantas Pessoas Deseja Cadastrar?");
		System.out.print("\t- N°: ");
		int qtd = teclado.nextInt();

		Pessoa[] pessoasCadastro = new Pessoa[qtd];
		for (int i = 0; i < pessoasCadastro.length; i++) {

			System.out.print("\n\tNome: ");
			nome = teclado.next();

			System.out.print("\tAno Nasc: ");
			anoNascimento = teclado.nextInt();

			System.out.print("\tAltura: ");
			altura = teclado.nextDouble();

			pessoasCadastro[i] = new Pessoa(nome, anoNascimento, altura);
		}

		for (Pessoa pessoaLida : pessoasCadastro) {
			pessoaLida.imprimirDadosPessoais();
		}

		System.out.println("Pessoa(s) Cadastrada(s) Com Sucesso!");
		teclado.close();
	}
}
