package br.com.zup.aulaquinze.figurasgeometricas;

public class Retangulo extends FiguraGeometrica {

	private double base;
	private double altura;

	public Retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calculaArea() {
		double areaRetangulo = base * altura;
		return super.setArea(areaRetangulo);
	}
}