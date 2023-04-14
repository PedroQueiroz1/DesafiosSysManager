package desafios.desafioTres;

import java.text.DecimalFormat;
import java.util.Scanner;

import desafios.desafioTres.conversor.ConversorFloat;
import desafios.desafioTres.util.Calculadora;

public class DesafioTres {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			//Entrada de dados, lê o saldo
			System.out.println("Digite o seu saldo.");
			String saldo = scanner.next();
			
			//Converte o saldo(STRING) em saldo(float) e transforma a "," em "."
			float saldoConvertido = ConversorFloat.parseFloat(saldo);
			
			//Reajusta o saldo em 5%
			float saldoReajustado = Calculadora.reajustarSaldo(saldoConvertido);
			
			//Converte o "." do saldo(float) em ","
			DecimalFormat formato = new DecimalFormat("0.00");
			String saldoFormatado = formato.format(saldoReajustado);
			
			System.out.println("Seu saldo reajustado em 5% é: R$" + saldoFormatado);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
