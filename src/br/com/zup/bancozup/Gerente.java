package br.com.zup.bancozup;

public class Gerente implements ControleLimite {
	private Cliente[] clientes;
	protected static final int QUANTIDADE_CLIENTES = 50;
	protected static final float PORCENTAGEM_AUMENTO = 1.15F;
	protected static final float PORCENTAGEM_DIMINUIR = 0.85F;

	public Gerente() {
		this.clientes = new Cliente[QUANTIDADE_CLIENTES];
	}

	public void cadastrarCliente(Cliente cliente) {
		for (int i = 0; i < this.clientes.length; i++) {
			if (this.clientes[i] == null) {
				this.clientes[i] = cliente;
				break;
			}
		}
	}

	public boolean removerCliente(String numeroConta) throws OperacaoBancariaException {
		for (int i = 0; i < this.clientes.length; i++) {
			if (this.clientes[i] != null && this.clientes[i].getNumeroConta().equals(numeroConta)) {
				this.clientes[i] = null;
				return true;
			}
		}
		throw new OperacaoBancariaException("\n\tO Cliente Não Foi Encontrado!\n");
	}

	@Override
	public boolean aumentarLimiteCheque(String numeroConta) throws OperacaoBancariaException {
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] != null && clientes[i].getNumeroConta().equals(numeroConta)) {
				clientes[i].setLimiteChequeEspecial(clientes[i].getLimiteChequeEspecial() * PORCENTAGEM_AUMENTO);
				return true;
			}
		}
		throw new OperacaoBancariaException("\n\tLimite Não Aumentado, conta Não Encontrada!\n");
	}

	@Override
	public boolean aumentarLimiteCartao(String numeroConta) throws OperacaoBancariaException {
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] != null && clientes[i].getNumeroConta().equals(numeroConta)) {
				clientes[i].setLimiteCartaoCredito(clientes[i].getLimiteCartaoCredito() * PORCENTAGEM_AUMENTO);
				return true;
			}
		}
		throw new OperacaoBancariaException("\n\tLimite Não Aumentado, Conta Não Encontrada!\n");
	}

	@Override
	public boolean diminuirLimiteCheque(String numeroConta) throws OperacaoBancariaException {
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] != null && clientes[i].getNumeroConta().equals(numeroConta)) {
				clientes[i].setLimiteChequeEspecial(clientes[i].getLimiteChequeEspecial() * PORCENTAGEM_DIMINUIR);
				return true;
			}
		}
		throw new OperacaoBancariaException("\n\tLimite Não Diminuido, Conta Não Encontrada!\n");
	}

	@Override
	public boolean diminuirLimiteCartao(String numeroConta) throws OperacaoBancariaException {
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] != null && clientes[i].getNumeroConta().equals(numeroConta)) {
				clientes[i].setLimiteCartaoCredito(clientes[i].getLimiteCartaoCredito() * PORCENTAGEM_DIMINUIR);
				return true;
			}
		}
		throw new OperacaoBancariaException("\n\tLimite Não Diminuido, Conta Não Encontrada!\n");
	}

	public boolean transferencia(String numeroContaOrigem, String numeroContaDestino, double valorTransferencia)
			throws OperacaoBancariaException {

		int aux = 0;
		int auxDois = 0;
		int contaDestinoExistente = 0, contaOrigemExistente = 0;

		// Debitando Saldo da Conta Origem;
		if (!numeroContaOrigem.equals(numeroContaDestino)) {
			for (int i = 0; i < clientes.length; i++) {
				if (clientes[i] != null && clientes[i].getNumeroConta().equals(numeroContaOrigem)) {
					if (clientes[i].getSaldo() >= valorTransferencia) {
						clientes[i].setSaldo(clientes[i].getSaldo() - valorTransferencia);
						contaOrigemExistente = 1;
						aux = i;
						break;
					} else {
						throw new OperacaoBancariaException("\n\tSaldo Insuficiente Para Realizar A Transferência!\n");
					}
				}
			}

			// Creditando Saldo na Conta Destino;
			for (int i = 0; i < clientes.length; i++) {
				if (clientes[i] != null && clientes[i].getNumeroConta().equals(numeroContaDestino)) {
					clientes[i].setSaldo(clientes[i].getSaldo() + valorTransferencia);
					contaDestinoExistente = 1;
					auxDois = i;
				}
			}
			if (contaOrigemExistente != 1 && contaDestinoExistente == 1) {
				clientes[auxDois].setSaldo(clientes[auxDois].getSaldo() - valorTransferencia);
				throw new OperacaoBancariaException("\n\tTransferência Não Efetuada, Conta Origem Não Encontrada!\n");

			} else if (contaOrigemExistente == 1 && contaDestinoExistente != 1) {
				clientes[aux].setSaldo(clientes[aux].getSaldo() + valorTransferencia);
				throw new OperacaoBancariaException("\n\tTransferência Não Efetuada, Conta Destino Não Encontrada!\n");

			} else if (contaOrigemExistente == 1 && contaDestinoExistente == 1) {
				return true;

			} else if (contaOrigemExistente != 1 && contaDestinoExistente != 1) {
				throw new OperacaoBancariaException(
						"\n\tTransferência Não Efetuada, Ambas As Contas Não Foram Encontradas!\n");
			}
		}
		return false;
	}

	public boolean adicionaSaldo(String numeroConta, double deposito) throws OperacaoBancariaException {

		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] != null && clientes[i].getNumeroConta().equals(numeroConta)) {
				clientes[i].setSaldo(clientes[i].getSaldo() + deposito);
				return true;
			}
		}
		throw new OperacaoBancariaException("\n\tDeposito Não Efetuado, Conta Não Encontrada!\n");
	}

	public void imprimeClientes() {
		for (Cliente cliente : clientes) {
			if (cliente != null) {
				cliente.imprimeDados();
			}
		}
	}
}