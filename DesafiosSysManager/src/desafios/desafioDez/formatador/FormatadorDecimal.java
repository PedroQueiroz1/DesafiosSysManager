package desafios.desafioDez.formatador;

import java.text.DecimalFormat;

import desafios.desafioDez.conversor.ConversorFloat;

public class FormatadorDecimal {
	
	public static float formatarDecimal(float num) {
		DecimalFormat formata = new DecimalFormat();
		
		formata.setMaximumFractionDigits(2);
		
		String numFormatado = formata.format(num);
		
		float numFormatadoFloat = ConversorFloat.parseFloat(numFormatado);
		
		return numFormatadoFloat;
	}

}
