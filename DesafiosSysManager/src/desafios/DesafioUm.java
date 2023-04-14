package desafios;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

//Tempo total: aprox. 2h e 30minutos
public class DesafioUm {
	

	static SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	static Scanner scanner = new Scanner(System.in);

	
	//Foi preciso utilizar int pois o short vai até 89,77anos
	public static int calculadora(short anos, byte meses, byte dias) { return (anos * 365) + (meses * 30) + dias; }
	

	//Método para calcular a idade em x anos, x meses e x dias
	public static String calcularIdadeEmDias(String dataDeNascimento) {
		LocalDate nasc = LocalDate.parse(dataDeNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDate dataHoje = LocalDate.now();
		Period periodo = Period.between(nasc, dataHoje);
		
		short anos = (short) periodo.getYears();
		byte meses = (byte) periodo.getMonths();
		byte dias = (byte) periodo.getDays();
		
		return anos + " anos, " + meses + " meses e " 
		+ dias + " dias" + " são " + calculadora(anos, meses, dias) + " dias.";
	}
	
	
	public static void main(String[] args) {
		
		String dataDeNascimento = "";
		
		try {
			System.out.println("Por favor, informe a data em que você nasceu. (ex: 04/11/1998)");
			dataDeNascimento = scanner.nextLine();
			
			System.out.println(calcularIdadeEmDias(dataDeNascimento));
			
		}catch(DateTimeParseException e) {
			System.err.println("Erro ao ler a data. Por favor, informe uma data válida.");
			e.printStackTrace();
		}
	}
}
