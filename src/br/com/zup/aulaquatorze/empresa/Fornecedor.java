package br.com.zup.aulaquatorze.empresa;

/*Implemente na classe Fornecedor, para além dos usuais métodos seletores e modificadores,
um método obterSaldo() que devolve a diferença entre os valores dos atributos valorCredito
e valorDivida.*/

public class Fornecedor extends Pessoa {

	private double valorCredito;
	private double valorDivida;

	public Fornecedor(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		this.valorCredito = 0;
		this.valorDivida = 0;
	}

	public double obterSaldo() {
		return this.valorCredito - this.valorDivida;
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

}
