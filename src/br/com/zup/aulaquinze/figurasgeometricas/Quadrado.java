package br.com.zup.aulaquinze.figurasgeometricas;

public class Quadrado extends FiguraGeometrica {

	private double lado;

	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calculaArea() {
		double areaQuadrado = lado * lado;
		return super.setArea(areaQuadrado);
	}
}
