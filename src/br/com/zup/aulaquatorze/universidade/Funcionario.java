package br.com.zup.aulaquatorze.universidade;


//1. Modele as classes referentes aos funcionários de uma universidade, que serão os professores,
//coordenadores, e funcionários administrativos.
//Os atributos comuns de todos os funcionarios serão: Nome, CPF, número de registro, órgão
//de lotação e salário.
//
//Os professores possuem os atributos: Nível de graduação, disciplina ministrada e
//quantidade de alunos e quantidade de turmas.
//
//Os coordenadores possuem os atributos: professoresSupervisionados[10].

//Os funcionários administrativos possuem os atributos: Função Administrativa e senioridade.

//Implemente, além dos getters e setters e os constr"Peter Capaldi"utores, os seguintes métodos:

//Aumento de salário: para todos menos os coordenadores aumenta o salário em 10% e para
//os coordenadores o aumento é de 5%.
//
//Adiciona turma para os professores.
//
//Adiciona professor (para os coordenadores): observe que um coordenador só pode
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
