import java.util.ArrayList;
import java.util.List;

public class Turma implements TurmaInterface {

	private String nome;
	private int id;
	private List<Aluno> alunos;

	public Turma(String nome, int id) {
		this.nome = nome;
		this.id = id;
	}

	public Turma(String nome, int id, List<Aluno> alunos) {
		this.nome = nome;
		this.id = id;
		this.alunos = alunos;
	}

	public void addAluno(Aluno aluno) {
		// Criar método exigindo parâmetros para utilização
		alunos.add(aluno);
	}

	public void addAluno(List<Aluno> alunos) {
		// Criar método exigindo parâmetros para utilização
		alunos.addAll(alunos);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	// Isolar comportamentos no java para reutilização de codigo
	// acesso -> retorno -> nome do metodo -> ( passagem de valores por parametro )
	@Override
	public List<Aluno> addFundamental(List<Aluno> alunos) {
		// variavel auxiliar
		List<Aluno> fundamental = new ArrayList<Aluno>();
		for (Aluno aluno : alunos) {
			switch (aluno.getSerie()) {
			case "quinta serie":
				fundamental.add(aluno);
				break;
			case "sexta serie":
				fundamental.add(aluno);
				break;
			case "setima serie":
				fundamental.add(aluno);
				break;
			case "oitava serie":
				fundamental.add(aluno);
				break;
			case "nona serie":
				fundamental.add(aluno);
				break;
			default:
				break;
			}
		}
		// retorna varial auxiliar
		return fundamental;
	}

	@Override
	public List<Aluno> addMedio(List<Aluno> alunos) {
		List<Aluno> medio = new ArrayList<Aluno>();
		for (Aluno aluno : alunos) {
			switch (aluno.getSerie()) {
			case "1 ano":
				medio.add(aluno);
				break;
			case "2 ano":
				medio.add(aluno);
				break;
			case "3 ano":
				medio.add(aluno);
				break;
			default:
				break;
			}
		}
		return medio;
	}

}
