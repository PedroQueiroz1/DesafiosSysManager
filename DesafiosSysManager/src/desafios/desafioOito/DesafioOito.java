package desafios.desafioOito;


import java.util.Scanner;

import desafios.desafioOito.entidade.Candidato;

public class DesafioOito {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Candidato[] candidato = new Candidato[6];
		
        candidato[1] = new Candidato("Candidato 1", (byte) 1);
        candidato[2] = new Candidato("Candidato 2", (byte) 2);
        candidato[3] = new Candidato("Candidato 3", (byte) 3);
        candidato[4] = new Candidato("Candidato 4", (byte) 4);
        candidato[5] = new Candidato("Candidato 5", (byte) 5);
		
        byte num = 0;
		
		do {
				System.out.println("Escolha o número do candidato a ser votado. (De 1 a 5)");
				num = scanner.nextByte();	
			
			if(num>=1 && num<=5) {
			candidato[num].setVoto((byte) (candidato[num].getVoto() + 1));
			}else {
				System.out.println("Você selecionou um número inválido.");
			}
			
		}while(num != 0);
		
		for(Candidato c : candidato) {
			if(c != null) {
				System.out.println(c.toString());
			}
		}
		
		scanner.close();
		
	}
}
