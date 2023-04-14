package desafios.desafioUm;

import java.time.format.DateTimeParseException;
import java.util.Scanner;

import desafios.desafioUm.util.Calculadora;

//Tempo total: aprox. 2h e 30minutos
public class DesafioUm {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.println("Por favor, informe a data em que você nasceu. (ex: 04/11/1998)");
			String dataDeNascimento = scanner.nextLine();
			
			System.out.println(Calculadora.calcularIdadeEmDias(dataDeNascimento));
			
		}catch(DateTimeParseException e) {
			System.err.println("Erro ao ler a data. Por favor, informe uma data válida.");
			e.printStackTrace();
		}
	}
	
}
