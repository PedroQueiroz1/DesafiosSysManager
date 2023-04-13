package desafios.desafioDez.entidade;

public class Pessoa {

	private String nome;
	
	private float altura;
	
	private float peso;
	

	public Pessoa(String nome, float altura, float peso) {
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public float getAltura() {
		return altura;
	}

	public float getPeso() {
		return peso;
	}
	
}
