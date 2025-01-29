package main;

import controllers.AlunoController;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AlunoController alunoController = new AlunoController();

		System.out.println("Sistema de gerenciamento de alunos");
		
		String opcao = ""; 
		
		while (!opcao.equals("6")) {
			System.out.println("1 - Cadastrar aluno");
			System.out.println("2 - Atualizar aluno");
			System.out.println("3 - Remover aluno");
			System.out.println("4 - Consultar aluno");
			System.out.println("5 - Listar alunos");
			System.out.println("6 - Sair");
			System.out.println("Digite a opção desejada: ");
			
			opcao = alunoController.scanner.nextLine();

			switch (opcao) {
			case "1":
				alunoController.cadastrarAluno();
				break;
			case "2":
				alunoController.atualizarAluno();
				break;
			case "3":
				alunoController.removerAluno();
				break;
			case "4":
				alunoController.consultarAluno();
				break;
			case "5":
				alunoController.listaAlunos();
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}
		}

	}
}
