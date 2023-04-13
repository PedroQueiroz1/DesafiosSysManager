package desafios.desafioNove;

import java.util.Scanner;

import desafios.desafioNove.entidade.Pessoa;

public class DesafioNove {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual o seu nome?");
		String nome = scanner.nextLine();
		
		System.out.println("Qual a sua idade?");
		byte idade = scanner.nextByte();
		
		Pessoa pessoa = new Pessoa(nome, idade);
		
		if(pessoa.getIdade()>=0 && pessoa.getIdade()<=10) {
			System.out.println("Ingresso Grátis");
		}else if(pessoa.getIdade()>=11 && pessoa.getIdade()<=15) {
			System.out.println("Valor do ingresso R$ 10,00");
		}else if(pessoa.getIdade()>=16 && pessoa.getIdade()<=20) {
			System.out.println("Valor do ingresso R$ 20,00");
		}else if(pessoa.getIdade()>=21 && pessoa.getIdade()<=59) {
			System.out.println("Valor do ingresso R$ 30,00");
		}else if(pessoa.getIdade()>59) {
			System.out.println("Valor do ingresso R$ 15,00");
		}else if(pessoa.getIdade()<0 && pessoa.getIdade()>130) {
			System.out.println("Por favor, insira uma idade válida.");
		}else {
			System.out.println("Erro desconhecido.");
		}
		
		scanner.close();
	}
}
