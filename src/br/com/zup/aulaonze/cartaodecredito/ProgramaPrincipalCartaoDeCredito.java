package br.com.zup.aulaonze.cartaodecredito;

import java.util.Scanner;

public class ProgramaPrincipalCartaoDeCredito {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		CartaoDeCredito cartao = new CartaoDeCredito(1000, "Elias");
		int opcao = 0;
		double novoLimite = 0;

		do {

			System.out.println("\tBem Vindo Ao App Do Seu Cart�o!");
			System.out.println("\tEssas S�o As Suas Op��es: ");
			System.out.println("\t(1) - Aumentar Limite.\n" + "\t(2) - Diminuir Limite.\n"
					+ "\t(3) - Realizar Compra.\n" + "\t(4) - Imprimir Fatura Mensal.\n");

			System.out.print("\tOp��o: ");
			opcao = teclado.nextInt();

			switch (opcao) {
			case 1:
				System.out.printf("\n\tSeu Limite Atual � R$ %.2f\n", cartao.limite);
				System.out.print("\tQuanto Deseja Aumentar R$: ");
				novoLimite = teclado.nextDouble();
				cartao.aumentaLimite(novoLimite);

				break;

			case 2:
				System.out.printf("\n\tSeu Limite Atual � R$ %.2f\n", cartao.limite);
				System.out.print("\tQuanto Deseja Diminuir R$: ");
				novoLimite = teclado.nextDouble();
				cartao.diminuiLimite(novoLimite);
				break;

			case 3:
				System.out.printf("\n\tSeu Limite Atual � R$ %.2f\n", cartao.limite);
				System.out.print("\tQual O Valor Da Sua Compra: R$ ");
				double valorCompra = teclado.nextDouble();
				cartao.realizaCompra(valorCompra);
				break;

			case 4:

				cartao.imprimeFatura();

				break;

			default:
				System.out.println("\n\tOpera��o Indispon�vel!\n");
			}

		} while (opcao != 4);

		teclado.close();
	}

}
