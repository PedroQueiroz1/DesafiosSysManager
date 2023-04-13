package desafios.desafioOito.entidade;

public class Candidato {
	
	private String nome;
	
	private byte numero;
	
	private short qtdVoto;
	
	public Candidato(String nome, byte numero) {
		this.nome = nome;
		this.numero = numero;
	}
	
	public Candidato(String nome, byte numero, short voto) {
		this.nome = nome;
		this.numero = numero;
		this.qtdVoto = voto;
	}


	public String getNome() {
		return nome;
	}

	public byte getNumero() {
		return numero;
	}


	public short getVoto() {
		return qtdVoto;
	}


	public void setVoto(short voto) {
		this.qtdVoto = voto;
	}

	@Override
	public String toString() {
		return "Candidato [nome=" + nome + ", numero=" + numero + ", qtdVoto=" + qtdVoto + "]";
	}
	
}
