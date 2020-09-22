package br.com.zup.aulaquinze.figurasgeometricas;

/*Faça um programa que calcule a área de uma figura geométrica. Aceite quatro tipos de figura
geométrica: quadrado, retângulo, triângulo e círculo. Use herança, classe abstrata e
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