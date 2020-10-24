package br.com.zup.aulanove;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DesafioZeroGrazi {

	public static String informacoesNovaTurma(String nomeTurma, String nomeArquivo) throws IOException {

		FileWriter escrita = new FileWriter(nomeArquivo + ".txt");

		escrita.write(String.format("%s\n", nomeTurma));

		escrita.close();

		return "Arquivo Foi Criado, Muito Obrigado!";
	}

	public static String buscarArquivoTurma(String nomeArquivo) throws IOException {
		FileReader estrutura = new FileReader(nomeArquivo + ".txt");
		BufferedReader leitor = new BufferedReader(estrutura);

		String linha;

		while ((linha = leitor.readLine()) != null) {
			System.out.println(linha);
		}

		leitor.close();
		estrutura.close();

		return linha;

	}

	public static String guardarNomeNotas(String nomeArquivo, String nomeAluno, String sobreNomeAluno)
			throws IOException {

		FileWriter escrita = new FileWriter(nomeArquivo + ".txt", true);
		Scanner teclado = new Scanner(System.in);

		int[] notasAluno = new int[3];

		for (int i = 0; i < notasAluno.length; i++) {
			System.out.printf("Digite a %dº Nota:", i + 1);
			notasAluno[i] = teclado.nextInt();

			teclado.nextLine();
		}

		escrita.append(String.format("%s %s %d %d %d\n", nomeAluno, sobreNomeAluno, notasAluno[0], notasAluno[1],
				notasAluno[2]));
		teclado.close();
		escrita.close();

		return "Dados salvos com sucesso!";

	}

	public static float mediaNotas(String[] separacaoNomeNota) {

		float media = 0;

		int notaUmConvertida = Integer.parseInt(separacaoNomeNota[2]);
		int notaDoisConvertida = Integer.parseInt(separacaoNomeNota[3]);
		int notaTresConvertida = Integer.parseInt(separacaoNomeNota[4]);

		media = (notaUmConvertida + notaDoisConvertida + notaTresConvertida) / 3;

		return media;
	}

	public static String mediaAlunos(String nomeArquivo) throws IOException {

		FileReader estrutura = new FileReader(nomeArquivo + ".txt");
		BufferedReader leitor = new BufferedReader(estrutura);

		String linha;
		System.out.println(leitor.readLine());
		while ((linha = leitor.readLine()) != null) {

			String[] separacaoNomeNota = linha.split(" ");

			System.out.printf("%s %s %.2f\n", separacaoNomeNota[0], separacaoNomeNota[1],
					mediaNotas(separacaoNomeNota));

		}

		leitor.close();
		estrutura.close();

		return linha;

	}

	public static String aprovados(String nomeArquivo) throws IOException {

		FileReader estrutura = new FileReader(nomeArquivo + ".txt");
		BufferedReader leitor = new BufferedReader(estrutura);

		String linha;
		System.out.println(leitor.readLine());
		while ((linha = leitor.readLine()) != null) {

			String[] separacaoNomeNota = linha.split(" ");

			if (mediaNotas(separacaoNomeNota) >= 60) {
				System.out.printf("%s %s foi Aprovado(a)!\n", separacaoNomeNota[0], separacaoNomeNota[1]);
			}

		}

		leitor.close();
		estrutura.close();

		return linha;

	}

	public static String reprovados(String nomeArquivo) throws IOException {

		FileReader estrutura = new FileReader(nomeArquivo + ".txt");
		BufferedReader leitor = new BufferedReader(estrutura);

		String linha;
		System.out.println(leitor.readLine());
		while ((linha = leitor.readLine()) != null) {

			String[] separacaoNomeNota = linha.split(" ");

			if (mediaNotas(separacaoNomeNota) < 60) {
				System.out.printf("%s %s foi Reprovado(a)!\n", separacaoNomeNota[0], separacaoNomeNota[1]);
			}

		}

		leitor.close();
		estrutura.close();

		return linha;

	}

	public static void main(String[] args) throws IOException {

		Scanner teclado = new Scanner(System.in);
		char opcao;
		String nomeArquivo = null;

		do {
			System.out.println("\n(a) Definir informações da turma;\r\n" + "(b) Carregar informações de uma turma;\r\n"
					+ "(c) Inserir aluno e notas;\r\n" + "(d) Exibir alunos e medias;\r\n"
					+ "(e) Exibir alunos aprovados;\r\n" + "(f) Exibir alunos reprovados;\r\n"
					+ "(g) Sair do programa (fim)\n");

			System.out.print("Escolha Uma Das Opções: ");
			opcao = teclado.next().toLowerCase().charAt(0);

			teclado.nextLine();
			switch (opcao) {

			case 'a':
				System.out.println("Digite o nome da turma: ");
				String nomeTurma = teclado.nextLine();

				System.out.println("Digite  Nome Do Arquivo Da Turma: ");
				nomeArquivo = teclado.nextLine();

				System.out.println(informacoesNovaTurma(nomeTurma, nomeArquivo));

				break;

			case 'b':
				System.out.print("Digite o Nome Do Arquivo: ");
				nomeArquivo = teclado.next();

				teclado.nextLine();

				buscarArquivoTurma(nomeArquivo);
				System.out.println("fim da leitura");

				break;

			case 'c':
				if (nomeArquivo != null) {

					System.out.print("Digite o nome do Aluno: ");
					String nomeAluno = teclado.nextLine();
					System.out.print("Digite o sobre nome do Aluno: ");
					String sobreNomeAluno = teclado.nextLine();

					System.out.println(guardarNomeNotas(nomeArquivo, nomeAluno, sobreNomeAluno));
				} else {
					System.out.println("Crie ou abra um arquivo antes");
				}

				break;

			case 'd':
				if (nomeArquivo != null) {
					System.out.println("As medias da turma foi:");

					mediaAlunos(nomeArquivo);
				} else {
					System.out.println("Crie ou abra um arquivo antes");
				}
				break;

			case 'e':
				if (nomeArquivo != null) {
					aprovados(nomeArquivo);
				} else {
					System.out.println("Crie ou abra um arquivo antes");
				}
				break;

			case 'f':
				if (nomeArquivo != null) {
					reprovados(nomeArquivo);
				} else {
					System.out.println("Crie ou abra um arquivo antes");
				}
				break;

			case 'g':
				System.out.println("Obrigada e volte sempre!");
				break;

			default:
				System.out.println("Opção inválida, tente novamente");

			}

		} while (opcao != 'g');

		teclado.close();
	}

}