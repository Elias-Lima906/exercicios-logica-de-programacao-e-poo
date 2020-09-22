package br.com.zup.exercicios.aulanove;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DesafioZero {

	public static String informacoesTurma(String nomeTurma, String arquivoDaTurma) throws IOException {

		FileWriter escrita = new FileWriter(arquivoDaTurma + ".txt");
		Scanner teclado = new Scanner(System.in);

		escrita.write(nomeTurma);

		escrita.close();
		teclado.close();

		return nomeTurma;
	}

	public static String buscarArquivoTurma(String arquivoDaTurma) throws IOException {
		FileReader estrutura = new FileReader(arquivoDaTurma + ".txt");
		BufferedReader leitor = new BufferedReader(estrutura);

		String linha;

		while ((linha = leitor.readLine()) != null) {
			System.out.println(linha);
		}

		leitor.close();
		estrutura.close();

		return linha;

	}

	public static String guardarNomeNotas(String arquivo, String nome) throws IOException {

		FileWriter escrita = new FileWriter(arquivo + ".txt", true);
		Scanner teclado = new Scanner(System.in);

		float[] notasDoAluno = new float[3];

		for (int i = 0; i < notasDoAluno.length; i++) {
			System.out.printf("Digite a %dº Nota:", i + 1);
			notasDoAluno[i] = teclado.nextFloat();
		}
		teclado.nextLine();
		System.out.println("\n");
		escrita.append(String.format("%s %.2f %.2f %.2f", nome, notasDoAluno[0], notasDoAluno[1], notasDoAluno[2]));
		teclado.close();
		escrita.close();

		return null;
	}

// Criar um arquivo para inserir as informações da turma.
// As informações são: Nome da Turma, nome do arquivo da turma.
// Pedir ao usuário o nome do arquivo daquela turma.
// O aluno só deverá ser cadastrado com um sobrenome (Exemplo à seguir).

	public static void main(String[] args) throws IOException {

		Scanner teclado = new Scanner(System.in);
		char opcao;
		String arquivoTurma = null;
		String nomeTurma;
		String buscarArquivo = null;
		FileReader estrutura = new FileReader(buscarArquivo + ".txt");

		do {
			System.out.println("Olá Usúario, Bem Vindo ao Sistema De Gerenciamento De Dados Escolares!");

			System.out.println("\n(a) Definir informações da turma;\r\n" + "(b) Carregar informações de uma turma;\r\n"
					+ "(c) Inserir aluno e notas;\r\n" + "(d) Exibir alunos e medias;\r\n"
					+ "(e) Exibir alunos aprovados;\r\n" + "(f) Exibir alunos reprovados;\r\n"
					+ "(g) Sair do programa (fim).\n");

			System.out.print("Escolha Uma Das Opções: ");
			opcao = teclado.next().charAt(0);

			if (opcao == 'g') {
				System.out.println("\nObrigado Por Utilizar O Sistema De Gerenciamento De Dados Escolares.");
				break;
			}

			switch (opcao) {

			case 'a':

				System.out.println("Digite o nome da turma: ");
				nomeTurma = teclado.next();

				System.out.println("Digite  Nome Do Arquivo Da Turma: ");
				arquivoTurma = teclado.next();

				informacoesTurma(nomeTurma, arquivoTurma);

				System.out.println("\nO Arquivo Foi Criado, Muito Obrigado!");
				break;

			case 'b':

				System.out.print("\nDigite o Nome Do Arquivo: ");
				buscarArquivo = teclado.next();

				System.out.println(buscarArquivoTurma(buscarArquivo));

				break;

			case 'c':

				System.out.print("Digite o nome do Aluno: ");
				String nomeAluno = teclado.next();

				guardarNomeNotas(buscarArquivo, nomeAluno);

				break;

			case 'd':

				break;

			case 'e':

				break;

			case 'f':

				break;
			default:
				System.out.println("Opção Inválida, tente novamento Por Favor!");
			}
		} while (opcao >= 'a' && opcao <= 'f');
		estrutura.close();
		teclado.close();

	}

}
