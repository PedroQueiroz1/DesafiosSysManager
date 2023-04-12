package desafios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DesafioQuatro {

	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Digite o valor do salário mínimo.");
		float salarioMinimo = scanner.nextFloat();
		
		System.out.println("Digite o valor do salário de um funcionário");
		float salarioFuncionario = scanner.nextFloat();
		
		
		float qtdSalariosMinimos = salarioFuncionario/salarioMinimo;
		
		DecimalFormat formato = new DecimalFormat("0.00");
		String qtdSalariosFormatado = formato.format(qtdSalariosMinimos);
		
		
		System.out.println("Quantidade de salários mínimos que esse funcionário recebe:\n" 
				+ qtdSalariosFormatado + " salários mínimos.");
		
		
		scanner.close();
	}
}
