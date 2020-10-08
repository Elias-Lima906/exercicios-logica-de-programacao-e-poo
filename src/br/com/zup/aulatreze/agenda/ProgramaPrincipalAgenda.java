package br.com.zup.aulatreze.agenda;

import java.util.Scanner;

public class ProgramaPrincipalAgenda {

	public static void armazenaPessoa(Scanner teclado, Agenda agenda) {
		System.out.println("\n\tDigite As Informa��es");

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
		System.out.print("\n\tDigite o Nome De Uma Pessoa Para Remove-l�!\n" + "\tNome: ");
		String nome = teclado.next();
		try {
			agenda.removePessoa(nome);
		} catch (AgendaException e) {
			System.err.println(e.getMensagem());
		}
	}

	public static void buscaPosicaoPessoa(Scanner teclado, Agenda agenda) {

		System.out.print("\n\n\tDigite o Nome E Te Retornarei A Posi��o!\n" + "\tNome: ");
		String nome = teclado.next();

		try {
			System.out.printf("\n\tA Posi��o Na Agenda � %d\n", agenda.buscaPosicaoPessoa(nome));
		} catch (AgendaException e) {
			System.out.println(e.getMensagem());
		}
	}

	public static void imprimePessoa(Scanner teclado, Agenda agenda) {

		System.out.print("\n\n\tDigite Uma Posi��o Da Agenda : \n" + "\tPosi��o: ");
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
					+ "\n\t(3) - Busca a Posi��o De Uma Pessoa\n" + "\n\t(4) - Busca As Informa��es De Uma Pessoa\n"
					+ "\n\t(5) - Busca As Informa��es De Todas as Pessoa\n");

			System.out.print("\n\tOp��o: ");
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
