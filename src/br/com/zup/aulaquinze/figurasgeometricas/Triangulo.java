package br.com.zup.aulaquinze.figurasgeometricas;

public class Triangulo extends FiguraGeometrica {

	private double base;
	private double altura;

	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calculaArea() {
		double areaTriangulo = base * altura / 2;
		return super.setArea(areaTriangulo);
	}
}
