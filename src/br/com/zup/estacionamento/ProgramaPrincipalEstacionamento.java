package br.com.zup.estacionamento;

import java.util.Scanner;

public class ProgramaPrincipalEstacionamento {

	public static void menuEscolha() {
		System.out.println("\n\t(1) - Adicionar Um Carro;\n" + "\n\t(2) - Para Retirar Um Carro;\n"
				+ "\n\t(3) - Para Imprimir Saldo Em Caixa;\n" + "\n\t(4) - Para Verificar Estadia Do Carro;\n"
				+ "\n\t(0) - Para Sair\n");
	}

	public static void adicionaCarro(Scanner teclado, Estacionamento estacionamento) {
		System.out.println("\n\tPrecisarei De Algumas Informações Para Cadastrar O Carro.\n");
		System.out.print("\tPlaca: ");
		String placa = teclado.next();

		System.out.print("\n\tCor: ");
		String cor = teclado.next();

		System.out.print("\n\tMarca: ");
		String marca = teclado.next();

		System.out.print("\n\tModelo: ");
		String modelo = teclado.next();

		try {
			estacionamento.registraEntrada(placa, cor, marca, modelo);
		} catch (EstacionamentoException e) {
			System.err.println(e.getMensagem());
		}
	}

	public static void retiraCarro(Scanner teclado, Estacionamento estacionamento) {
		System.out.println("\n\tPara Retirar Um Carro Precisarei Da Informação a Seguir:\n");

		System.out.print("\n\tPlaca: ");
		String placa = teclado.next();

		System.out.print("\n\tValor da Estadia: R$ ");
		float valorEstadia = teclado.nextFloat();

		try {
			estacionamento.registraSaida(placa, valorEstadia);
			System.out.println("\n\tCarro Retirado Com Sucesso!\n");
		} catch (EstacionamentoException e) {
			System.err.println(e.getMensagem());
		}
	}

	public static void verificaCarro(Scanner teclado, Estacionamento estacionamento) {

		System.out.println("\n\tPara Verificar Se o Carro Está No Estacionamento Digite a Placa;\n");
		System.out.print("\n\tNúmero da Placa: ");
		String placa = teclado.next();
		try {
			estacionamento.carroPresente(placa);
			System.out.println("\n\tO carro está no estacionamento!\n");
		} catch (EstacionamentoException e) {
			System.err.println(e.getMensagem());
		}
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Estacionamento estacionamento = new Estacionamento();
		int opcaoEscolha = 0;

		do {
			menuEscolha();
			System.out.print("\n\tOpção: ");
			opcaoEscolha = teclado.nextInt();

			switch (opcaoEscolha) {

			case 1:
				adicionaCarro(teclado, estacionamento);
				break;

			case 2:
				retiraCarro(teclado, estacionamento);
				break;

			case 3:
				System.out.printf("\n\tO Saldo Em Caixa é de: R$ %.2f\n", estacionamento.getValorEmCaixa());
				break;

			case 4:
				verificaCarro(teclado, estacionamento);
				break;

			case 0:
				System.out.println("\n\tMuito Obrigado e Volte Sempre;\n");
				break;
			default:
				System.out.println("Opção inválida, Tente Novamente!");
				break;
			}
		} while (opcaoEscolha != 0);

		teclado.close();
	}
}
