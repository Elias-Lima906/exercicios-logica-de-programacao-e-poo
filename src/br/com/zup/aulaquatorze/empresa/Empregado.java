package br.com.zup.aulaquatorze.empresa;

/*Considere, como outra subclasse da classe Pessoa, a classe Empregado. Considere que cada
instância da classe Empregado tem, para além dos atributos que caracterizam a classe
Pessoa, os atributos codigoSetor (inteiro), salarioBase (vencimento base) e
imposto(porcentagem retida dos impostos).*/

public class Empregado extends Pessoa {

	private int codigoSetor;
	private double salarioBase;
	private double imposto;

	public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase) {
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = 0;
	}

	public double calculaSalario() {
		return this.salarioBase / imposto;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

}
