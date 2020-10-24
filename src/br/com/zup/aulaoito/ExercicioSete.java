package br.com.zup.aulaoito;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExercicioSete {

	// Leia o arquivo gerado no programa anterior e imprima na tela
	// (linha a linha) o 3o caractere de cada uma das linhas do arquivo.

	public static void main(String[] args) throws IOException {

		FileReader estrutura = new FileReader("peças.txt");
		BufferedReader leitor = new BufferedReader(estrutura);

		String lerLinhas;

		while ((lerLinhas = leitor.readLine()) != null) {

		System.out.println(lerLinhas.charAt(2));
		}

		leitor.close();
		estrutura.close();

	}

}
