package desafios.desafioSeis;

import java.text.DecimalFormat;
import java.util.Scanner;

import desafios.desafioSeis.util.Calculadora;

public class DesafioSeis {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("0.0");
		
		
		System.out.println("Digite a largura da cerâmica.");
		float larguraCeramica = scanner.nextFloat();
		
		System.out.println("Digite o comprimento da cerâmica.");
		float comprimentoCeramica = scanner.nextFloat();
		
		System.out.println("Digite a largura do cômodo.");
		float larguraComodo = scanner.nextFloat();
		
		System.out.println("Digite o comprimento do cômodo");
		float comprimentoComodo = scanner.nextFloat();
		
		
		float tamanhoComodo = Calculadora.calculaTamanho(larguraComodo, comprimentoComodo);
		float tamanhoCeramica = Calculadora.calculaTamanho(larguraCeramica, comprimentoCeramica);
		
		
		System.out.println(" Quantidade de cerâmica necessária: "
				+ formato.format(Calculadora.calculaQtdCeramica(tamanhoComodo, tamanhoCeramica)));
		scanner.close();
	}
}
