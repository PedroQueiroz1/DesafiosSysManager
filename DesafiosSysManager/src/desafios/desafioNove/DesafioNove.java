package desafios.desafioNove;

import java.util.Scanner;

import desafios.desafioNove.entidade.Pessoa;
import desafios.desafioNove.sistema.Sistema;

public class DesafioNove {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual o seu nome?");
		String nome = scanner.nextLine();
		
		System.out.println("Qual a sua idade?");
		byte idade = scanner.nextByte();
		
		Pessoa pessoa = new Pessoa(nome, idade);
		
		Sistema.verificarValor(pessoa.getIdade());
		
		scanner.close();
	}
}
