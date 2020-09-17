package br.com.zup.aulatreze.agenda;

import java.util.Scanner;

public class ProgramaPrincipalAgenda {

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
				System.out.println("\n\tDigite As Informa��es");

				System.out.print("\n\tNome: ");
				String nome = teclado.next();

				System.out.print("\tAno Nasc: ");
				int anoNascimento = teclado.nextInt();

				System.out.print("\tAltura: ");
				float altura = teclado.nextFloat();

				agenda.armazenaPessoa(nome, anoNascimento, altura);
				break;

			case 2:
				System.out.print("\n\tDigite o Nome De Uma Pessoa Para Remove-l�!\n" + "\tNome: ");
				nome = teclado.next();
				agenda.removePessoa(nome);
				break;

			case 3:
				System.out.print("\n\n\tDigite o Nome E Te Retornarei A Posi��o!\n" + "\tNome: ");
				nome = teclado.next();
				if(agenda.buscaPessoa(nome) != -1) {
				System.out.printf("\n\tA Posi��o Na Agenda � %d\n", agenda.buscaPessoa(nome));
				}else {
					System.out.println("\n\tN�o Existe Pessoa Com Este Nome!\n");
				}
				break;

			case 4:
				System.out.print("\n\n\tDigite Uma Posi��o Da Agenda : \n" + "\tPosi��o: ");
				int posicao = teclado.nextInt();
				agenda.imprimePessoa(posicao);
				break;

			case 5:
				agenda.imprimeAgenda();
				break;
			}

		} while (opcao != 0);
		teclado.close();
	}

}
