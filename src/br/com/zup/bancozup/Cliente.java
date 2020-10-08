package br.com.zup.bancozup;

public abstract class Cliente {
	private String numeroConta;
	private String telefone;
	private String agencia;
	private double saldo; 
	private double limiteChequeEspecial;
	private double limiteCartaoCredito;
	
	public Cliente(String numeroConta, String telefone, String agencia, double saldo, double limiteChequeEspecial,
				   double limiteCartaoCredito) {
		this.numeroConta = numeroConta;
		this.telefone = telefone;
		this.agencia = agencia;
		this.saldo = saldo;
		this.limiteChequeEspecial = limiteChequeEspecial;
		this.limiteCartaoCredito = limiteCartaoCredito;
	}
	
	public abstract void imprimeDados();
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}

	public void setLimiteChequeEspecial(double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}

	public double getLimiteCartaoCredito() {
		return limiteCartaoCredito;
	}

	public void setLimiteCartaoCredito(double limiteCartaoCredito) {
		this.limiteCartaoCredito = limiteCartaoCredito;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getAgencia() {
		return agencia;
	}	
}
