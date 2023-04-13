package desafios.desafioDez;

import java.util.Scanner;

import desafios.desafioDez.util.SistemaIMC;

public class DesafioDez {
		
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual o seu nome?");
		String nome = scanner.nextLine();
		
		System.out.println("Qual a sua altura?");
		float altura = scanner.nextFloat();
		
		System.out.println("Qual o seu peso?");
		float peso = scanner.nextFloat();
		
		
		float imc = SistemaIMC.calcularIMC(altura, peso);
		SistemaIMC.exibirSituacao(imc);
		
		System.out.println("Seu IMC é: " + imc);
	}
}
