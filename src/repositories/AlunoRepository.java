package repositories;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import entities.Aluno;
import factories.ConnectionFactory;

public class AlunoRepository {

	public void cadastrarAluno(Aluno aluno) {

		Connection conn = ConnectionFactory.getConnection();

		try {
			var stmt = conn.createStatement();
			var resultado = stmt.executeUpdate("INSERT INTO ALUNO (NOME, MATRICULA, CPF) VALUES ('" + aluno.getNome()
					+ "', '" + aluno.getMatricula() + "', '" + aluno.getCpf() + "')");

			if (resultado > 0) {
				System.out.println("Aluno cadastrado com sucesso.");
			} else {
				System.out.println("Aluno não foi cadastrado");
			}

		} catch (Exception e) {
			System.out.println("Erro ao cadastrar aluno: " + e.getMessage());
		} finally {
			try {
				conn.close();
			} catch (Exception e2) {
				System.out.println("Erro ao fechar conexão: " + e2.getMessage());
			}
		}
	}

	public void atualizarAluno(Aluno aluno) {
		Connection conn = ConnectionFactory.getConnection();

		try {
			var stmt = conn.createStatement();
			var resultado = stmt.executeUpdate(
					"UPDATE ALUNO SET NOME = '" + aluno.getNome() + "', MATRICULA = '" + aluno.getMatricula()
							+ "', CPF = '" + aluno.getCpf() + "' WHERE ID_ALUNO = " + aluno.getIdAluno());

			if (resultado > 0) {
				System.out.println("Aluno atualizado com sucesso.");
			} else {
				System.out.println("Aluno não foi atualizado.");

			}
		} catch (Exception e) {
			System.out.println("Erro ao atualizar aluno: " + e.getMessage());
		} finally {
			try {
				conn.close();
			} catch (Exception e2) {
				System.out.println("Erro ao fechar conexão: " + e2.getMessage());
			}
		}

		System.out.println("Aluno atualizado com sucesso.");
	}

	public void removerAluno(int idAluno) {
		Connection conn = ConnectionFactory.getConnection();

		try {
			var stmt = conn.createStatement();
			var resultado = stmt.executeUpdate("DELETE FROM ALUNO WHERE ID_ALUNO = " + idAluno);

			if (resultado > 0) {
				System.out.println("Aluno removido com sucesso.");
			} else {
				System.out.println("Aluno não foi removido.");
			}

		} catch (Exception e) {
			System.out.println("Erro ao remover aluno: " + e.getMessage());
		} finally {
			try {
				conn.close();
			} catch (Exception e2) {
				System.out.println("Erro ao fechar conexão: " + e2.getMessage());
			}
		}
	}

	public Aluno consultarAluno(int idAluno) {
		Connection conn = ConnectionFactory.getConnection();

		try {
			var stmt = conn.createStatement();
			ResultSet resultado = stmt.executeQuery("SELECT * FROM ALUNO WHERE ID_ALUNO = " + idAluno);

			if (resultado.next()) {
				Aluno aluno = new Aluno(resultado.getInt("ID_ALUNO"), resultado.getString("NOME"),
						resultado.getString("MATRICULA"), resultado.getString("CPF"));
				System.out.println("Aluno consultado com sucesso");
				return aluno;
			}

		} catch (Exception e) {
			System.out.println("Erro ao consultar aluno: " + e.getMessage());
		} finally {
			try {
				conn.close();
			} catch (Exception e2) {
				System.out.println("Erro ao fechar conexão: " + e2.getMessage());
			}
		}
		return null;	}

	public ArrayList<Aluno> listarAlunos() {
		Connection conn = ConnectionFactory.getConnection();
		
		try {
			var stmt = conn.createStatement();
			ResultSet resultado = stmt.executeQuery("SELECT * FROM ALUNO");

			ArrayList<Aluno> alunos = new ArrayList<Aluno>();

			while (resultado.next()) {
				Aluno aluno = new Aluno(resultado.getInt("ID_ALUNO"), resultado.getString("NOME"),
						resultado.getString("MATRICULA"), resultado.getString("CPF"));
				alunos.add(aluno); 
			}

			System.out.println("Alunos listados com sucesso.");
			return alunos;

		} catch (Exception e) {
			System.out.println("Erro ao listar alunos: " + e.getMessage());
		} finally {
			try {
				conn.close();
			} catch (Exception e2) {
				System.out.println("Erro ao fechar conexão: " + e2.getMessage());
			}
		}
		return null;
	}

}
