package desafios.desafioQuatro;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import desafios.desafioQuatro.conversor.ConversorFloat;
import desafios.desafioQuatro.formatador.FormatadorDecimal;
import desafios.desafioQuatro.util.Calculadora;
import desafios.desafioQuatro.util.ImpressoraDeSaida;

public class DesafioQuatro {

	
	
	public static void main(String[] args) {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
		//entrada de dados
		System.out.println("Digite o valor do salário mínimo.");
		String salarioMinimo = reader.readLine();
		
		
		System.out.println("Digite o valor do salário de um funcionário");
		String salarioFuncionario = reader.readLine();
		
		
		//Converte para float
		float salarioMinFloat = ConversorFloat.parseFloat(salarioMinimo);
		float salarioFuncFloat = ConversorFloat.parseFloat(salarioFuncionario);
		
		
		//Calcula a qtd de salarios
		float qtdSalariosMinimos = Calculadora.calcularQtdSalarios(salarioMinFloat, salarioFuncFloat);
		
		
		//Formata para até 2 casas decimais
		float qtdSalariosFormatado = FormatadorDecimal.formatarDecimal(qtdSalariosMinimos);
		
		
		ImpressoraDeSaida.exibirQtdSalarios(qtdSalariosFormatado);
		
		reader.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
