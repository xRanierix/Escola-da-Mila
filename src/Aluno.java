import java.util.Date;

public class Aluno {

	private int id;
	private String nome;
	private Date dataNasc;
	private String serie;
	
	
	public Aluno(int id, String nome, Date dataNasc, String serie) {
		
		this.id = id;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.serie = serie;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Date getDataNasc() {
		return dataNasc;
	}


	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	
	public String getSerie() {
		return serie;
	}


	public void setSerie(String serie) {
		this.serie = serie;
	}
	
	
	
}
