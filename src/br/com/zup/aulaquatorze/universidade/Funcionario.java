package br.com.zup.aulaquatorze.universidade;


//1. Modele as classes referentes aos funcion�rios de uma universidade, que ser�o os professores,
//coordenadores, e funcion�rios administrativos.
//Os atributos comuns de todos os funcionarios ser�o: Nome, CPF, n�mero de registro, �rg�o
//de lota��o e sal�rio.
//
//Os professores possuem os atributos: N�vel de gradua��o, disciplina ministrada e
//quantidade de alunos e quantidade de turmas.
//
//Os coordenadores possuem os atributos: professoresSupervisionados[10].

//Os funcion�rios administrativos possuem os atributos: Fun��o Administrativa e senioridade.

//Implemente, al�m dos getters e setters e os constr"Peter Capaldi"utores, os seguintes m�todos:

//Aumento de sal�rio: para todos menos os coordenadores aumenta o sal�rio em 10% e para
//os coordenadores o aumento � de 5%.
//
//Adiciona turma para os professores.
//
//Adiciona professor (para os coordenadores): observe que um coordenador s� pode
//coordenar 10 professores.

public class Funcionario {


	private String nome;
	private String cpf;
	private int numeroRegistro;
	private String orgaoLotacao;
	private float salario;

	public Funcionario(String nome, String cpf, int numeroRegistro, String orgaoLotacao, float salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.numeroRegistro = numeroRegistro;
		this.orgaoLotacao = orgaoLotacao;
		this.salario = salario;
	
	}
	public void aumentaSalario() {
		this.setSalario(this.getSalario() * 1.1f);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public String getOrgaoLotacao() {
		return orgaoLotacao;
	}

	public void setOrgaoLotacao(String orgaoLotacao) {
		this.orgaoLotacao = orgaoLotacao;
	}

	public float getSalario() {
		return salario;
	}

	public float setSalario(float salario) {
		return this.salario = salario;
	}

}
