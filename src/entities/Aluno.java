package entities;

public class Aluno {
	
	private int idAluno;
	private String nome;
	private String matricula;
	private String cpf;
	
	public Aluno() {
	}
	
	public Aluno(int idAluno, String nome, String matricula, String cpf) {
		this.idAluno = idAluno;
		this.nome = nome;
		this.matricula = matricula;
		this.cpf = cpf;
	}
	
	public Aluno(String nome, String matricula, String cpf) {
		this.nome = nome;
		this.matricula = matricula;
		this.cpf = cpf;
	}

	public int getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

}
