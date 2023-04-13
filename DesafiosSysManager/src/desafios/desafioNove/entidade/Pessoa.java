package desafios.desafioNove.entidade;

public class Pessoa {
	
	@SuppressWarnings("unused")
	private String nome;
	
	private byte idade;

	public Pessoa(String nome, byte idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public byte getIdade() {
		return idade;
	}

}
