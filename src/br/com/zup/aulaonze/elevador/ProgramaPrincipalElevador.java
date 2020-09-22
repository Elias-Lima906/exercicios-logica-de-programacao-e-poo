package br.com.zup.exercicios.aulaonze.elevador;

import java.util.Scanner;

public class ProgramaPrincipalElevador {

	public static void statusElevador(elevador elevator) {
		System.out.println("\n\t------ Elevador Estrelas -----");
		System.out.printf("\n\tA Quantidade é de %d Pessoa(s)", elevator.getPessoasPresentes());
		System.out.printf("\n\tVocê Está No: %d° Andar", elevator.getAnadarAtual());
		System.out.println("\n\t------------------------------");
	}

	public static void main(String[] args) {

		elevador elevator = new elevador(25, 50);
		Scanner teclado = new Scanner(System.in);
		int opcao = 0;
		do {

			System.out.println(
					"\t Vamos Brincar De Elevador\n" + "\t De Comandos Ao Elevador Suas Opções Estão Abaixo: ");
			System.out.println("\t O Predio tem 50 Andares e o Elevador Comporta Até 25 Pessoas.");
			System.out.println("\t(1) - Uma Pessoa Entra No Elevador.\n" + "\t(2) - Uma Pessoa Sai Do Elevador. \n"
					+ "\t(3) - O Elevdor Sobe Um Andar.\n" + "\t(4) - O Elevdor Desce Um Andar.\n"
					+ "\t(5) - Computa Onde E Quantas Pessoas Tem No Elevador.\n");

			System.out.print("\n\tDigite Uma Opcao: ");
			opcao = teclado.nextInt();

			System.out.println("\n");

			switch (opcao) {

			case 1:
				elevator.entra();
				break;
			case 2:
				elevator.sai();
				break;
			case 3:
				elevator.sobeAndar();
				break;	
			case 4:
				elevator.desceAndar();
			case 5:
				break;
			default:
				System.out.println("\n\tOpção Inválida!\n");
			}
		} while (opcao != 5);

		statusElevador(elevator);
		teclado.close();

	}

}
