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

//byte idadeInformada = scanner.nextByte();

/*
// -------- Método para calcular a idade em meses
 
public static int calcularIdadeEmMeses(String dataDeNascimento) {
Date dataHoje = new Date();
Date meses = null;

try {
	meses = formato.parse(dataDeNascimento);
} catch(Exception e) {
	e.printStackTrace();
}

Calendar dataCalendar = Calendar.getInstance();
dataCalendar.setTime(dataHoje);

Calendar dataNascCalendar = Calendar.getInstance();
dataNascCalendar.setTime(meses);

int diferencaAnos = dataCalendar.get(Calendar.YEAR) - dataNascCalendar.get(Calendar.YEAR);
int diferencaMeses = dataCalendar.get(Calendar.MONTH) - dataNascCalendar.get(Calendar.MONTH);
int resultado = (diferencaAnos * 12) + diferencaMeses;

return resultado;
}

// --------- Método para calcular a idade em dias
public static int calcularIdadeEmDias(String dataDeNascimento) {
	
	Date dataHoje = new Date();
	Date dataDeNascimentoDATE = null;
	
	try {
		dataDeNascimentoDATE = formato.parse(dataDeNascimento);
	} catch(Exception e) {
		e.printStackTrace();
	}
	
	long calcularDiferenca = dataHoje.getTime() - dataDeNascimentoDATE.getTime();
	int idadeEmDias = (int) (calcularDiferenca / (24 * 60 * 60 * 1000));
	
	return idadeEmDias;
}

Date data = null;

try {
	data = formato.parse(dataDeNascimento);
	System.out.println(data);
	
} catch (Exception e) {
	System.out.println(
			"Não consegui calcular! Por favor, tente novamente e informe a data corretamente dessa vez.");
	e.printStackTrace();
}*/