package br.com.zup.aulatreze.agenda;

import java.util.Scanner;

public class ProgramaPrincipalAgenda {

	public static void armazenaPessoa(Scanner teclado, Agenda agenda) {
		System.out.println("\n\tDigite As Informações");

		System.out.print("\n\tNome: ");
		String nome = teclado.next();

		System.out.print("\tAno Nasc: ");
		int anoNascimento = teclado.nextInt();

		System.out.print("\tAltura: ");
		float altura = teclado.nextFloat();

		try {
			agenda.armazenaPessoa(nome, anoNascimento, altura);
		} catch (AgendaException e) {

			System.err.println(e.getMensagem());
		}
	}

	public static void removePessoa(Scanner teclado, Agenda agenda) {
		System.out.print("\n\tDigite o Nome De Uma Pessoa Para Remove-lá!\n" + "\tNome: ");
		String nome = teclado.next();
		try {
			agenda.removePessoa(nome);
		} catch (AgendaException e) {
			System.err.println(e.getMensagem());
		}
	}

	public static void buscaPosicaoPessoa(Scanner teclado, Agenda agenda) {

		System.out.print("\n\n\tDigite o Nome E Te Retornarei A Posição!\n" + "\tNome: ");
		String nome = teclado.next();

		try {
			System.out.printf("\n\tA Posição Na Agenda É %d\n", agenda.buscaPosicaoPessoa(nome));
		} catch (AgendaException e) {
			System.out.println(e.getMensagem());
		}
	}

	public static void imprimePessoa(Scanner teclado, Agenda agenda) {

		System.out.print("\n\n\tDigite Uma Posição Da Agenda : \n" + "\tPosição: ");
		int posicao = teclado.nextInt();
		try {
			agenda.imprimePessoa(posicao);
		} catch (AgendaException e) {
			System.err.println(e.getMensagem());
		}
	}

	public static void main(String[] args) {

		int opcao;
		Scanner teclado = new Scanner(System.in);
		Agenda agenda = new Agenda();

		System.out.println("\n\tBem Vindo A Sua Agenda Pessoal;\n");
		do {

			System.out.println("\n\t(1) - Adiciona Uma Pessoa\n" + "\n\t(2) - Remove Uma Pessoa\n"
					+ "\n\t(3) - Busca a Posição De Uma Pessoa\n" + "\n\t(4) - Busca As Informações De Uma Pessoa\n"
					+ "\n\t(5) - Busca As Informações De Todas as Pessoa\n");

			System.out.print("\n\tOpção: ");
			opcao = teclado.nextInt();

			switch (opcao) {
			case 1:
				armazenaPessoa(teclado, agenda);
				break;

			case 2:
				removePessoa(teclado, agenda);
				break;

			case 3:
				buscaPosicaoPessoa(teclado, agenda);
				break;

			case 4:
				imprimePessoa(teclado, agenda);
				break;

			case 5:
				agenda.imprimeAgenda();
				break;
			}

		} while (opcao != 0);
		teclado.close();
	}

}
