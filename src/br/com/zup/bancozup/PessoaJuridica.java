package br.com.zup.bancozup;

public class PessoaJuridica extends Cliente {
	private String cnpj;
	private String[] nomeSocios;
	private String razaoSocial;
	private String nomeFantasia;

	public PessoaJuridica(String numeroConta, String telefone, String agencia, double saldo,
			double limiteChequeEspecial, double limiteCartaoCredito, String cnpj, String razaoSocial,
			String nomeFantasia, String[] nomeSocios) {
		super(numeroConta, telefone, agencia, saldo, limiteChequeEspecial, limiteCartaoCredito);

		this.cnpj = cnpj;
		this.nomeSocios = nomeSocios;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
	}

	@Override
	public void imprimeDados() {
		System.out.println("\n\t======== PESSOA JURIDICA ========");
		System.out.println("\tRazao Social: " + this.razaoSocial);
		System.out.println("\tNome Fantasia: " + this.nomeFantasia);
		System.out.println("\tCNPJ: " + this.cnpj);
		for (int i = 0; i < nomeSocios.length; i++) {
			System.out.printf("\tNome do %d° socio: %s\n", i + 1, this.nomeSocios[i]);
		}
		System.out.println("\tAgencia: " + super.getAgencia());
		System.out.println("\tNumero Da Conta: " + super.getNumeroConta());
		System.out.println("\tTelefone: " + super.getTelefone());
		System.out.printf("\tLimite do cheque especial: R$ %.2f\n", super.getLimiteChequeEspecial());
		System.out.printf("\tLimite do cartao de credito: R$ %.2f\n", super.getLimiteCartaoCredito());
		System.out.printf("\tSaldo: R$ %.2f\n", super.getSaldo());
		System.out.println("\t=================================\n");
	}

	public String[] getNomeSocios() {
		return nomeSocios;
	}

	public void setNomeSocios(String[] nomeSocios) {
		this.nomeSocios = nomeSocios;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

}
