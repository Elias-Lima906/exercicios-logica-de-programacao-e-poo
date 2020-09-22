package br.com.zup.aulaquatorze.empresa;

public class Administrador extends Empregado {

	private double ajudaDeCusto;

	public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,
			double ajudaDeCusto) {
		super(nome, endereco, telefone, codigoSetor, salarioBase);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	@Override
	public double calculaSalario() {
		return this.getSalarioBase() + this.ajudaDeCusto;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
}
