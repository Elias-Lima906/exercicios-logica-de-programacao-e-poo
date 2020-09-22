package br.com.zup.exercicios.auladoze.controleremoto;

/*
 * 4. Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o
 * volume e trocar os canais da televisão. O controle de volume permite:
 * aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
 * aumentar e diminuir o número do canal em uma unidade trocar para um canal
 * indicado; consultar o valor do volume de som e o canal selecionado Crie
 * depois um programa principal que interaja com as suas classes, não se esqueça
 * dos modificadores de acesso e dos getters e setters em suas classes.
 */

public class Televisao {

	private int volume;
	private int canais;

	public Televisao() {
		this.volume = 0;
		this.canais = 0;
	}

	public void setVolume(int volumeAlterado) {
		this.volume = volumeAlterado;
	}

	public int getVolume() {
		return this.volume;
	}

	public void setCanais(int canalAlterado) {
		this.canais = canalAlterado;
	}

	public int getCanais() {
		return this.canais;
	}
}