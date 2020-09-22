package br.com.zup.aulaquinze.figurasgeometricas;

public class Circulo extends FiguraGeometrica {

	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double calculaArea() {
		double areaCirculo = (Math.PI * (Math.pow(raio, 2)));
		return super.setArea(areaCirculo);
	}

}