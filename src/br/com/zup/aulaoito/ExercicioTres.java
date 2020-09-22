package br.com.zup.exercicios.aulaoito;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExercicioTres {

	// Refaça o exercício número 4 da lista de exercícios em sala (00),
	// mas ao invés de escrever a saída dele na tela, escreva num arquivo chamado
	// "relatorioParcelas.txt".

	public static void main(String[] args) throws IOException {

		FileWriter escrita = new FileWriter("relatorioParcelas.txt");

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o Valor Da Divída");

		float valorDaDivida = teclado.nextFloat();

		float valorJurosTres = valorDaDivida * 0.10f;
		float valorJurosSeis = valorDaDivida * 0.15f;
		float valorJurosNove = valorDaDivida * 0.20f;
		float valorJurosDoze = valorDaDivida * 0.25f;

		float valorDividaTres = valorJurosTres + valorDaDivida;
		float valorDividaSeis = valorJurosSeis + valorDaDivida;
		float valorDividaNove = valorJurosNove + valorDaDivida;
		float valorDividaDoze = valorJurosDoze + valorDaDivida;

		escrita.write(String.format("%s%s%s%s\n\n", "|Valor da Dívida", "|Valor dos Juros", "|Quantidade de Parcelas",
				"|Valor da Parcela |"));
		escrita.write(String.format(" %s %.2f %9s %.2f %14s %18s %.2f", " R$", valorDaDivida, "R$", 0.00, "1", "R$",
				valorDaDivida));
		escrita.write(String.format("\n %s %.2f %9s %.2f  %11s %18s %.2f ", " R$", valorDividaTres, "R$",
				valorJurosTres, "3", "R$", valorDividaTres / 3));
		escrita.write(String.format("\n %s %.2f %9s %.2f  %11s %18s %.2f", " R$", valorDividaSeis, "R$", valorJurosSeis,
				"6", "R$", valorDividaSeis / 6));
		escrita.write(String.format("\n %s %.2f %9s %.2f  %11s %18s %.2f", " R$", valorDividaNove, "R$", valorJurosNove,
				"9", "R$", valorDividaNove / 9));
		escrita.write(String.format("\n %s %.2f %9s %.2f  %11s %18s %.2f", " R$", valorDividaDoze, "R$", valorJurosDoze,
				"12", "R$", valorDividaDoze / 12));

		teclado.close();
		escrita.close();

	}

}
