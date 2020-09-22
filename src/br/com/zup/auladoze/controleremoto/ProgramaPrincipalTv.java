package br.com.zup.exercicios.auladoze.controleremoto;

import java.util.Scanner;

public class ProgramaPrincipalTv {

	/*
	 * 4. Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o
	 * volume e trocar os canais da televisão. O controle de volume permite:
	 * aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
	 * aumentar e diminuir o número do canal em uma unidade trocar para um canal
	 * indicado; consultar o valor do volume de som e o canal selecionado Crie
	 * depois um programa principal que interaja com as suas classes, não se esqueça
	 * dos modificadores de acesso e dos getters e setters em suas classes.
	 */

	public static void main(String[] args) {

		ControleRemoto controle = new ControleRemoto();
		Scanner teclado = new Scanner(System.in);
		int opcao = 0;
		do {
			System.out.println("\tBem Vindo Ao Seu Smart Control!");
			System.out.println("\t(1) - Volume +\n" + "\t(2) - Volume -\n" + "\t(3) - Trocar Canal +\n"
					+ "\t(4) - Trocar Canal -\n" + "\t(5) - Selecionar Canal;\n" + "\t(0) - Sair Do Controle;\n");

			System.out.print("\t Escolha Uma Opção: ");
			opcao = teclado.nextInt();

			switch (opcao) {
			case 1:
				controle.aumentarVolume();

				controle.mostrarInformaçõesTv();
				break;

			case 2:
				controle.diminuirVolume();

				controle.mostrarInformaçõesTv();
				break;

			case 3:
				controle.trocarCanalMais();

				controle.mostrarInformaçõesTv();
				break;

			case 4:
				controle.trocarCanalMenos();
				controle.mostrarInformaçõesTv();
				break;

			case 5:
				System.out.print("\n\tDigite O Canal Desejado: \n" + "\tCanal: ");
				int canalLido = teclado.nextInt();
				controle.escolhercanal(canalLido);
				controle.mostrarInformaçõesTv();
				System.out.print("\n");

				break;
			case 0:
				System.out.println("\n\tAté a Próxima : )\n");
				break;
			default:
				System.out.println("\n\tOpção Inválida!\n");
			}

		} while (opcao != 0);

		teclado.close();
	}
}