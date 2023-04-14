package desafios.desafioDois;

import desafios.desafioDois.util.ImpressoraDeSaida;

public class DesafioDois {

	
	public static void main(String[] args) {
	
	float numFloat1 = 8.7f;
	
	//Aqui estou adicionando o numero "7.8f"
	String numFloatString = String.valueOf(numFloat1);
	StringBuilder numFloatReverso = new StringBuilder(numFloatString);
	numFloatReverso.reverse();
	
	//Converte de StringBuilder para String
	String numFloat2String = numFloatReverso.toString();
	
	//De String para Float
	float numFloat2 = Float.parseFloat(numFloat2String);
	
	
	byte[] numsByte = {3, 5, 7};
	
	
	float mediaFloat;
	byte mediaByte;
	float somaMedia;
	float mediaTotal;
	
	
	mediaFloat = (numFloat1 + numFloat2)/2;
	mediaByte = (byte) ((numsByte[0] + numsByte[1] + numsByte[2])/3);
	somaMedia = mediaFloat + mediaByte;
	mediaTotal = (somaMedia/2);
	
	
	ImpressoraDeSaida.exibirMediaNumfloats(numFloat1, numFloat2, mediaFloat);
	ImpressoraDeSaida.exibirMediaNumBytes(numsByte[0], numsByte[1], numsByte[2], mediaByte);
	ImpressoraDeSaida.exibirSomaDasMedias(mediaFloat, mediaByte, somaMedia);
	ImpressoraDeSaida.exibirMediaTotal(mediaTotal);
	}
}