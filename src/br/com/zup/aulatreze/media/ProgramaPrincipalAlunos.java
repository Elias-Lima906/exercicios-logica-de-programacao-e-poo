package br.com.zup.aulatreze.media;

import java.util.Scanner;

public class ProgramaPrincipalAlunos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome;
		String matricula;
		float[] notas = new float[3];

		System.out.println("\tOlá, Digite Abaixo Quantos Alunos Deseja Cadastrar No Calculador De Medias.\n");
		System.out.print("\tQuantidade De Alunos: ");
		int qtdAlunos = teclado.nextInt();

		AlunosMatriculados[] alunos = new AlunosMatriculados[qtdAlunos];
		for (int i = 0; i < alunos.length; i++) {

			System.out.print("\n\tNome: ");
			nome = teclado.next();

			System.out.print("\n\tMatrícula: ");
			matricula = teclado.next();

			for (int j = 0; j < notas.length; j++) {

				System.out.printf("\n\tDigite a %d° Nota: ", j + 1);
				notas[j] = teclado.nextFloat();

			}
			alunos[i] = new AlunosMatriculados(nome, matricula, notas[0], notas[1], notas[2]);

			alunos[i].statusAlunos();

		}

		System.out.println("Muito Obrigado");

		teclado.close();
	}

}
