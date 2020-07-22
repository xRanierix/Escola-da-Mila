import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Turma {
	
	private String nome;
	private int id;
	private List <Aluno> alunos;
	
	public Turma(String nome, int id, List<Aluno> alunos) {
		
		this.nome = nome;
		this.id = id;
		this.alunos = alunos;
	}

	public void addAluno(Aluno aluno) throws ParseException { //Criar método exigindo parâmetros para utilização
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
	      //Importa padrão de data, converte a string para o padrão solicitado e vc alimenta no colchete
	      //Date date = formatter.parse("20-06-2014");
		
		alunos.addAll(alunos)
		
	}
	
}
