package controllers;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Aluno;
import repositories.AlunoRepository;

public class AlunoController {

	public Scanner scanner = new Scanner(System.in);

	public void cadastrarAluno(String nome, String matricula, String cpf) {

		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		aluno.setMatricula(matricula);
		aluno.setCpf(cpf);

		AlunoRepository repository = new AlunoRepository();
		repository.cadastrarAluno(aluno);
	}

	public void cadastrarAluno() {

		System.out.println("Cadastrando aluno...");
		System.out.println("Insira o nome do aluno: ");
		String nome = scanner.nextLine();
		System.out.println("Insira a matrícula do aluno: ");
		String matricula = scanner.nextLine();
		System.out.println("Insira o CPF do aluno: ");
		String cpf = scanner.nextLine();

		Aluno aluno = new Aluno(nome, matricula, cpf);

		AlunoRepository repository = new AlunoRepository();
		repository.cadastrarAluno(aluno);
	}

	public void atualizarAluno() {
		System.out.println("Atualizando aluno...");
		System.out.println("Insira o ID do aluno que deseja atualizar: ");
		int idAluno = Integer.parseInt(scanner.nextLine());

		System.out.println("Insira o nome do aluno: ");
		String nome = scanner.nextLine();
		System.out.println("Insira a matrícula do aluno: ");
		String matricula = scanner.nextLine();
		System.out.println("Insira o CPF do aluno: ");
		String cpf = scanner.nextLine();

		Aluno aluno = new Aluno(idAluno, nome, matricula, cpf);

		AlunoRepository repository = new AlunoRepository();
		repository.atualizarAluno(aluno);
	}

	public void atualizarAluno(int idAluno, String nome, String matricula, String cpf) {
		Aluno aluno = new Aluno();
		aluno.setIdAluno(idAluno);
		aluno.setNome(nome);
		aluno.setMatricula(matricula);
		aluno.setCpf(cpf);

		AlunoRepository repository = new AlunoRepository();
		repository.atualizarAluno(aluno);
	}

	public void removerAluno() {
		System.out.println("Removendo aluno...");
		System.out.println("Insira o ID do aluno que deseja remover: ");
		int idAluno = Integer.parseInt(scanner.nextLine());
		AlunoRepository repository = new AlunoRepository();
		repository.removerAluno(idAluno);
	}

	public void removerAluno(int idAluno) {
		AlunoRepository repository = new AlunoRepository();
		repository.removerAluno(idAluno);
	}

	public void listaAlunos() {
		AlunoRepository repository = new AlunoRepository();
		ArrayList<Aluno> alunos = repository.listarAlunos();
		
		alunos.forEach(aluno -> {
            System.out.println("ID: " + aluno.getIdAluno());
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Matrícula: " + aluno.getMatricula());
            System.out.println("CPF: " + aluno.getCpf());
            System.out.println("----------------------------");});
	}

	public ArrayList<Aluno> listarAlunos() {
		AlunoRepository repository = new AlunoRepository();
		return repository.listarAlunos();
	}

	public void consultarAluno() {
		System.out.println("Consultando aluno...");
		System.out.println("Insira o ID do aluno que deseja consultar: ");
		int idAluno = Integer.parseInt(scanner.nextLine());
		AlunoRepository repository = new AlunoRepository();

		Aluno aluno = repository.consultarAluno(idAluno);

		if (aluno != null) {
			System.out.println("Aluno encontrado: ");
			System.out.println("ID: " + aluno.getIdAluno());
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("Matrícula: " + aluno.getMatricula());
			System.out.println("CPF: " + aluno.getCpf());
		} else {
			System.out.println("Aluno não encontrado.");
		}
	}

	public Aluno consultarAluno(int idAluno) {
		AlunoRepository repository = new AlunoRepository();
		return repository.consultarAluno(idAluno);
	}

}
