package desafios.desafioDez;

import java.util.Scanner;

import desafios.desafioDez.conversor.ConversorFloat;
import desafios.desafioDez.entidade.Pessoa;
import desafios.desafioDez.formatador.FormatadorDecimal;
import desafios.desafioDez.util.SistemaIMC;

public class DesafioDez {
		
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual o seu primeiro nome?");
		String nome = scanner.nextLine();
		
		System.out.println("Qual a sua altura?");
		String altura = scanner.next();

		System.out.println("Qual o seu peso?");
		String peso = scanner.next();
		
		//Converte altura e peso para float e aceita tanto "," quanto "."
		float alturaFloat = ConversorFloat.parseFloat(altura); 		
		float pesoFloat = ConversorFloat.parseFloat(peso);
		
	
		Pessoa pessoa = new Pessoa(nome, alturaFloat, pesoFloat);
		
		float imc = SistemaIMC.calcularIMC(pessoa.getAltura(), pessoa.getPeso());
		SistemaIMC.exibirSituacao(imc);
	
		
		//Formata altura e peso para no maximo 2 casas decimais
		float imcFormatado = FormatadorDecimal.formatarDecimal(imc);
		
		
		System.out.println("Seu IMC é: " + imcFormatado);
	
		
		scanner.close();
	}
	
}
