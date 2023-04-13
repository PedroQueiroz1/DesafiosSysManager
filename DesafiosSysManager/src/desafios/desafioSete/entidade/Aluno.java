package desafios.desafioSete.entidade;

public class Aluno {
	
	private String nome;
	
	private float nota1;
	
	private float nota2;
	
	private String situacao;

	
	public Aluno(String nome, float nota1, float nota2, String situacao) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.situacao = situacao;
	}

	
	public String getNome() {
		return nome;
	}

	public float getNota1() {
		return nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
}
