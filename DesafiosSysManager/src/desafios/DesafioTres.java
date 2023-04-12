package desafios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DesafioTres {

	
	
	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.println("Digite o seu saldo.");
			float saldo = scanner.nextFloat();
			
			float saldoReajustado = (saldo*5/100) + saldo;
			
			DecimalFormat formato = new DecimalFormat("0.00");
			String saldoFormatado = formato.format(saldoReajustado);
			
			System.out.println("Seu saldo reajustado em 5% é: R$" + saldoFormatado);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
