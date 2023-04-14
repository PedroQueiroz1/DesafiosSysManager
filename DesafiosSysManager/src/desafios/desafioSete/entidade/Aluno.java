package desafios.desafioSete.entidade;

public class Aluno {
	
	@SuppressWarnings("unused")
	private String nome;
	
	@SuppressWarnings("unused")
	private float nota1;
	
	@SuppressWarnings("unused")
	private float nota2;
	
	@SuppressWarnings("unused")
	private String situacao;

	
	public Aluno(String nome, float nota1, float nota2, String situacao) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.situacao = situacao;
	}

	
}
