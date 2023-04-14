package desafios.desafioCinco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import desafios.desafioCinco.conversor.ConversorFloat;
import desafios.desafioCinco.entidade.Pessoa;
import desafios.desafioCinco.util.Calculadora;

public class DesafioCinco {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		List<Pessoa> pessoas = new ArrayList<>();
		
		
		System.out.println("Digite os dados de 50 pessoas: ");
		
		
		//Testando método IntStream.range() com forEach()
		//Entrada de dados
		IntStream.range(1, 4).forEach(i -> {
			System.out.println("Pessoa " + i);
			
			System.out.print("Nome: ");
			String nome = scanner.nextLine();
			
			System.out.print("Altura: ");
			String altura = scanner.next();
			scanner.nextLine();
			
			System.out.print("Sexo: ");
			char sexo = Character.toUpperCase(scanner.nextLine().charAt(0));
			
			
			float alturaConvertida = ConversorFloat.parseFloat(altura);
			
			
			Pessoa pessoa = new Pessoa(nome, alturaConvertida, sexo);
			pessoas.add(pessoa);
		});
		
		//Media geral
		// ERRO
		float mediaGeral = (Float.parseFloat(Calculadora.calcularMediaAltura(pessoas, 'M')) + Float.parseFloat(Calculadora.calcularMediaAltura(pessoas, 'F')))/2;
		
		
		Stream<Pessoa> streamPessoas = pessoas.stream();
		List<Pessoa> todos = streamPessoas.collect(Collectors.toList());
		
		
		//Exibe o resultado das pessoas cadastradas
		System.out.println("\n\nPessoas cadastradas:");
		todos.forEach(System.out::println);
		
		
		
		
		//Exibe a média das alturas de cada sexo e também a menor altura encontrada e a maior altura encontrada
		System.out.println("\n\nMasculino: " 
				+ Calculadora.calcularMediaAltura(pessoas, 'M')
				+ "\n\nFeminino: " + Calculadora.calcularMediaAltura(pessoas, 'F'));
		
		//Exibe a média das alturas incluindo todos
		System.out.println("Media geral: " + mediaGeral);
		
		scanner.close();
	}
}
