package br.com.zup.bancozup;

public class PessoaFisica extends Cliente {

	private String cpf;
	private String nome;
	private int idade;

	public PessoaFisica(String numeroConta, String telefone, String agencia, double saldo, double limiteChequeEspecial,
			double limiteCartaoCredito, String cpf, String nome, int idade) {
		super(numeroConta, telefone, agencia, saldo, limiteChequeEspecial, limiteCartaoCredito);

		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public void imprimeDados() {
		System.out.println("\n\t======== PESSOA FISICA ========");
		System.out.println("\tNome: " + this.nome);
		System.out.println("\tCPF: " + this.cpf);
		System.out.println("\tIdade: " + this.idade);
		System.out.println("\tAgencia: " + super.getAgencia());
		System.out.println("\tNumero Da Conta: " + super.getNumeroConta());
		System.out.println("\tTelefone: " + super.getTelefone());
		System.out.printf("\tLimite do cheque especial: R$ %.2f\n", super.getLimiteChequeEspecial());
		System.out.printf("\tLimite do cartao de credito: R$ %.2f\n", super.getLimiteCartaoCredito());
		System.out.printf("\tSaldo: R$ %.2f\n", super.getSaldo());
		System.out.println("\t===============================\n");
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

}
