package br.com.zup.aulaoito;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExercicioSeis {

	// Leia do usu�rio os nomes de n pe�as para um or�amento e grave
	// (linha a linha) em um arquivo chamado "pe�as.txt".

	public static void main(String[] args) throws IOException {

		Scanner teclado = new Scanner(System.in);
		FileWriter escrita = new FileWriter("pe�as.txt");

		String pecas;
		int quantidadeDePecas = 0;

		System.out.println("Ol� Us�ario;\n");
		System.out.println("Digite o N�mero De Pe�as Que Deseja Adicionar A lista: ");
		System.out.print("\nQuantidade: ");
		quantidadeDePecas = teclado.nextInt();

		for (int i = 0; i < quantidadeDePecas; i++) {
			System.out.print("\n\nDigite o Nome Da Pe�a: ");
			pecas = teclado.next();

			escrita.append(String.format("%s\n", pecas));

		}
		escrita.close();
		teclado.close();

	}

}
