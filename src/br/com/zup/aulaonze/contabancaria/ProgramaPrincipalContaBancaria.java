package br.com.zup.exercicios.aulaonze.contabancaria;

import java.util.Scanner;

public class ProgramaPrincipalContaBancaria {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria(1999, 15000, "Elias");
		Scanner teclado = new Scanner(System.in);
		int opcao = 0;
		do {
			System.out.println("\n\tOlá, Diga Qual Operação Você Deseja Fazer");
			System.out.println("\t(1) - Sacar \n" + "\t(2) - Depositar \n" + "\t(3) - Extrato \n" + "\t(0) - Sair");
			System.out.print("\tOpção: ");
			opcao = teclado.nextInt();
			double valorLido;
			switch (opcao) {

			case 1:
				System.out.printf("\n\tOlá, Digite quanto deseja Sacar: \n" + "\tvocê tem R$ %.2f", conta.getSaldo());
				System.out.print("\n\tValor: R$ ");
				valorLido = teclado.nextDouble();
				conta.saque(valorLido);
				break;
			case 2:
				System.out.printf("\n\tOlá, Digite quanto deseja Depositar: \n" + "\tvocê tem R$ %.2f", conta.getSaldo());
				System.out.print("\n\tValor: R$ ");

				valorLido = teclado.nextDouble();
				conta.deposito(valorLido);
				break;
			case 3:
				conta.extrato();
				break;
			case 0:
				System.out.println("\n\tMuito Obrigado e Volte Sempre!");
				break;
			default:
				System.out.println("\n\tOpção Invalída, Tente Novamente!");

			}
		} while (opcao != 0);
		teclado.close();
	}

}
