package desafios.desafioDois;

import desafios.desafioDois.util.ImpressoraDeSaida;

public class DesafioDois {

	
	public static void main(String[] args) {
	
	float[] numFloat = {8.7f, 7.8f};
	byte[] numByte = {3, 5, 7};
	
	float mediaFloat = 0;
	byte mediaByte = 0;
	float somaMedia = 0;
	float mediaTotal = 0;
	
	
	mediaFloat = (numFloat[0] + numFloat[1])/2;
	mediaByte = (byte) ((numByte[0] + numByte[1] + numByte[2])/3);
	somaMedia = mediaFloat + mediaByte;
	mediaTotal = (somaMedia/2);
	
	
	ImpressoraDeSaida.exibirMediaNumfloats(numFloat[0], numFloat[1], mediaFloat);
	ImpressoraDeSaida.exibirMediaNumBytes(numByte[0], numByte[1], numByte[2], mediaByte);
	ImpressoraDeSaida.exibirSomaDasMedias(mediaFloat, mediaByte, somaMedia);
	ImpressoraDeSaida.exibirMediaTotal(mediaTotal);
	}
}