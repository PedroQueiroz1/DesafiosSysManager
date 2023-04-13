package desafios.desafioNove.entidade;

public class Pessoa {
	
	private String nome;
	
	private byte idade;

	public Pessoa(String nome, byte idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public byte getIdade() {
		return idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(byte idade) {
		this.idade = idade;
	}
	
}
