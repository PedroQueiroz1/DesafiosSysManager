package desafios.desafioUm;

import java.time.format.DateTimeParseException;
import java.util.Scanner;

import desafios.desafioUm.util.Calculadora;

public class DesafioUm {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			//Entrada de dados, data de nascimento
			System.out.println("Por favor, informe a data em que você nasceu. (ex: 04/11/1998)");
			String dataDeNascimento = scanner.nextLine();
			
			//Calcula a idade em dias
			System.out.println(Calculadora.calcularIdadeEmDias(dataDeNascimento));
			
		}catch(DateTimeParseException e) {
			System.err.println("Erro ao ler a data. Por favor, informe uma data válida.");
			e.printStackTrace();
		}
	}
	
}
