package br.com.zup.exercicios.aulaonze.elevador;

public class elevador {

	/*
	 * 3. Crie uma classe denominada Elevador para armazenar as informa��es de um
	 * elevador dentro de um pr�dio. A classe deve armazenar o andar atual (t�rreo =
	 * 0), total de andares no pr�dio (desconsiderando o t�rreo), capacidade do
	 * elevador e quantas pessoas est�o presentes nele. A classe deve tamb�m
	 * disponibilizar os seguintes m�todos: Entra : para acrescentar uma pessoa no
	 * elevador (s� deve acrescentar se ainda houver espa�o); Sai : para remover uma
	 * pessoa do elevador (s� deve remover se houver algu�m dentro dele); Sobe :
	 * para subir um andar (n�o deve subir se j� estiver no �ltimo andar); Desce :
	 * para descer um andar (n�o deve descer se j� estiver no t�rreo);
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
