import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Teste {

	// threads/ assincrono <- processos que acontecem paralelamente
	// sincrono <- processos que acontecem um apos o outro
	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();
		Aluno aluno1 = new Aluno(1, "camila", new Date(), "quinta serie");
		Aluno aluno2 = new Aluno(2, "Jeconias", new Date(), "2 ano");
		Aluno aluno3 = new Aluno(3, "Ranieri", new Date(), "quinta serie");

		Turma turma1 = new Turma("Fundamental", 1);
		Turma turma2 = new Turma("Medio", 2, alunos);

		//adicionando alunos a lista de alunos.
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);

		//adicionando alunos as turmas equivalentes
		turma1.addFundamental(alunos);
		turma2.addMedio(alunos);
	}

}
