package desafios;

public class DesafioDois {

	
	public static void main(String[] args) {
	
	float[] numfloat8 = {8.7f, 7.8f};
	byte[] numbyte = {3, 5, 7};
	
	float mediaFloat = 0;
	byte mediaByte = 0;
	float somaMedia = 0;
	float mediaTotal = 0;
	
	mediaFloat = (numfloat8[0] + numfloat8[1])/2;
	mediaByte = (byte) ((numbyte[0] + numbyte[1] + numbyte[2])/3);
	somaMedia = mediaFloat + mediaByte;
	mediaTotal = (somaMedia/2);
	
	System.out.println("Média dos números " + numfloat8[0] + " e " + numfloat8[1] 
			+ " é igual a: " + mediaFloat);
	
	System.out.println("Média dos números " + numbyte[0] + " e " + numbyte[1] 
			+ numbyte[2] + " é igual a: " + mediaByte);
	
	System.out.println("Soma das médias " + mediaFloat + " e " + mediaByte 
			+ " é igual a: " + somaMedia);
	
	System.out.println("Média total é igual a: " + mediaTotal);
		
	}
}