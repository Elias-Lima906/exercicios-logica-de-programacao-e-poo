package br.com.zup.aulaquatorze.universidade;

import java.util.Scanner;

public class ProgramaPrincipalUniversidade {

	public static Professor adicionaProfessor(Scanner teclado, Professor professor, Cordenador cordenador) {

		System.out.println("\n\tDigite As Informações De Cadastro Abaixo.");

		System.out.print("\n\tNome: ");
		String nome = teclado.next();

		System.out.print("\n\tCPF: ");
		String cpf = teclado.next();

		System.out.print("\n\tNúmero Do Registro: ");
		int numeroRegistro = teclado.nextInt();

		System.out.print("\n\tOrgão De Lotação: ");
		String orgaoLotacao = teclado.next();

		System.out.print("\n\tValor Do Salario: R$ ");
		float salario = teclado.nextFloat();

		System.out.print("\n\tGraduação: ");
		String nivelGraduacao = teclado.next();

		System.out.print("\n\tDisciplinima Ministrada: ");
		String disciplinaMinistrada = teclado.next();

		teclado.nextLine();

		System.out.println("\n\n\t## Professor Adicionado Com Sucesso! ##\n");

		return professor = new Professor(nome, cpf, numeroRegistro, orgaoLotacao, salario, nivelGraduacao,
				disciplinaMinistrada);

	}

	public static void aumentaSalario(Professor professor, Cordenador cordenador, FuncionarioAdministrativo adm) {

		professor.aumentaSalario();
		cordenador.aumentaSalario();
		adm.aumentaSalario();

		System.out.print("\n\t## Salario Alterado Com Sucesso! ##");
		System.out.println("\n\t-----------------------------\n");
	}

	public static void mostraSalario(Professor professor, Cordenador cordenador, FuncionarioAdministrativo adm) {

		System.out.print("\n\t-----------------------------\n");
		System.out.println("\t### Folha De Pagamento ###");
		System.out.printf("\n\tO salario do professor é %.2f\n", professor.getSalario());
		System.out.printf("\n\tO salario do cordenador é %.2f\n", cordenador.getSalario());
		System.out.printf("\n\tO salario do administrador é %.2f\n", adm.getSalario());
		System.out.println("\t------------------------------\n");

	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao = 0;

		FuncionarioAdministrativo adm = new FuncionarioAdministrativo("Jonh Smith", "53036515845", 2580,
				"Administração", 4200, "RH", "Líder");
		Professor professor = null;
		Cordenador cordenador = new Cordenador("Peter Capaldi", "21546398587", 2687, "Coodenação", 3800);

		do {
			System.out.println("\tBem Vindo Ao Sistem Interno De Controle De Funcionários!");
			System.out.print("\n\tO que Deseja Fazer: \n");
			System.out.print("\n\t(1) - Adicionar Novo Professor\n " + "\n\t(2) - Adicionar Turma\n"
					+ "\n\t(3) - Mostrar Salario\n" + "\n\t(4) - a=Aumentar Salario\n"
					+ "\n\t(5) - Imprimir Professor\n" + "\n\t(0) - Sair\n" + "\n\tOpção: ");
			opcao = teclado.nextInt();

			switch (opcao) {
			case 1:

				professor = adicionaProfessor(teclado, professor, cordenador);
				cordenador.adicionaProfessor(professor);

				break;
			case 2:
				professor.adicionaTurma();
				System.out.println("\n\t## Turma Adicionada Com Sucesso! ##\n");
				break;

			case 3:
				mostraSalario(professor, cordenador, adm);
				break;

			case 4:
				aumentaSalario(professor, cordenador, adm);
				break;

			case 5:
				cordenador.imprimirProfessores();
				break;

			case 0:
				System.out.println("### Muito Obrigado! ###");
				break;

			default:
				System.out.println("### Opção Inválida! ###");

			}
		} while (opcao != 0);
		teclado.close();
	}
}
