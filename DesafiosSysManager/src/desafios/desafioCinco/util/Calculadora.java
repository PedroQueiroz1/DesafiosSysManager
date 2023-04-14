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
			
		
		Pessoa alturaMax = encontrarAlturaMax(pessoas, sexo);
		Pessoa alturaMin = encontrarAlturaMin(pessoas, sexo);
		
		
		return ImpressoraDeSaida.exibirMensagemFinal(sexo, alturaMax, alturaMin, mAlturaFormatada);
	}
	
	//Encontra a pessoa com a maior altura
	public static Pessoa encontrarAlturaMax(List<Pessoa> pessoas, char sexo) { 
	
	return pessoas.stream().filter(pessoa
			-> pessoa.getSexo() ==sexo)
			.max(Comparator.comparingDouble(Pessoa::getAltura))
			.orElse(null);
	}
	
	//Encontra a pessoa com a menor altura
	public static Pessoa encontrarAlturaMin(List<Pessoa> pessoas, char sexo) {
		
		return pessoas.stream().filter(pessoa
				-> pessoa.getSexo() == sexo)
				.min(Comparator.comparingDouble(Pessoa::getAltura))
				.orElse(null);
	}

	
}
