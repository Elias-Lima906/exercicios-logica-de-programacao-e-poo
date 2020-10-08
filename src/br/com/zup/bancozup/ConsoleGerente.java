package br.com.zup.bancozup;

import java.util.Scanner;

public class ConsoleGerente {

	public static void menuPrincipal() {
		System.out.println("\n\t# Sistema De Gerenciamento de Clientes #\n");
		System.out.println("\t(1) - Cadastrar novo cliente;");
		System.out.println("\t(2) - Remover cliente;");
		System.out.println("\t(3) - Aumentar limite cartão;");
		System.out.println("\t(4) - Diminuir limite cartão;");
		System.out.println("\t(5) - Aumentar limite cheque especial;");
		System.out.println("\t(6) - Diminuir limite cheque especial;");
		System.out.println("\t(7) - Realizar transferência;");
		System.out.println("\t(8) - Realizar depósito;");
		System.out.println("\t(9) - Imprimir clientes;");
		System.out.println("\t(0) - Finalizar programa;\n");
		System.out.print("\n\n\tEscolha uma das opções acima: ");
	}

	public static void menuCadastrarCliente(Scanner teclado, Gerente gerente) {

		String opcao = null;

		do {
			System.out.println("\n\t(1) - Cadastrar pessoa física");
			System.out.println("\t(2) - Cadastrar pessoa jurídica");
			System.out.println("\t(0) - Ir para o menu principal\n");

			System.out.print("\n\tEscolha uma das opções acima: ");
			opcao = teclado.next();

			switch (opcao) {
			case "1":
				cadastrarClientePf(teclado, gerente);
				break;

			case "2":
				cadastrarClientePj(teclado, gerente);
				break;

			case "0":
				break;

			default:
				System.out.println("\n\tOpção inválida. Por favor tente uma opção de 0 a 2.\n");
				break;
			}

		} while (!opcao.equals("0"));
	}

	public static void cadastrarClientePf(Scanner teclado, Gerente gerente) {

		teclado.nextLine();
		System.out.print("\n\tDigite o nome do cliente: ");
		String nome = teclado.nextLine();

		System.out.print("\n\tDigite o CPF: ");
		String cpf = teclado.next();

		System.out.print("\n\tDigite a idade: ");
		int idade = teclado.nextInt();

		System.out.print("\n\tDigite o telefone do cliente: ");
		String telefone = teclado.next();

		System.out.print("\n\tDigite o numero da agencia: ");
		String agencia = teclado.next();

		System.out.print("\n\tDigite o numero da conta: ");
		String numeroDaConta = teclado.next();

		System.out.print("\n\tDigite o saldo inicial: R$ ");
		double saldo = teclado.nextDouble();

		System.out.print("\n\tDigite o limite do cheque especial: R$ ");
		double limiteChequeEspecial = teclado.nextDouble();

		System.out.print("\n\tDigite o limite do cartão de crédito: R$ ");
		double limiteCartaoCredito = teclado.nextDouble();

		PessoaFisica pf = new PessoaFisica(numeroDaConta, telefone, agencia, saldo, limiteChequeEspecial,
				limiteCartaoCredito, cpf, nome, idade);

		gerente.cadastrarCliente(pf);
	}

	public static void cadastrarClientePj(Scanner teclado, Gerente gerente) {
		teclado.nextLine();
		System.out.print("\n\tDigite a razão social: ");
		String razaoSocial = teclado.nextLine();

		System.out.print("\n\tDigite o nome fantasia: ");
		String nomeFantasia = teclado.nextLine();

		System.out.print("\n\tDigite o CNPJ: ");
		String cnpj = teclado.nextLine();

		System.out.print("\n\tDigite o telefone do cliente: ");
		String telefone = teclado.next();

		System.out.print("\n\tDigite o numero da agencia: ");
		String agencia = teclado.next();

		System.out.print("\n\tDigite o numero da conta: ");
		String numeroDaConta = teclado.next();

		System.out.print("\n\tDigite o saldo inicial: R$ ");
		double saldo = teclado.nextDouble();

		System.out.print("\n\tDigite o limite do cheque especial: R$ ");
		double limiteChequeEspecial = teclado.nextDouble();

		System.out.print("\n\tDigite o limite do cartão de crédito: R$ ");
		double limiteCartaoCredito = teclado.nextDouble();
		int qtdSocios = 0;

		do {
			System.out.print("\n\tQuantos socios deseja cadastrar: ");
			qtdSocios = teclado.nextInt();
			if (qtdSocios <= 0 && qtdSocios >= 4) {
				System.out.println("\n\tInclua de 1 a 3 sócios/\n");
			}
			teclado.nextLine();
		} while (qtdSocios <= 0 && qtdSocios >= 4);

		String[] nomesSocios = new String[qtdSocios];
		for (int i = 0; i < nomesSocios.length; i++) {
			System.out.printf("\n\tDigite o %d° nome: ", i + 1);
			nomesSocios[i] = teclado.nextLine();
		}

		PessoaJuridica pj = new PessoaJuridica(numeroDaConta, telefone, agencia, saldo, limiteChequeEspecial,
				limiteCartaoCredito, cnpj, razaoSocial, nomeFantasia, nomesSocios);

		gerente.cadastrarCliente(pj);
	}

	public static void removerCliente(Scanner teclado, String numeroConta, Gerente gerente) {

		System.out.print("\n\tDigite o número da conta que deseja excluir: ");
		numeroConta = teclado.next();
		try {
			gerente.removerCliente(numeroConta);
			System.out.println("\n\tConta excluida com sucesso!\n");
		} catch (OperacaoBancariaException e) {
			System.err.println(e.getMensagem());
		}
	}

	public static void aumentarLimiteCartao(Scanner teclado, String numeroConta, Gerente gerente) {

		System.out.print("\n\tDigite o número da conta que deseja aumentar o limite: ");
		numeroConta = teclado.next();
		try {
			gerente.aumentarLimiteCartao(numeroConta);
			System.out.println("\n\tLimite aumentado com sucesso!\n");

		} catch (OperacaoBancariaException e) {

			System.err.println(e.getMensagem());
		}

	}

	public static void diminuirLimiteCartao(Scanner teclado, String numeroConta, Gerente gerente) {

		System.out.print("\n\tDigite o número da conta que deseja reduzir o limite: ");
		numeroConta = teclado.next();
		try {
			if (gerente.diminuirLimiteCartao(numeroConta)) {
				System.out.println("\n\tLimite reduzido com sucesso!\n");
			}
		} catch (OperacaoBancariaException e) {
			System.err.println(e.getMensagem());
		}

	}

	public static void aumentarLimiteCheque(Scanner teclado, String numeroConta, Gerente gerente) {

		System.out.print("\n\tDigite o número da conta que deseja aumentar o limite: ");
		numeroConta = teclado.next();
		try {
			if (gerente.aumentarLimiteCheque(numeroConta)) {
				System.out.println("\n\tLimite aumentado com sucesso!\n");
			}
		} catch (OperacaoBancariaException e) {
			System.err.println(e.getMensagem());
		}
	}

	public static void diminuirLimiteCheque(Scanner teclado, String numeroConta, Gerente gerente) {

		System.out.print("\n\tDigite o número da conta que deseja reduzir o limite: ");
		numeroConta = teclado.next();
		try {
			if (gerente.diminuirLimiteCheque(numeroConta)) {
				System.out.println("\n\tLimite reduzido com sucesso!\n");
			}
		} catch (OperacaoBancariaException e) {
			System.err.println(e.getMensagem());
		}
	}

	public static void transferenciaBrancaria(Scanner teclado, Gerente gerente, String numeroContaOrigem,
			String numeroContaDestino, double valorTransferencia) {

		System.out.print("\n\tDigite o número da conta de origem: ");
		numeroContaOrigem = teclado.next();

		System.out.print("\n\tDigite o número da conta de destino: ");
		numeroContaDestino = teclado.next();

		System.out.print("\n\tDigite o valor a ser transferido: R$ ");
		valorTransferencia = teclado.nextDouble();

		try {
			if (gerente.transferencia(numeroContaOrigem, numeroContaDestino, valorTransferencia)) {
				System.out.println("\n\tTransferência realizada com sucesso!\n");
			}
		} catch (OperacaoBancariaException e) {
			System.err.println(e.getMensagem());
		}

	}

	public static void depositoBancario(Scanner teclado, String numeroContaDestino, Gerente gerente) {

		System.out.print("\n\tDigite o número da conta de destino: ");
		numeroContaDestino = teclado.next();

		System.out.print("\n\tDigite o valor a ser depositado: R$ ");
		double deposito = teclado.nextDouble();

		try {
			if (gerente.adicionaSaldo(numeroContaDestino, deposito)) {
				System.out.println("\n\tDeposito realizado com sucesso!\n");
			}
		} catch (OperacaoBancariaException e) {
			System.err.println(e.getMensagem());
		}

	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Gerente gerente = new Gerente();

		String opcao = null;
		String numeroConta = null;
		String numeroContaOrigem = null;
		String numeroContaDestino = null;
		double valorTransferencia = 0;

		do {
			menuPrincipal();
			opcao = teclado.next();

			switch (opcao) {
			case "1":
				menuCadastrarCliente(teclado, gerente);
				break;

			case "2":
				removerCliente(teclado, numeroConta, gerente);
				break;

			case "3":
				aumentarLimiteCartao(teclado, numeroConta, gerente);
				break;

			case "4":
				diminuirLimiteCartao(teclado, numeroConta, gerente);
				break;

			case "5":
				aumentarLimiteCheque(teclado, numeroConta, gerente);
				break;

			case "6":
				diminuirLimiteCheque(teclado, numeroConta, gerente);
				break;

			case "7":
				transferenciaBrancaria(teclado, gerente, numeroContaOrigem, numeroContaDestino, valorTransferencia);
				break;

			case "8":
				depositoBancario(teclado, numeroContaDestino, gerente);
				break;

			case "9":
				gerente.imprimeClientes();
				break;

			case "0":
				System.out.println("\n\tObrigado por usar o nosso sistema!\n");
				break;

			default:
				System.out.println("\n\tOpção inválida! Escolha uma opção de 0 a 9.\n");
				break;
			}

		} while (!opcao.equals("0"));
		teclado.close();
	}
}
