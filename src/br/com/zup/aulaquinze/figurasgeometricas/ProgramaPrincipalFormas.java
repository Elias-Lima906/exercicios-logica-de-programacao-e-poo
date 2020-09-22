package br.com.zup.aulaquinze.figurasgeometricas;

import java.util.Scanner;

public class ProgramaPrincipalFormas {

	public static void areaQuadrado(Scanner teclado) {
		System.out.print("\n\tDigite o Comprimento De Um Dos Lados Do Quadrado.\n" + "\tLado: ");
		int lado = teclado.nextInt();
		FiguraGeometrica quadrado = new Quadrado(lado);
		quadrado.calculaArea();
		System.out.printf("\n\tA �rea Do Quadrado �: %.1f\n", quadrado.getArea());
		System.out.println("\t--------------------------\n");
	}

	public static void areaTriangulo(Scanner teclado) {
		System.out.print("\n\tDigite A Base Do Tri�ngulo\n" + "\tBase: ");
		int base = teclado.nextInt();
		System.out.print("\n\tDigite A Altura Do Tri�ngulo\n" + "\tAltura: ");
		int altura = teclado.nextInt();
		FiguraGeometrica triangulo = new Triangulo(base, altura);
		triangulo.calculaArea();
		System.out.printf("\n\tA �rea Do Tri�ngulo �: %.1f\n", triangulo.getArea());
		System.out.println("\t---------------------------\n");
	}

	public static void areaRetangulo(Scanner teclado) {
		System.out.print("\n\tDigite A Base Do Ret�ngulo\n" + "\tBase: ");
		int base = teclado.nextInt();
		System.out.print("\n\tDigite A Altura Do Ret�ngulo\n" + "\tAltura: ");
		int altura = teclado.nextInt();
		FiguraGeometrica retangulo = new Retangulo(base, altura);
		retangulo.calculaArea();
		System.out.printf("\n\tA �rea Do Ret�ngulo �: %.1f\n", retangulo.getArea());
		System.out.println("\t---------------------------\n");
	}

	public static void areaCirculo(Scanner teclado) {
		System.out.print("\n\tDigite O Raio Do C�rculo\n" + "\tRaio: ");
		int raio = teclado.nextInt();
		FiguraGeometrica circulo = new Circulo(raio);
		circulo.calculaArea();
		System.out.printf("\n\tA �rea Referente Ao Raio Informada �: %.1f\n", circulo.getArea());
		System.out.println("\t------------------------------------------\n");

	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao = 0;

		do {
			System.out.println("\n\tOl�, Seja Bem Vindo Ao C�lculador De �rea\n");
			System.out.print("\n\t(1) - C�lcular A �rea De Um Quadrado;\n"
					+ "\n\t(2) - C�lcular A �rea De Um Tri�ngulo;\n" + "\n\t(3) - C�lcular A �rea De Um Ret�ngulo;\n"
					+ "\n\t(4) - C�lcular A �rea De Um C�rculo;\n" + "\n\t(0) - Sair\n" + "\n\t Op��o: ");
			opcao = teclado.nextInt();
			switch (opcao) {
			case 1:
				areaQuadrado(teclado);
				break;

			case 2:
				areaTriangulo(teclado);
				break;

			case 3:
				areaRetangulo(teclado);
				break;

			case 4:
				areaCirculo(teclado);
				break;

			case 0:
				System.out.println("\n\tMuito Obrigado!\n");
				break;
			default:
				System.out.println("\n\tOp��o Inv�lida\n");
			}
		} while (opcao != 0);
	}
}