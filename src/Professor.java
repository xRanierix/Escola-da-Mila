
public class Professor {

	private String nome;
	private String disciplina;
	private Turma turma;
	
	
	public Professor(String nome, String disciplina, Turma turma) {
		
		this.nome = nome;
		this.disciplina = disciplina;
		this.turma = turma;
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDisciplina() {
		return disciplina;
	}


	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}


	public Turma getTurma() {
		return turma;
	}


	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	
	
	
}
