package desafios.desafioCinco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import desafios.desafioCinco.entidade.Pessoa;

public class DesafioCinco {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		List<Pessoa> pessoas = new ArrayList<>();
		
		System.out.println("Digite os dados de 50 pessoas: ");
		
		for(int i = 1; i<=50; i++) {
			System.out.println("Pessoa " + i);
			
			System.out.println("Nome: ");
			String nome = scanner.nextLine();
			
			System.out.println("Altura: ");
			float altura = scanner.nextFloat();
			scanner.nextLine();
			System.out.println("Sexo: ");
			char sexo = scanner.nextLine().charAt(0);
			
			Pessoa pessoa = new Pessoa(nome, altura, sexo);
			pessoas.add(pessoa);
		}
		
		Stream<Pessoa> streamPessoas = pessoas.stream();
		List<Pessoa> todos = streamPessoas.collect(Collectors.toList());
		
		System.out.println("Pessoas cadastradas:");
		todos.forEach(System.out::println);
		
		scanner.close();
	}
}
