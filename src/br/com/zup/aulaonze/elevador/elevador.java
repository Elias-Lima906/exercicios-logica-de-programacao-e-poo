package br.com.zup.exercicios.aulaonze.elevador;

public class elevador {

	/*
	 * 3. Crie uma classe denominada Elevador para armazenar as informações de um
	 * elevador dentro de um prédio. A classe deve armazenar o andar atual (térreo =
	 * 0), total de andares no prédio (desconsiderando o térreo), capacidade do
	 * elevador e quantas pessoas estão presentes nele. A classe deve também
	 * disponibilizar os seguintes métodos: Entra : para acrescentar uma pessoa no
	 * elevador (só deve acrescentar se ainda houver espaço); Sai : para remover uma
	 * pessoa do elevador (só deve remover se houver alguém dentro dele); Sobe :
	 * para subir um andar (não deve subir se já estiver no último andar); Desce :
	 * para descer um andar (não deve descer se já estiver no térreo);
	 */

	private int andarAtual;
	private int totalAndares;
	private int capacidadeElevador;
	private int pessoasPresentes;

	public elevador(int capacidadeElevador, int totalAndares) {

		this.capacidadeElevador = capacidadeElevador;
		this.totalAndares = totalAndares;
		this.andarAtual = 0;
		this.pessoasPresentes = 0;

	}

	public void entra() {

		if (this.pessoasPresentes < this.capacidadeElevador) {
			this.pessoasPresentes++;
		}
	}

	public void sai() {

		if (this.pessoasPresentes > 0) {
			this.pessoasPresentes--;
		}
	}

	public void sobeAndar() {

		if (this.andarAtual < this.totalAndares) {
			this.andarAtual++;
		}
	}

	public void desceAndar() {

		if (this.totalAndares > 0) {
			this.andarAtual--;
		}
	}

	public int getPessoasPresentes() {
		return this.pessoasPresentes;
	}

	public int getAnadarAtual() {
		return this.andarAtual;
	}
}
