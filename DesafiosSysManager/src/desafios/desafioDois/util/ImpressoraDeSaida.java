package desafios.desafioDois.util;

public class ImpressoraDeSaida {

	public static void exibirMediaNumfloats(float numFloat1, float numFloat2, float mediaFloat) {
	System.out.println("Média dos números '" + numFloat1 + "' e '" + numFloat2 
			+ "' é igual a: " + mediaFloat);
	}
	
	public static void exibirMediaNumBytes(byte numByte1, byte numByte2, byte numByte3, byte mediaByte) {
		System.out.println("Média dos números '" + numByte1 + "' e '" + numByte2 
				+ "' e '" + numByte3 + "' é igual a: " + mediaByte);
	}
	
	public static void exibirSomaDasMedias(float mediaFloat, byte mediaByte, float somaMedia) {
		System.out.println("Soma das médias '" + mediaFloat + "' e '" + mediaByte 
				+ "' é igual a: " + somaMedia);
	}
	
	public static void exibirMediaTotal(float mediaTotal) {
		System.out.println("Média total é igual a: " + mediaTotal);
	}
}
