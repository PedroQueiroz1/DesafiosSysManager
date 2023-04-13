package desafios.desafioSete.util;

public class Sistema {
	
	
	public static float calcularMedia(float nota1, float nota2) {
		
		float media = (nota1 + nota2)/2;
		
		return media; 
	}
	
	
	public static String verificarSituacao(float media) {
		
		if(media >= 6) {
			return "aprovado!";	
		}else {
			return "reprovado!";
		}
	}
	
	
	

}
