package desafios.desafioQuatro.conversor;

public class ConversorFloat {

	public static float parseFloat(String entrada) {
		entrada = entrada.replace(",", "."); // O programa só aceita receber float com "."
		
		float valor = 0;
		try {
			valor = Float.parseFloat(entrada);
		}catch(NumberFormatException e) {
			System.out.println("Valor inválido...");
			e.printStackTrace();
		}
		
		return valor;
	}
	
}
