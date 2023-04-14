package desafios.desafioDois;

import desafios.desafioDois.util.ImpressoraDeSaida;

public class DesafioDois {

	
	public static void main(String[] args) {
	
	float[] numsFloat = {8.7f, 7.8f};
	byte[] numsByte = {3, 5, 7};
	
	float mediaFloat;
	byte mediaByte;
	float somaMedia;
	float mediaTotal;
	
	
	mediaFloat = (numsFloat[0] + numsFloat[1])/2;
	mediaByte = (byte) ((numsByte[0] + numsByte[1] + numsByte[2])/3);
	somaMedia = mediaFloat + mediaByte;
	mediaTotal = (somaMedia/2);
	
	
	ImpressoraDeSaida.exibirMediaNumfloats(numsFloat[0], numsFloat[1], mediaFloat);
	ImpressoraDeSaida.exibirMediaNumBytes(numsByte[0], numsByte[1], numsByte[2], mediaByte);
	ImpressoraDeSaida.exibirSomaDasMedias(mediaFloat, mediaByte, somaMedia);
	ImpressoraDeSaida.exibirMediaTotal(mediaTotal);
	}
}