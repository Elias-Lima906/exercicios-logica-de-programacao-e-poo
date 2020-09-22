package br.com.zup.aulaquinze.figurasgeometricas;

/*Fa�a um programa que calcule a �rea de uma figura geom�trica. Aceite quatro tipos de figura
geom�trica: quadrado, ret�ngulo, tri�ngulo e c�rculo. Use heran�a, classe abstrata e
polimorfismo.*/

public abstract class FiguraGeometrica {

	private double area;

	public abstract double calculaArea();

	public double getArea() {
		return area;
	}

	public double setArea(double area) {
		return this.area = area;
	}
}