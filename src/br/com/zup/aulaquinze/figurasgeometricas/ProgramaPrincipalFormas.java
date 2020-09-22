package br.com.zup.aulaquinze.figurasgeometricas;

import java.util.Scanner;

public class ProgramaPrincipalFormas {

	public static void areaQuadrado(Scanner teclado) {
		System.out.print("\n\tDigite o Comprimento De Um Dos Lados Do Quadrado.\n" + "\tLado: ");
		int lado = teclado.nextInt();
		FiguraGeometrica quadrado = new Quadrado(lado);
		quadrado.calculaArea();
		System.out.printf("\n\tA Área Do Quadrado é: %.1f\n", quadrado.getArea());
		System.out.println("\t--------------------------\n");
	}

	public static void areaTriangulo(Scanner teclado) {
		System.out.print("\n\tDigite A Base Do Triângulo\n" + "\tBase: ");
		int base = teclado.nextInt();
		System.out.print("\n\tDigite A Altura Do Triângulo\n" + "\tAltura: ");
		int altura = teclado.nextInt();
		FiguraGeometrica triangulo = new Triangulo(base, altura);
		triangulo.calculaArea();
		System.out.printf("\n\tA Área Do Triângulo é: %.1f\n", triangulo.getArea());
		System.out.println("\t---------------------------\n");
	}

	public static void areaRetangulo(Scanner teclado) {
		System.out.print("\n\tDigite A Base Do Retângulo\n" + "\tBase: ");
		int base = teclado.nextInt();
		System.out.print("\n\tDigite A Altura Do Retângulo\n" + "\tAltura: ");
		int altura = teclado.nextInt();
		FiguraGeometrica retangulo = new Retangulo(base, altura);
		retangulo.calculaArea();
		System.out.printf("\n\tA Área Do Retângulo é: %.1f\n", retangulo.getArea());
		System.out.println("\t---------------------------\n");
	}

	public static void areaCirculo(Scanner teclado) {
		System.out.print("\n\tDigite O Raio Do Círculo\n" + "\tRaio: ");
		int raio = teclado.nextInt();
		FiguraGeometrica circulo = new Circulo(raio);
		circulo.calculaArea();
		System.out.printf("\n\tA Área Referente Ao Raio Informada é: %.1f\n", circulo.getArea());
		System.out.println("\t------------------------------------------\n");

	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao = 0;

		do {
			System.out.println("\n\tOlá, Seja Bem Vindo Ao Cálculador De Área\n");
			System.out.print("\n\t(1) - Cálcular A Área De Um Quadrado;\n"
					+ "\n\t(2) - Cálcular A Área De Um Triângulo;\n" + "\n\t(3) - Cálcular A Área De Um Retângulo;\n"
					+ "\n\t(4) - Cálcular A Área De Um Círculo;\n" + "\n\t(0) - Sair\n" + "\n\t Opção: ");
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
				System.out.println("\n\tOpção Inválida\n");
			}
		} while (opcao != 0);
	}
}