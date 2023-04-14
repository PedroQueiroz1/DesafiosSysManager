package desafios.desafioCinco.util;

import desafios.desafioCinco.entidade.Pessoa;

public class ImpressoraDeSaida {
	
	public static String exibirMensagemFinal(char sexo, Pessoa alturaMax, Pessoa alturaMin, String mediaAltura){
		return "\nMédia das alturas do sexo [" + sexo + "]: " 
		+ mediaAltura
		+ "\nAltura máxima encontrada: " + alturaMax 
		+ "\nAltura mínima encontrada: " + alturaMin;
	}
	
}
