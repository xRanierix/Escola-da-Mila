import java.util.List;

public class Professor {

	private String nome;
	private String disciplina;
	private List<Turma> turma;
	
	public Professor(String nome, String disciplina, List<Turma> turma) {
		
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


	public List<Turma> getTurma() {
		return turma;
	}


	public void setTurma(List<Turma> turma) {
		this.turma = turma;
	}
	
	
	
}
