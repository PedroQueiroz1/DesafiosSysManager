package desafios.desafioDez.util;

public class SistemaIMC {

	
	public static float calcularIMC(float altura, float peso) {
		return (peso/(altura*altura));
	}
	
	public static void exibirSituacao(float imc){
		
		if(imc < 17) {
			System.out.println("Muito abaixo do peso");
		}else if(imc >= 17 && imc <= 18.49) {
			System.out.println("Abaixo do peso");
		}else if(imc >= 18.5 && imc <= 24.99) {
			System.out.println("Peso normal");
		}else if(imc >= 25 && imc <= 29.99) {
			System.out.println("Acima do peso");
		}else if(imc >= 30 && imc <= 34.99) {
			System.out.println("Obesidade I");
		}else if(imc >= 35 && imc <= 39.99) {
			System.out.println("Obesidade II (severa)");
		}else if(imc >= 40) {
			System.out.println("Obesidade III (mórbida)");
		}else {
			System.out.println("Erro desconhecido.");
		}
	}
	
}
