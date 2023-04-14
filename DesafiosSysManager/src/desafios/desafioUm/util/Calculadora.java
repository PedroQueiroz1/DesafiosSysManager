package desafios.desafioUm.util;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Calculadora {
	
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
	
}
