package br.com.zup.aulaquatorze.universidade;

import java.util.Scanner;

public class ProgramaPrincipalUniversidade {

	public static Professor adicionaProfessor(Scanner teclado, Professor professor, Cordenador cordenador) {

		System.out.println("\n\tDigite As Informações De Cadastro Abaixo: \n");

		System.out.print("\n\tNome: ");
		String nome = teclado.next();

		System.out.print("\n\tCPF: ");
		String cpf = teclado.next();

		System.out.print("\n\tNúmero Do Registro: ");
		int numeroRegistro = teclado.nextInt();

		System.out.print("\n\tOrgão De Lotação: ");
		String orgaoLotacao = teclado.next();

		System.out.print("\n\tValor Do Salario: R$ \n");
		float salario = teclado.nextFloat();

		System.out.print("\n\tGraduação: ");
		String nivelGraduacao = teclado.next();

		System.out.print("\n\tDisciplinima Ministrada: ");
		String disciplinaMinistrada = teclado.next();

		return professor = new Professor(nome, cpf, numeroRegistro, orgaoLotacao, salario, nivelGraduacao,
				disciplinaMinistrada);
	}

	public static void aumentaSalario(Professor professor, Cordenador cordenador, FuncionariosAdministrativo adm) {

		professor.aumentaSalario();

		cordenador.aumentaSalario();

		adm.aumentaSalario();
	}

	public static void mostraSalario(Professor professor, Cordenador cordenador, FuncionariosAdministrativo adm) {

		System.out.printf("\n\tO salario do professor é %.2f\n", professor.getSalario());
		System.out.printf("\n\tO salario do cordenador é %.2f\n", cordenador.getSalario());
		System.out.printf("\n\tO salario do administrador é %.2f\n", adm.getSalario());
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao = 0;

		FuncionariosAdministrativo adm = new FuncionariosAdministrativo("Jonh Smith", "53036515845", 2580,
				"Administração", 4200, "RH", "Líder");
		Professor professor = null;
		Cordenador cordenador = new Cordenador("Peter Capaldi", "21546398587", 2687, "Coodenação", 3800);

		do {
			System.out.println("\tBem Vindo Ao Sistem Interno De Controle De Funcionários!");
			System.out.print("\n\tO que Deseja Fazer: \n");
			System.out.print("\n\t(1) - Alterar Salarios\n" + "\n\t(2) - Mostrar Salario\n "
					+ "\n\t(3) - Adicionar Turma\n" + "\n\t(4) - Adicionar Novo Professor\n"
					+ "\n\t(5) - Imprimir Professor\n" + "\n\t(0) - Sair\n" + "\n\tOpção: ");
			opcao = teclado.nextInt();

			switch (opcao) {
			case 1:

				aumentaSalario(professor, cordenador, adm);

				break;
			case 2:
				mostraSalario(professor, cordenador, adm);
				break;

			case 3:
				professor.adicionaTurma();
				System.out.println("\n\tTurma Adicionada Com Sucesso!\n");
				break;
			case 4:
				professor = adicionaProfessor(teclado, professor, cordenador);
				cordenador.adicionaProfessor(professor);
				System.out.println("\n\tProfessor Adicionado Com Sucesso!\n");
				break;
			case 5:
				professor.imprimirDadosProfessores();
				break;
			case 0:
				System.out.println("Muito Obrigado!");
			}
		} while (opcao != 0);
		teclado.close();
	}
}
