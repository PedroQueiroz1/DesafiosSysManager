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
		IntStream.range(1, 51).forEach(i -> {
			System.out.println("Pessoa " + i);
			
			System.out.print("Nome: ");
			String nome = scanner.nextLine();
			
			System.out.print("Altura: ");
			String altura = scanner.next();
			scanner.nextLine();
			
			System.out.print("Sexo: ");
			char sexo = scanner.nextLine().charAt(0);
			
			
			float alturaConvertida = ConversorFloat.parseFloat(altura);
			
			Pessoa pessoa = new Pessoa(nome, alturaConvertida, sexo);
			pessoas.add(pessoa);
		});
		
		Stream<Pessoa> streamPessoas = pessoas.stream();
		List<Pessoa> todos = streamPessoas.collect(Collectors.toList());
		
		//Exibe o resultado das pessoas cadastradas
		System.out.println("Pessoas cadastradas:");
		todos.forEach(System.out::println);
		
		//Exibe a média das alturas de cada sexo e também a menor altura encontrada e a maior altura encontrada
		System.out.println("\n\nMasculino: " 
				+ Calculadora.calcularMediaAltura(pessoas, 'M')
				+ "\n\nFeminino: " + Calculadora.calcularMediaAltura(pessoas, 'F'));
		
		scanner.close();
	}
}
