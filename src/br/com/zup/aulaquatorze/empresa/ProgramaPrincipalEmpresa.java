package br.com.zup.aulaquatorze.empresa;

import java.util.Scanner;

public class ProgramaPrincipalEmpresa {

	public static void alteraInformacoesFornecedor(Scanner teclado, int opcaoInterna) {

		Fornecedor fornecedor = null;

		do {
			System.out.print("\n\t(1) - Adicionar Fornecedor;\n" + "\n\t(2) - Alterar Valor De Crédito;\n"
					+ "\n\t(3) - Alterar Valor Da Dívida;\n" + "\n\t(4) - Mostrar Saldo;\n" + "\n\t(0) - Sair;\n"
					+ "\n\tOpção: ");
			opcaoInterna = teclado.nextInt();
			switch (opcaoInterna) {
			case 1:
				System.out.println("\n\tPreencha As Informações ABaixo");

				System.out.print("\n\tNome: ");
				String nome = teclado.next();

				System.out.print("\n\tEndereço: ");
				String endereco = teclado.next();

				System.out.print("\n\tTelefone: ");
				String telefone = teclado.next();

				System.out.println("\n\tFornecedor Adicionado Com Sucesso.\n");

				fornecedor = new Fornecedor(nome, endereco, telefone);
				break;

			case 2:
				System.out.print("\n\tQual O Seu Crédito Atual?\n" + "\n\tCrédito: R$ ");
				double creditoAtual = teclado.nextDouble();
				fornecedor.setValorCredito(creditoAtual);
				break;

			case 3:
				System.out.print("\n\tQual O Valor Da Dívida Atual?\n" + "\n\tDívida: R$ ");
				double dividaAtual = teclado.nextDouble();
				fornecedor.setValorDivida(dividaAtual);
				break;

			case 4:
				System.out.printf("\n\tO Seu Saldo É De: R$ %.2f\n", fornecedor.obterSaldo());
				break;

			case 0:
				System.out.println("\n\tAté Uma Próxima!\n");
				break;

			default:
				System.out.println("\n\tOpção Inválida!\n");
			}

		} while (opcaoInterna != 0);
	}

	public static void alteraInformacoesEmpregado(Scanner teclado, int opcaoInterna) {

		Empregado empregado = null;

		do {
			System.out.print("\n\t(1) - Adicionar Empregado;\n" + "\n\t(2) - Mostrar Salário Com Desconto;\n"
					+ "\n\t(0) - Sair;\n" + "\n\tOpção: ");
			opcaoInterna = teclado.nextInt();
			switch (opcaoInterna) {
			case 1:
				System.out.println("\n\tPreencha As Informações ABaixo");

				System.out.print("\n\tNome: ");
				String nome = teclado.next();

				System.out.print("\n\tEndereço: ");
				String endereco = teclado.next();

				System.out.print("\n\tTelefone: ");
				String telefone = teclado.next();

				System.out.print("\n\tCódigo Do Setor: ");
				int codigoSetor = teclado.nextInt();

				System.out.print("\n\tSalario Base: ");
				double salarioBase = teclado.nextDouble();

				System.out.println("\n\tEmpregado Adicionado Com Sucesso.\n");

				empregado = new Empregado(nome, endereco, telefone, codigoSetor, salarioBase);
				break;

			case 2:
				System.out.print("\n\tQual A Porcentagem de Impostos Que Deseja Aplicar?\n" + "\tPorcentagem: ");
				double imposto = teclado.nextDouble();
				empregado.setImposto(imposto);

				System.out.printf("\n\tO Salario Base Com Desconto Dos Impóstos Ficou em: R$ %.2f\n",
						empregado.calculaSalario());
				break;

			case 0:
				System.out.println("\n\tAté Uma Próxima!\n");
				break;
			default:
				System.out.println("\n\tOpção Inválida!\n");
			}

		} while (opcaoInterna != 0);

	}

	public static void alteraInformacoesAdiministrador(Scanner teclado, int opcaoInterna) {

		Administrador administrador = null;

		do {
			System.out.print("\n\t(1) - Adicionar Administrador;\n" + "\n\t(2) - Mostrar Salário Reajustado;\n"
					+ "\n\t(0) - Sair;\n" + "\n\tOpção: ");
			opcaoInterna = teclado.nextInt();
			switch (opcaoInterna) {
			case 1:
				System.out.println("\n\tPreencha As Informações A Baixo");

				System.out.print("\n\tNome: ");
				String nome = teclado.next();

				System.out.print("\n\tEndereço: ");
				String endereco = teclado.next();

				System.out.print("\n\tTelefone: ");
				String telefone = teclado.next();

				System.out.print("\n\tCódigo Do Setor: ");
				int codigoSetor = teclado.nextInt();

				System.out.print("\n\tSalario Base: ");
				double salarioBase = teclado.nextDouble();

				System.out.print("\n\tAjuda De Custo: ");
				double ajudaDeCusto = teclado.nextDouble();

				System.out.println("\n\tAdministrado Adicionado Com Sucesso.\n");

				administrador = new Administrador(nome, endereco, telefone, codigoSetor, salarioBase, ajudaDeCusto);
				break;

			case 2:
				System.out.printf("\n\tO Salario Base Com Ajuda De Custo Ficou em: R$ %.2f\n",
						administrador.calculaSalario());
				break;

			case 0:
				System.out.println("\n\tAté Uma Próxima!\n");
				break;
			default:
				System.out.println("\n\tOpção Inválida!\n");
			}

		} while (opcaoInterna != 0);

	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcaoGeral = 0;
		int opcaoInterna = 0;

		do {
			System.out.print("\n\t(1) - Alterar Informações Sobre Fornecedor;\n"
					+ "\n\t(2) - Alterar Informações Sobre Empregado;\n"
					+ "\n\t(3) - Alterar Informações Sobre Administrador;\n" + "\n\t(0) - Sair\n" + "\n\tOpção: ");
			opcaoGeral = teclado.nextInt();

			switch (opcaoGeral) {
			case 1:
				alteraInformacoesFornecedor(teclado, opcaoInterna);
				break;

			case 2:
				alteraInformacoesEmpregado(teclado, opcaoInterna);
				break;

			case 3:
				alteraInformacoesAdiministrador(teclado, opcaoInterna);
				break;

			case 0:
				System.out.println("\n\tMuito Obrifado!, Volte Sempre.\n");
				break;

			default:
				System.out.println("\n\tOpção Inválida.\n");
			}
		} while (opcaoGeral != 0);

	}

}
