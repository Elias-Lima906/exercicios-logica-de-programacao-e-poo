package br.com.zup.aulavinteeum;

import java.util.ArrayList;
import java.util.List;

public class ExercicioArrayList {

	public static void main(String[] args) {

		/*
		 * Escreva um programa em Java que crie um ArrayList adicione algumas cores
		 * (string) e as imprima na tela.
		 */

		List<String> cores = new ArrayList<String>();		
		
		cores.add("Azul");
		
		cores.add("Branco");
		cores.add("Preto");
		cores.add("Roxo");
		cores.add("Amarelo");
		cores.add("Vermelho");
		cores.add("Verde");
		cores.add("Laranja");
		
		for (String cor : cores) {
			System.out.println(cor);
		}
		
		cores.remove("Amarelo");
		cores.remove("Verde");
		
		System.out.println();
		
		for (String cor : cores) {
			System.out.println(cor);
		}
		
		
	}

}
