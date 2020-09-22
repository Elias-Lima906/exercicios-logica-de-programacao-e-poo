package  br.com.zup.exercicios.aulacinco;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

		System.out.printf("%s%s%s%s\n", " ______________", " _______________", " ______________________",
				" __________________");
		System.out.printf("%s%s%s%s\n", "|Valor da Dívida", "|Valor dos Juros", "|Quantidade de Parcelas",
				"|Valor da Parcela |");
		System.out.printf("%s%s%s%s\n", "|---------------", "|---------------", "|----------------------",
				"|-----------------|");

		System.out.printf("%1s %s %.2f %3s %3s %.2f %6s %5s %16s %3s %.2f %5s", "|", " R$", valorDaDivida, "|", "R$",
				0.00, "|", "1", "|", "R$", valorDaDivida, "|");
		System.out.printf("\n%1s %s %.2f %3s %3s %.2f %4s %5s %16s %3s %.2f %6s", "|", " R$", valorDividaTres, "|",
				"R$", valorJurosTres, "|", "3", "|", "R$", valorDividaTres / 3, "|");
		System.out.printf("\n%1s %s %.2f %3s %3s %.2f %4s %5s %16s %3s %.2f %6s", "|", " R$", valorDividaSeis, "|",
				"R$", valorJurosSeis, "|", "6", "|", "R$", valorDividaSeis / 6, "|");
		System.out.printf("\n%1s %s %.2f %3s %3s %.2f %4s %5s %16s %3s %.2f %6s", "|", " R$", valorDividaNove, "|",
				"R$", valorJurosNove, "|", "9", "|", "R$", valorDividaNove / 9, "|");
		System.out.printf("\n%1s %s %.2f %3s %3s %.2f %4s %5s %16s %3s %.2f %6s", "|", " R$", valorDividaDoze, "|",
				"R$", valorJurosDoze, "|", "12", "|", "R$", valorDividaDoze / 12, "|");
		System.out.printf("\n%s", "|________________________________________________________________________|");

		teclado.close();
	}
}
