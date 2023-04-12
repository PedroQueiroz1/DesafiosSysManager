package desafios.desafioCinco.util;

import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.List;
import desafios.desafioCinco.entidade.Pessoa;

public class Calculadora {
	
	
	//Era float mas tive que mudar pra double por causa da função lambda... mapToFloat não funciona
	//Tenho que dividir esse método em 3 métodos diferentes?
	public static String calcularMediaAltura(List<Pessoa> pessoas, char sexo) {
		Double mediaAltura = pessoas.stream().filter(pessoa 
				-> pessoa.getSexo() == sexo)
				.mapToDouble(Pessoa::getAltura)
				.average()
				.orElse(0.0);
		
		DecimalFormat formato = new DecimalFormat("#.##");
		String mAlturaFormatada = formato.format(mediaAltura);
		
		Pessoa alturaMax = pessoas.stream().filter(pessoa
				-> pessoa.getSexo() ==sexo)
				.max(Comparator.comparingDouble(Pessoa::getAltura))
				.orElse(null);
		
		Pessoa alturaMin = pessoas.stream().filter(pessoa
				-> pessoa.getSexo() == sexo)
				.min(Comparator.comparingDouble(Pessoa::getAltura))
				.orElse(null);
		
		return "\nMédia das alturas do sexo [" + sexo + "]: " 
				+ mAlturaFormatada 
				+ "\nAltura máxima encontrada: " + alturaMax 
				+ "\nAltura mínima encontrada:" + alturaMin;
	}
	

}
