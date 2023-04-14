package desafios.desafioCinco.entidade;

public class Pessoa {

	private String nome;
	
	private float altura;
	
	private char sexo;

	
	public Pessoa(String nome, float altura, char sexo) {
		this.nome = nome;
		this.altura = altura;
		this.sexo = sexo;
	}
	
	
	public String getNome() {
		return nome;
	}

	public float getAltura() {
		return altura;
	}

	public char getSexo() {
		return sexo;
	}


	@Override
	public String toString() {
		return "Nome: " + nome + " | Altura: " + altura + " | Sexo: " + sexo;
	}

}
