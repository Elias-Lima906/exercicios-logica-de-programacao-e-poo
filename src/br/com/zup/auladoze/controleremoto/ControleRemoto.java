package br.com.zup.exercicios.auladoze.controleremoto;

public class ControleRemoto {

	/*
	 * 4. Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o
	 * volume e trocar os canais da televisão. O controle de volume permite:
	 * aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
	 * aumentar e diminuir o número do canal em uma unidade ou trocar para um canal
	 * indicado; consultar o valor do volume de som e o canal selecionado Crie
	 * depois um programa principal que interaja com as suas classes, não se esqueça
	 * dos modificadores de acesso e dos getters e setters em suas classes.
	 */

	public ControleRemoto() {

	}

	Televisao tv = new Televisao();

	public void aumentarVolume() {
		int volumeMais = tv.getVolume();

		if (volumeMais < 100) {
			volumeMais += 1;
			tv.setVolume(volumeMais);
		}
	}

	public void diminuirVolume() {
		int volumeMenos = tv.getVolume();

		if (volumeMenos > 0) {
			volumeMenos -= 1;
			tv.setVolume(volumeMenos);
		}
	}

	public void trocarCanalMais() {

		int canalMais = tv.getCanais();
		canalMais += 1;
		tv.setCanais(canalMais);
	}

	public void trocarCanalMenos() {
		int canalMenos = tv.getCanais();
		canalMenos -= 1;
		tv.setCanais(canalMenos);
	}

	public void escolhercanal(int canalLido) {
		if (canalLido > 0) {
			tv.setCanais(canalLido);
		}
	}

	public void mostrarInformaçõesTv() {
		System.out.printf("\n\tVolume: %d", tv.getVolume());
		System.out.printf("\n\tCanal: %d\n\n", tv.getCanais());
	}
}