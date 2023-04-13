package desafios.desafioNove.sistema;

public class Sistema {

	public static void verificarValor(byte idade) {
	if(idade>=0 && idade<=10) {
			System.out.println("Ingresso Grátis");
		}else if(idade>=11 && idade<=15) {
			System.out.println("Valor do ingresso R$ 10,00");
		}else if(idade>=16 && idade<=20) {
			System.out.println("Valor do ingresso R$ 20,00");
		}else if(idade>=21 && idade<=59) {
			System.out.println("Valor do ingresso R$ 30,00");
		}else if(idade>59) {
			System.out.println("Valor do ingresso R$ 15,00");
		}else if(idade<0 && idade>130) {
			System.out.println("Por favor, insira uma idade válida.");
		}else {
			System.out.println("Erro desconhecido.");
		}
	}
}
