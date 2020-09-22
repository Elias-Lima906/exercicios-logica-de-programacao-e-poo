package br.com.zup.exercicios.aulaoito;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExercicioCinco {

	// Leia o arquivo gerado no exercício anterior e exiba cada linha
	// na tela trocando todas as letras a por x.

	public static void main(String[] args) throws IOException {

		FileReader estrutura = new FileReader("nomes.txt");
		BufferedReader leitor = new BufferedReader(estrutura);

		String linha;
		while ((linha = leitor.readLine()) != null) {
			System.out.println(linha.replace("a", "x"));
		}

		leitor.close();
		estrutura.close();

	}

}
