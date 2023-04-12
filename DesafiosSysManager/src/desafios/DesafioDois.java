package desafios;

public class DesafioDois {

	
	public static void main(String[] args) {
	
	float[] numfloat8 = {8.7f, 7.8f};
	byte[] numeros = {3, 5, 7};
	
	float mediaFloat = 0f;
	byte mediaByte = 0;
	float somaMedia = 0f;
	float mediaTotal = 0f;
	
	mediaFloat = (numfloat8[0] + numfloat8[1])/2;
	mediaByte = (byte) ((numeros[0] + numeros[1] + numeros[2])/3);
	somaMedia = mediaFloat + mediaByte;
	mediaTotal = (somaMedia/2);
	
	System.out.println("Média dos números " + numfloat8[0] + " e " + numfloat8[1] 
			+ " é igual a: " + mediaFloat);
	
	System.out.println("Média dos números " + numeros[0] + " e " + numeros[1] 
			+ numeros[2] + " é igual a: " + mediaByte);
	
	System.out.println("Soma das médias " + mediaFloat + " e " + mediaByte 
			+ " é igual a: " + somaMedia);
	
	System.out.println("Média total é igual a: " + mediaTotal);
		
	}
}
